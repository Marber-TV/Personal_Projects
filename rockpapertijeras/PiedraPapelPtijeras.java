package rockpapertijeras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class PiedraPapelPtijeras {
	int jugador=0;
	int enemigo=0;
	int perdidas=0;
	int ganadas=0;
	boolean jugada;
	private JFrame frame;
	private JPanel ARRIBA;
	private JPanel ABAJO;
	private JButton DeNuevo;
	private JButton Salir;
	private JLabel Info;
	private JLabel p2;
	private JButton piedra;
	private JButton papel;
	private JButton tijera;
	private JPanel arribaArriba;
	private JLabel win;
	private JLabel lost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiedraPapelPtijeras window = new PiedraPapelPtijeras();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PiedraPapelPtijeras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 950, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ARRIBA = new JPanel();
		
		ABAJO = new JPanel();
		ABAJO.setBackground(new Color(255, 255, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(ABAJO, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
				.addComponent(ARRIBA, GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(ARRIBA, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ABAJO, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
		);
		ABAJO.setLayout(new GridLayout(0, 3, 0, 0));
		
		piedra = new JButton("");
		piedra.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		piedra.setContentAreaFilled(false);
		piedra.setFocusable(false);
		piedra.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/piedra.png")));
		piedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jugada==false) {
					jugador=1;
					Turno();
					}
					jugada=true;	
				
			}
		});
		ABAJO.add(piedra);
		
		papel = new JButton("");
		papel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jugada==false) {
				jugador=2;
				Turno();
				}
				jugada=true;	
			}
		});
		papel.setFocusable(false);
		papel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		papel.setContentAreaFilled(false);
		papel.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/papel.png")));
		ABAJO.add(papel);
		
		tijera = new JButton("");
		tijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jugada==false) {
					jugador=3;
					Turno();
					}
					jugada=true;	
				
			}
		});
		tijera.setFocusable(false);
		tijera.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tijera.setContentAreaFilled(false);
		tijera.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/tijeras.png")));
		ABAJO.add(tijera);
		ARRIBA.setLayout(new BorderLayout(0, 0));
		
		DeNuevo = new JButton("De nuevo");
		DeNuevo.setFocusable(false);
		DeNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.setIcon(null);
				jugada=false;
				jugador=0;
				enemigo=0;
				Info.setText("Piedra, Papel o Tijeras??");
			}
		});
		DeNuevo.setContentAreaFilled(false);
		DeNuevo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ARRIBA.add(DeNuevo, BorderLayout.EAST);
		
		Salir = new JButton("Salir");
		Salir.setFocusable(false);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setContentAreaFilled(false);
		Salir.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ARRIBA.add(Salir, BorderLayout.WEST);
		
		Info = new JLabel("Piedra, Papel o Tijeras??");
		Info.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Info.setHorizontalAlignment(SwingConstants.CENTER);
		ARRIBA.add(Info, BorderLayout.SOUTH);
		
		p2 = new JLabel("");
		p2.setBackground(new Color(255, 255, 255));
		p2.setHorizontalAlignment(SwingConstants.CENTER);
		ARRIBA.add(p2, BorderLayout.CENTER);
		
		arribaArriba = new JPanel();
		ARRIBA.add(arribaArriba, BorderLayout.NORTH);
		arribaArriba.setLayout(new GridLayout(0, 2, 0, 0));
		
		win = new JLabel("Ganadas");
		win.setHorizontalAlignment(SwingConstants.CENTER);
		arribaArriba.add(win);
		
		lost = new JLabel("Perdidas");
		lost.setHorizontalAlignment(SwingConstants.CENTER);
		arribaArriba.add(lost);
		frame.getContentPane().setLayout(groupLayout);
	}
	public void Turno() {
		enemigo= (int) (Math.random()*3+1);
		try {
			Thread.sleep(100);
			p2.setText("La cpu ha elegido");
			Thread.sleep(100);
			p2.setText(null);
			if(enemigo==1) {
				p2.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/piedra.png")));
			}else if(enemigo==2) {
				p2.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/papel.png")));
			}else {
				p2.setIcon(new ImageIcon(PiedraPapelPtijeras.class.getResource("/rockpapertijeras/tijeras.png")));
			}
			
			if(jugador==1&&enemigo==1) {
				Info.setText("Empate");
			}else if(jugador==1&&enemigo==2) {
				Info.setText("Perdiste");
				perdidas++;
				lost.setText(Integer.toString(perdidas));
			}else if(jugador==1&&enemigo==3) {
				Info.setText("Ganaste");
				ganadas++;
				win.setText(Integer.toString(ganadas));
			}else if(jugador==2&&enemigo==1) {
				Info.setText("Ganaste");
				ganadas++;
				win.setText(Integer.toString(ganadas));
			}else if(jugador==2&&enemigo==2) {
				Info.setText("Empate");
			}else if(jugador==2&&enemigo==3) {
				Info.setText("Perdiste");
				perdidas++;
				lost.setText(Integer.toString(perdidas));
			}else if(jugador==3&&enemigo==1) {
				Info.setText("Perdiste");
				perdidas++;
				lost.setText(Integer.toString(perdidas));
			}else if(jugador==3&&enemigo==2) {
				Info.setText("Ganaste");
				ganadas++;
				win.setText(Integer.toString(ganadas));
			}else if(jugador==3&&enemigo==3) {
				Info.setText("Empate");
			}
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
