package en4Raya;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Tablero {
	boolean jugador, c1Rellena, c2Rellena, c3Rellena, c4Rellena, c5Rellena, c6Rellena, c7Rellena;
	int c1 []=new int [5];
	int c2 []=new int [5];
	int c3 []=new int [5];
	int c4 []=new int [5];
	int c5 []=new int [5];
	int c6 []=new int [5];
	int c7 []=new int [5];
	private JFrame frame;
	private JButton C1F1;
	private JButton C1F2;
	private JButton C7F1;
	private JButton C2F1;
	private JButton C3F1;
	private JButton C5F1;
	private JButton C4F1;
	private JButton C6F1;
	private JButton C3F2;
	private JButton C2F2;
	private JButton C4F2;
	private JButton C5F2;
	private JButton C6F2;
	private JButton C7F2;
	private JButton C1F3;
	private JButton C3F3;
	private JButton C2F3;
	private JButton C4F3;
	private JButton C5F3;
	private JButton C7F3;
	private JButton C6F3;
	private JButton C1F4;
	private JButton C2F4;
	private JButton C3F4;
	private JButton C4F4;
	private JButton C5F4;
	private JButton C6F4;
	private JButton C1F5;
	private JButton C7F4;
	private JButton C2F5;
	private JButton C3F5;
	private JButton C4F5;
	private JButton C5F5;
	private JButton C6F5;
	private JButton C7F5;
	private JMenuBar menuBar;
	private JButton Nada;
	private JPanel panel;
	private JButton Salir;
	private JTextField txtConecta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablero() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 716, 472);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(new GridLayout(5, 5, 0, 0));
		
		C1F1 = new JButton("");
		C1F1.setForeground(new Color(255, 255, 255));
		C1F1.setBackground(new Color(0, 0, 0));
		C1F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1F1.setFocusable(false);
		C1F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC1(donde(c1));
			}
		});
		getFrame().getContentPane().add(C1F1);
		
		
		C2F1 = new JButton("");
		C2F1.setBackground(new Color(0, 0, 0));
		C2F1.setForeground(new Color(255, 255, 255));
		C2F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C2F1.setFocusable(false);
		C2F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC2(donde(c2));
			}
		});
		getFrame().getContentPane().add(C2F1);
		
		C3F1 = new JButton("");
		C3F1.setBackground(new Color(0, 0, 0));
		C3F1.setForeground(new Color(255, 255, 255));
		C3F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3F1.setFocusable(false);
		C3F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC3(donde(c3));
			}
		});
		getFrame().getContentPane().add(C3F1);
		
		C4F1 = new JButton("");
		C4F1.setBackground(new Color(0, 0, 0));
		C4F1.setForeground(new Color(255, 255, 255));
		C4F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C4F1.setFocusable(false);
		C4F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC4(donde(c4));
			}
		});
		getFrame().getContentPane().add(C4F1);
		
		C5F1 = new JButton("");
		C5F1.setBackground(new Color(0, 0, 0));
		C5F1.setForeground(new Color(255, 255, 255));
		C5F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C5F1.setFocusable(false);
		C5F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC5(donde(c5));
			}
		});
		getFrame().getContentPane().add(C5F1);
		
		C6F1 = new JButton("");
		C6F1.setBackground(new Color(0, 0, 0));
		C6F1.setForeground(new Color(255, 255, 255));
		C6F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C6F1.setFocusable(false);
		C6F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC6(donde(c6));
			}
		});
		getFrame().getContentPane().add(C6F1);
		
		C7F1 = new JButton("");
		C7F1.setBackground(new Color(0, 0, 0));
		C7F1.setForeground(new Color(255, 255, 255));
		C7F1.setFocusable(false);
		C7F1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C7F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC7(donde(c7));
			}
		});
		getFrame().getContentPane().add(C7F1);
		
		C1F2 = new JButton("");
		C1F2.setBackground(new Color(0, 0, 0));
		C1F2.setForeground(new Color(255, 255, 255));
		C1F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1F2.setFocusable(false);
		C1F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC1(donde(c1));
			}
		});
		getFrame().getContentPane().add(C1F2);
		
		C2F2 = new JButton("");
		C2F2.setBackground(new Color(0, 0, 0));
		C2F2.setForeground(new Color(255, 255, 255));
		C2F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C2F2.setFocusable(false);
		C2F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC2(donde(c2));
			}
		});
		getFrame().getContentPane().add(C2F2);
		
		C3F2 = new JButton("");
		C3F2.setBackground(new Color(0, 0, 0));
		C3F2.setForeground(new Color(255, 255, 255));
		C3F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3F2.setFocusable(false);
		C3F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC3(donde(c3));
			}
		});
		getFrame().getContentPane().add(C3F2);
		
		C4F2 = new JButton("");
		C4F2.setBackground(new Color(0, 0, 0));
		C4F2.setForeground(new Color(255, 255, 255));
		C4F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C4F2.setFocusable(false);
		C4F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC4(donde(c4));
			}
		});
		getFrame().getContentPane().add(C4F2);
		
		C5F2 = new JButton("");
		C5F2.setBackground(new Color(0, 0, 0));
		C5F2.setForeground(new Color(255, 255, 255));
		C5F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C5F2.setFocusable(false);
		C5F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC5(donde(c5));
			}
		});
		getFrame().getContentPane().add(C5F2);
		
		C6F2 = new JButton("");
		C6F2.setBackground(new Color(0, 0, 0));
		C6F2.setForeground(new Color(255, 255, 255));
		C6F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C6F2.setFocusable(false);
		C6F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC6(donde(c6));
			}
		});
		getFrame().getContentPane().add(C6F2);
		
		C7F2 = new JButton("");
		C7F2.setBackground(new Color(0, 0, 0));
		C7F2.setForeground(new Color(255, 255, 255));
		C7F2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C7F2.setFocusable(false);
		C7F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC7(donde(c7));
			}
		});
		getFrame().getContentPane().add(C7F2);
		
		C1F3 = new JButton("");
		C1F3.setBackground(new Color(0, 0, 0));
		C1F3.setForeground(new Color(255, 255, 255));
		C1F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1F3.setFocusable(false);
		C1F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC1(donde(c1));
			}
		});
		getFrame().getContentPane().add(C1F3);
		
		C2F3 = new JButton("");
		C2F3.setBackground(new Color(0, 0, 0));
		C2F3.setForeground(new Color(255, 255, 255));
		C2F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C2F3.setFocusable(false);
		C2F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC2(donde(c2));
			}
		});
		getFrame().getContentPane().add(C2F3);
		
		C3F3 = new JButton("");
		C3F3.setBackground(new Color(0, 0, 0));
		C3F3.setForeground(new Color(255, 255, 255));
		C3F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3F3.setFocusable(false);
		C3F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC3(donde(c3));
			}
		});
		getFrame().getContentPane().add(C3F3);
		
		C4F3 = new JButton("");
		C4F3.setBackground(new Color(0, 0, 0));
		C4F3.setForeground(new Color(255, 255, 255));
		C4F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C4F3.setFocusable(false);
		C4F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC4(donde(c4));
			}
		});
		getFrame().getContentPane().add(C4F3);
		
		C5F3 = new JButton("");
		C5F3.setBackground(new Color(0, 0, 0));
		C5F3.setForeground(new Color(255, 255, 255));
		C5F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C5F3.setFocusable(false);
		C5F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC5(donde(c5));
			}
		});
		getFrame().getContentPane().add(C5F3);
		
		C6F3 = new JButton("");
		C6F3.setBackground(new Color(0, 0, 0));
		C6F3.setForeground(new Color(255, 255, 255));
		C6F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C6F3.setFocusable(false);
		C6F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC6(donde(c6));
			}
		});
		getFrame().getContentPane().add(C6F3);
		
		C7F3 = new JButton("");
		C7F3.setBackground(new Color(0, 0, 0));
		C7F3.setForeground(new Color(255, 255, 255));
		C7F3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C7F3.setFocusable(false);
		C7F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC7(donde(c7));
			}
		});
		getFrame().getContentPane().add(C7F3);
		
		C1F4 = new JButton("");
		C1F4.setBackground(new Color(0, 0, 0));
		C1F4.setForeground(new Color(255, 255, 255));
		C1F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1F4.setFocusable(false);
		C1F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC1(donde(c1));
			}
		});
		getFrame().getContentPane().add(C1F4);
		
		C2F4 = new JButton("");
		C2F4.setBackground(new Color(0, 0, 0));
		C2F4.setForeground(new Color(255, 255, 255));
		C2F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C2F4.setFocusable(false);
		C2F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC2(donde(c2));
			}
		});
		getFrame().getContentPane().add(C2F4);
		
		C3F4 = new JButton("");
		C3F4.setBackground(new Color(0, 0, 0));
		C3F4.setForeground(new Color(255, 255, 255));
		C3F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3F4.setFocusable(false);
		C3F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC3(donde(c3));
			}
		});
		getFrame().getContentPane().add(C3F4);
		
		C4F4 = new JButton("");
		C4F4.setBackground(new Color(0, 0, 0));
		C4F4.setForeground(new Color(255, 255, 255));
		C4F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C4F4.setFocusable(false);
		C4F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC4(donde(c4));
			}
		});
		getFrame().getContentPane().add(C4F4);
		
		C5F4 = new JButton("");
		C5F4.setBackground(new Color(0, 0, 0));
		C5F4.setForeground(new Color(255, 255, 255));
		C5F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C5F4.setFocusable(false);
		C5F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC5(donde(c5));
			}
		});
		getFrame().getContentPane().add(C5F4);
		
		C6F4 = new JButton("");
		C6F4.setBackground(new Color(0, 0, 0));
		C6F4.setForeground(new Color(255, 255, 255));
		C6F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C6F4.setFocusable(false);
		C6F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC6(donde(c6));
			}
		});
		getFrame().getContentPane().add(C6F4);
		
		C7F4 = new JButton("");
		C7F4.setBackground(new Color(0, 0, 0));
		C7F4.setForeground(new Color(255, 255, 255));
		C7F4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C7F4.setFocusable(false);
		C7F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC7(donde(c7));
			}
		});
		getFrame().getContentPane().add(C7F4);
		
		C1F5 = new JButton("");
		C1F5.setBackground(new Color(0, 0, 0));
		C1F5.setForeground(new Color(255, 255, 255));
		C1F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C1F5.setFocusable(false);
		C1F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC1(donde(c1));
			}
		});
		getFrame().getContentPane().add(C1F5);
		
		C2F5 = new JButton("");
		C2F5.setBackground(new Color(0, 0, 0));
		C2F5.setForeground(new Color(255, 255, 255));
		C2F5.setFocusable(false);
		C2F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C2F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC2(donde(c2));
			}
		});
		getFrame().getContentPane().add(C2F5);
		
		C3F5 = new JButton("");
		C3F5.setBackground(new Color(0, 0, 0));
		C3F5.setForeground(new Color(255, 255, 255));
		C3F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C3F5.setFocusable(false);
		C3F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC3(donde(c3));
			}
		});
		getFrame().getContentPane().add(C3F5);
		
		C4F5 = new JButton("");
		C4F5.setBackground(new Color(0, 0, 0));
		C4F5.setForeground(new Color(255, 255, 255));
		C4F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C4F5.setFocusable(false);
		C4F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC4(donde(c4));
			}
		});
		getFrame().getContentPane().add(C4F5);
		
		C5F5 = new JButton("");
		C5F5.setBackground(new Color(0, 0, 0));
		C5F5.setForeground(new Color(255, 255, 255));
		C5F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C5F5.setFocusable(false);
		C5F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC5(donde(c5));
			}
		});
		getFrame().getContentPane().add(C5F5);
		
		C6F5 = new JButton("");
		C6F5.setBackground(new Color(0, 0, 0));
		C6F5.setForeground(new Color(255, 255, 255));
		C6F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C6F5.setFocusable(false);
		C6F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC6(donde(c6));
			}
		});
		getFrame().getContentPane().add(C6F5);
		
		C7F5 = new JButton("");
		C7F5.setBackground(new Color(0, 0, 0));
		C7F5.setForeground(new Color(255, 255, 255));
		C7F5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		C7F5.setFocusable(false);
		C7F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarC7(donde(c7));
			}
		});
		getFrame().getContentPane().add(C7F5);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		Nada = new JButton("Salir");
		Nada.setBackground(new Color(0, 0, 0));
		Nada.setForeground(new Color(255, 255, 255));
		Nada.setFocusable(false);
		Nada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				Tablero.this.frame.setVisible(false);
			}
		});
		menuBar.add(Nada);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		menuBar.add(panel);
		
		txtConecta = new JTextField();
		txtConecta.setHorizontalAlignment(SwingConstants.CENTER);
		txtConecta.setFocusable(false);
		txtConecta.setForeground(new Color(255, 255, 255));
		txtConecta.setBackground(new Color(0, 0, 0));
		txtConecta.setEditable(false);
		txtConecta.setText("Conecta 4 :)");
		panel.add(txtConecta);
		txtConecta.setColumns(10);
		
		Salir = new JButton("Reset");
		Salir.setForeground(new Color(255, 255, 255));
		Salir.setFocusable(false);
		Salir.setBackground(new Color(0, 0, 0));
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Tablero window = new Tablero();
					window.getFrame().setVisible(true);
					frame.setVisible(false);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				Tablero.this.frame.setVisible(false);
			}
		});
		menuBar.add(Salir);
	}

	public int donde(int [] tabla) {
		int a=0;
		for (int i=0; i<tabla.length;i++) {
			if(tabla[i]==0) {
				a=i;
				tabla[i]=-1;
				break;
			}
		}
		return a;
	}
	public void rellenarC1(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c1Rellena) {
			switch(numero) {
			case 0: 
				C1F5.setLabel(player);
				break;
			case 1:
				C1F4.setLabel(player);
				break;
			case 2: 
				C1F3.setLabel(player);
				break;
			case 3: 
				C1F2.setLabel(player);
				break;
			case 4: 
				C1F1.setLabel(player);
				c1Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC2(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c1Rellena) {
			switch(numero) {
			case 0: 
				C2F5.setLabel(player);
				break;
			case 1:
				C2F4.setLabel(player);
				break;
			case 2: 
				C2F3.setLabel(player);
				break;
			case 3: 
				C2F2.setLabel(player);
				break;
			case 4: 
				C2F1.setLabel(player);
				c2Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC3(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c3Rellena) {
			switch(numero) {
			case 0: 
				C3F5.setLabel(player);
				break;
			case 1:
				C3F4.setLabel(player);
				break;
			case 2: 
				C3F3.setLabel(player);
				break;
			case 3: 
				C3F2.setLabel(player);
				break;
			case 4: 
				C3F1.setLabel(player);
				c3Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC4(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c4Rellena) {
			switch(numero) {
			case 0: 
				C4F5.setLabel(player);
				break;
			case 1:
				C4F4.setLabel(player);
				break;
			case 2: 
				C4F3.setLabel(player);
				break;
			case 3: 
				C4F2.setLabel(player);
				break;
			case 4: 
				C4F1.setLabel(player);
				c4Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC5(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c5Rellena) {
			switch(numero) {
			case 0: 
				C5F5.setLabel(player);
				break;
			case 1:
				C5F4.setLabel(player);
				break;
			case 2: 
				C5F3.setLabel(player);
				break;
			case 3: 
				C5F2.setLabel(player);
				break;
			case 4: 
				C5F1.setLabel(player);
				c5Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC6(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c6Rellena) {
			switch(numero) {
			case 0: 
				C6F5.setLabel(player);
				break;
			case 1:
				C6F4.setLabel(player);
				break;
			case 2: 
				C6F3.setLabel(player);
				break;
			case 3: 
				C6F2.setLabel(player);
				break;
			case 4: 
				C6F1.setLabel(player);
				c6Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}
	public void rellenarC7(int numero) {
		String player="X";
		if (jugador) {
			player="O";
		}
		if(!c7Rellena) {
			switch(numero) {
			case 0: 
				C7F5.setLabel(player);
				break;
			case 1:
				C7F4.setLabel(player);
				break;
			case 2: 
				C7F3.setLabel(player);
				break;
			case 3: 
				C7F2.setLabel(player);
				break;
			case 4: 
				C7F1.setLabel(player);
				c7Rellena=true;
				break;
			}
		}
		if (jugador) {
			jugador=false;
		}else {
			jugador=true;
		}
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.setUndecorated(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
