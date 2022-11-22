package TicTacToe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Toolkit;

public class Tictac {
	boolean turno;
	private JFrame frmTresRayas;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictac window = new Tictac();
					window.frmTresRayas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tictac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTresRayas = new JFrame();
		frmTresRayas.setIconImage(Toolkit.getDefaultToolkit().getImage(Tictac.class.getResource("/TicTacToe/kisspng-tic-tac-toe-multiplayer-tictactoe-draughts-game-mi-tictactoe-5b1fb75dacb8f9.5133120415288052137075.png")));
		frmTresRayas.setFont(new Font("Dialog", Font.PLAIN, 20));
		frmTresRayas.setTitle("Tres rayas");
		frmTresRayas.setMinimumSize(new Dimension(600, 800));
		frmTresRayas.setBounds(100, 100, 601, 806);
		frmTresRayas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTresRayas.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmTresRayas.getContentPane().add(panel, BorderLayout.NORTH);
		
		btnNewButton_10 = new JButton("Salir");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setFocusable(false);
		btnNewButton_10.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
			
		});
		panel.add(btnNewButton_10);
		
		separator_2 = new JSeparator();
		panel.add(separator_2);
		
		separator_3 = new JSeparator();
		panel.add(separator_3);
	
		
		
		lblNewLabel = new JLabel("TICTACTOE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		panel.add(lblNewLabel);
		
		
		separator = new JSeparator();
		panel.add(separator);
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setFocusable(false);
		btnNewButton_9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setLabel("");
				btnNewButton_1.setLabel("");
				btnNewButton_2.setLabel("");
				btnNewButton_3.setLabel("");
				btnNewButton_4.setLabel("");
				btnNewButton_5.setLabel("");
				btnNewButton_6.setLabel("");
				btnNewButton_7.setLabel("");
				btnNewButton_8.setLabel("");

			}
		});
		
		separator_1 = new JSeparator();
		panel.add(separator_1);
		panel.add(btnNewButton_9);
		
		panel_1 = new JPanel();
		frmTresRayas.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton.setLabel("x");	
					turno=true;
				}else {
					btnNewButton.setLabel("O");
					turno=false;
				}
						}
		});
		panel_1.add(btnNewButton);
		
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_1.setLabel("x");
					turno=true;
				}else {
					btnNewButton_1.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_3.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_3.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_4.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_4.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_4);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_6.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_6.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_6);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_2.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_2.setLabel("O");
					turno=false;
				}
			}
		});
		panel_1.add(btnNewButton_2);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_5.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_5.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_5);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_7.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_7.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turno==false) {
					btnNewButton_8.setLabel("x");	
					turno=true;
				}else {
					btnNewButton_8.setLabel("O");
					turno=false;
				}			}
		});
		panel_1.add(btnNewButton_8);
			}
	

}