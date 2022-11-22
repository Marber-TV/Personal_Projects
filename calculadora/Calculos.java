package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Calculos {
	boolean valor1 = false, valor2 = false, valor3 = false, valor4 = false, valor5 = false, valor6 = false,
			valor7 = false, valor8 = false, valor9 = false, valor0;
	float numeroInicial = 0;
	boolean inicial = true;
	float numeroInicial2 = 0;
	boolean inicial2;
	int power = 0;
	float numeroResultado = 0;
	boolean suma;
	boolean resta;
	boolean multiplicar;
	boolean dividir;
	boolean elevar;
	int operaciones=0;
	private JFrame frmCalculadoraDePablo;
	private JPanel ResultadoPane;
	private JPanel BotonesPane;
	private JButton Boton1;
	private JButton Boton4;
	private JButton Boton6;
	private JButton Boton2;
	private JButton Boton3;
	private JButton Suma;
	private JButton Boton5;
	private JButton Boton7;
	private JButton Boton8;
	private JButton Reset;
	private JButton Boton9;
	private JButton Igual;
	private JLabel Resultado;
	private JButton Resta;
	private JButton btnNewButton_1;
	private JButton Multpilicar;
	private JButton Boton0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos window = new Calculos();
					window.frmCalculadoraDePablo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDePablo = new JFrame();
		frmCalculadoraDePablo.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculadoraDePablo.setBackground(new Color(255, 255, 255));
		frmCalculadoraDePablo.setFont(new Font("Calisto MT", Font.PLAIN, 12));
		frmCalculadoraDePablo.setForeground(new Color(0, 0, 0));
		frmCalculadoraDePablo.setTitle("Calculadora de Pablo");
		frmCalculadoraDePablo.setBounds(100, 100, 644, 806);
		frmCalculadoraDePablo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ResultadoPane = new JPanel();
		ResultadoPane.setBackground(new Color(0, 0, 0));

		BotonesPane = new JPanel();
		BotonesPane.setBackground(new Color(0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frmCalculadoraDePablo.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(ResultadoPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
				.addComponent(BotonesPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(ResultadoPane, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(BotonesPane, GroupLayout.PREFERRED_SIZE, 627, GroupLayout.PREFERRED_SIZE)));
		ResultadoPane.setLayout(new BorderLayout(0, 0));

		Resultado = new JLabel("0");
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		Resultado.setForeground(new Color(255, 128, 0));
		ResultadoPane.add(Resultado, BorderLayout.CENTER);
		BotonesPane.setLayout(new GridLayout(4, 4, 0, 0));

		Boton1 = new JButton("1");
		Boton1.setContentAreaFilled(false);
		Boton1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton1.setBackground(new Color(0, 0, 0));
		Boton1.setForeground(new Color(255, 128, 0));
		Boton1.setFocusable(false);
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = true;
				Addnumero();
				valor1 = false;
			}
		});
		BotonesPane.add(Boton1);

		Boton2 = new JButton("2");
		Boton2.setContentAreaFilled(false);
		Boton2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton2.setBackground(new Color(0, 0, 0));
		Boton2.setForeground(new Color(255, 128, 0));
		Boton2.setFocusable(false);
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = true;
				Addnumero();
				valor2 = false;
			}
		});
		BotonesPane.add(Boton2);

		Boton3 = new JButton("3");
		Boton3.setContentAreaFilled(false);
		Boton3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton3.setBackground(new Color(0, 0, 0));
		Boton3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton3.setForeground(new Color(255, 128, 0));
		Boton3.setFocusable(false);
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor3 = true;
				Addnumero();
				valor3 = false;
			}
		});
		BotonesPane.add(Boton3);

		Reset = new JButton("Reset");
		Reset.setContentAreaFilled(false);
		Reset.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Reset.setBackground(new Color(0, 0, 0));
		Reset.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Reset.setForeground(new Color(255, 128, 0));
		Reset.setFocusable(false);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeroInicial = 0;
				numeroInicial2 = 0;
				numeroResultado = 0;
				power = 0;
				inicial = true;
				inicial2 = false;
				suma=false;
				dividir=false;
				resta=false;
				multiplicar=false;
				operaciones=0;
				Resultado.setText("0");
			}
		});
		BotonesPane.add(Reset);

		Boton4 = new JButton("4");
		Boton4.setBackground(new Color(0, 0, 0));
		Boton4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton4.setContentAreaFilled(false);
		Boton4.setForeground(new Color(255, 128, 0));
		Boton4.setFocusable(false);
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor4 = true;
				Addnumero();
				valor4 = false;
			}
		});
		BotonesPane.add(Boton4);

		Boton5 = new JButton("5");
		Boton5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton5.setContentAreaFilled(false);
		Boton5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton5.setBackground(new Color(0, 0, 0));
		Boton5.setForeground(new Color(255, 128, 0));
		Boton5.setFocusable(false);
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor5 = true;
				Addnumero();
				valor5 = false;
			}
		});
		BotonesPane.add(Boton5);

		Boton6 = new JButton("6");
		Boton6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton6.setContentAreaFilled(false);
		Boton6.setBackground(new Color(0, 0, 0));
		Boton6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton6.setForeground(new Color(255, 128, 0));
		Boton6.setFocusable(false);
		Boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor6 = true;
				Addnumero();
				valor6 = false;
			}
		});
		BotonesPane.add(Boton6);

		Suma = new JButton("+");
		Suma.setContentAreaFilled(false);
		Suma.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Suma.setBackground(new Color(0, 0, 0));
		Suma.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Suma.setForeground(new Color(255, 128, 0));
		Suma.setFocusable(false);
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicial = false;
				inicial2 = true;
				power = 0;
				Resultado.setText("0");
				suma=true;
			}
		});
		BotonesPane.add(Suma);

		Boton7 = new JButton("7");
		Boton7.setBackground(new Color(0, 0, 0));
		Boton7.setContentAreaFilled(false);
		Boton7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton7.setForeground(new Color(255, 128, 0));
		Boton7.setFocusable(false);
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor7 = true;
				Addnumero();
				valor7 = false;
			}
		});
		BotonesPane.add(Boton7);

		Boton8 = new JButton("8");
		Boton8.setContentAreaFilled(false);
		Boton8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton8.setBackground(new Color(0, 0, 0));
		Boton8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton8.setForeground(new Color(255, 128, 0));
		Boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor8 = true;
				Addnumero();
				valor8 = false;
			}
		});
		Boton8.setFocusable(false);
		BotonesPane.add(Boton8);

		Boton9 = new JButton("9");
		Boton9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton9.setBackground(new Color(0, 0, 0));
		Boton9.setContentAreaFilled(false);
		Boton9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Boton9.setForeground(new Color(255, 128, 0));
		Boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor9 = true;
				Addnumero();
				valor9 = false;
			}
		});
		Boton9.setFocusable(false);
		BotonesPane.add(Boton9);
		
		Resta = new JButton("-");
		Resta.setContentAreaFilled(false);
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicial = false;
				inicial2 = true;
				power = 0;
				Resultado.setText("0");
				resta=true;
			}
		});
		Resta.setForeground(new Color(255, 128, 0));
		Resta.setFocusable(false);
		Resta.setBackground(new Color(0, 0, 0));
		Resta.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Resta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		BotonesPane.add(Resta);
		
		Boton0 = new JButton("0");
		Boton0.setContentAreaFilled(false);
		Boton0.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Boton0.setBackground(new Color(0, 0, 0));
		Boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = true;
				Addnumero();
				valor0 = false;
			}
		});
		Boton0.setForeground(new Color(255, 128, 0));
		Boton0.setFocusable(false);
		Boton0.setFont(new Font("Tahoma", Font.PLAIN, 50));
		BotonesPane.add(Boton0);
		
		Multpilicar = new JButton("X");
		Multpilicar.setContentAreaFilled(false);
		Multpilicar.setFocusable(false);
		Multpilicar.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Multpilicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicial = false;
				inicial2 = true;
				power = 0;
				Resultado.setText("0");
				multiplicar=true;
			}
		});
		Multpilicar.setForeground(new Color(255, 128, 0));
		Multpilicar.setBackground(new Color(0, 0, 0));
		Multpilicar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BotonesPane.add(Multpilicar);
		
				Igual = new JButton("=");
				Igual.setContentAreaFilled(false);
				Igual.setBackground(new Color(0, 0, 0));
				Igual.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				Igual.setFocusable(false);
				Igual.setFont(new Font("Tahoma", Font.PLAIN, 50));
				Igual.setForeground(new Color(255, 128, 0));
				Igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(operaciones==0) {
							if(suma==true) {
								numeroResultado = numeroInicial + numeroInicial2;
							Resultado.setText(String.valueOf(numeroResultado));
							}else if(resta==true) {
								numeroResultado = numeroInicial - numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}else if(multiplicar==true) {
								numeroResultado = numeroInicial * numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}else if(dividir=true) {
								numeroResultado =(float) numeroInicial / numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}
						}else {
							if(suma==true) {
								numeroResultado += numeroInicial2;
							Resultado.setText(String.valueOf(numeroResultado));
							}else if(resta==true) {
								numeroResultado -=  numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}else if(multiplicar==true) {
								numeroResultado = numeroResultado * numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}else if(dividir=true) {
								numeroResultado =(float) numeroResultado / numeroInicial2;
								Resultado.setText(String.valueOf(numeroResultado));
							}
						}
					operaciones++;
					}
				});
				
				btnNewButton_1 = new JButton("÷");
				btnNewButton_1.setContentAreaFilled(false);
				btnNewButton_1.setBackground(new Color(0, 0, 0));
				btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicial = false;
						inicial2 = true;
						power = 0;
						Resultado.setText("0");
						dividir=true;
					}
				});
				btnNewButton_1.setForeground(new Color(255, 128, 0));
				btnNewButton_1.setFocusable(false);
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
				BotonesPane.add(btnNewButton_1);
				BotonesPane.add(Igual);
		frmCalculadoraDePablo.getContentPane().setLayout(groupLayout);
	}

	public void Addnumero() {
		// Si el numero es 0
		if (valor0 == true && inicial == true) {
			if (power == 0) {
				return;
			} else {
				numeroInicial = (int) (numeroInicial *10);
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor0 == true && inicial2 == true) {
			if (power == 0) {
				return;
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 1
		if (valor1 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 1;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial + (Math.pow(10, power)));
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor1 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 1;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 + (Math.pow(10, power)));
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}
		// Si el numero es 2
		if (valor2 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 2;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=2;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor2 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 2;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=2;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}
		// Si el numero es 3
		if (valor3 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 3;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=3;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor3 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 3;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=3;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}
		// Si el numero es 4
		if (valor4 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 4;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=4;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor4 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 4;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=4;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 5
		if (valor5 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 5;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=5;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor5 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 5;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=5;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 6
		if (valor6 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 6;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=6;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor6 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 6;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=6;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 7
		if (valor7 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 7;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=7;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor7 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 7;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=7;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 8
		if (valor8 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 8;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=8;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor8 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 8;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=8;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}

		// Si el numero es 9
		if (valor9 == true && inicial == true) {
			if (power == 0) {
				numeroInicial = 9;
				Resultado.setText(String.valueOf(numeroInicial));
			} else {
				numeroInicial = (int) (numeroInicial *10);
				numeroInicial+=9;
				Resultado.setText(String.valueOf(numeroInicial));
			}
		} else if (valor9 == true && inicial2 == true) {
			if (power == 0) {
				numeroInicial2 = 9;
				Resultado.setText(String.valueOf(numeroInicial2));
			} else {
				numeroInicial2 = (int) (numeroInicial2 *10);
				numeroInicial2+=9;
				Resultado.setText(String.valueOf(numeroInicial2));
			}
		}
		//+1 porque ya no es el primer valor que añadimos
		power++;
	}
}