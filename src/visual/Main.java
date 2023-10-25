package visual;
import clases.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
//import javax.swing.border.MatteBorder;

//import Animacion.Animacion;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class Main extends JFrame {

	private JPanel contentPane;
	private usuario user;
	private mostrarCE mostrar;
	JScrollPane scrollpaneles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		usuario user=new usuario();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main(user);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Main(usuario user) {
		super("Vector's Boing");
		this.user=user;
		setIconImage(Toolkit.getDefaultToolkit().getImage(registrar.class.getResource("/icons/vecIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		ImageIcon casa = new ImageIcon("src/icons/casa.png");
		Icon casi = new ImageIcon(casa.getImage().getScaledInstance(25,
				25,Image.SCALE_DEFAULT));
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(0, 153, 204));
		pnlMenu.setBounds(-214, 78, 198, 605);
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		setLocationRelativeTo(null);

		ImageIcon usuari = new ImageIcon("src/icons/usuario-de-perfil.png");
		
		ImageIcon flechaDer= new ImageIcon("src/icons/flechaDer.png");
		Icon menui = new ImageIcon(flechaDer.getImage().getScaledInstance(50,
				50,Image.SCALE_DEFAULT));
		ImageIcon flechaIz= new ImageIcon("src/icons/flechaIzq.png");
		Icon izq = new ImageIcon(flechaIz.getImage().getScaledInstance(50,
				50,Image.SCALE_DEFAULT));
		
		JButton btnRopa_1 = new JButton("Ropa");
		btnRopa_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRopa_1.setFont(new Font("Dialog", Font.BOLD, 22));
		btnRopa_1.setIcon(new ImageIcon(Main.class.getResource("/icons/camiseta.png")));
		btnRopa_1.setBounds(12, 82, 173, 51);
		btnRopa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.this.dispose();
				mostrarRO mostrar = new mostrarRO();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		
		pnlMenu.add(btnRopa_1);
		btnRopa_1.setForeground(Color.BLACK);
		btnRopa_1.setBackground(new Color(255, 204, 0));
		
		JButton btnLblanca = new JButton("Linea Blanca");
		btnLblanca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLblanca.setFont(new Font("Dialog", Font.BOLD, 16));
		btnLblanca.setBounds(12, 168, 173, 51);
		btnLblanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.this.dispose();
				mostrarLB3 mostrar = new mostrarLB3();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		pnlMenu.add(btnLblanca);
		btnLblanca.setForeground(new Color(0, 0, 0));
		btnLblanca.setBackground(new Color(255, 204, 0));
		btnLblanca.setIcon(new ImageIcon(Main.class.getResource("/icons/electrodomestico.png")));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(161, 125, 33, 15);
		pnlMenu.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnCelulares = new JButton("Celulares");
		btnCelulares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mostrarCE(user).setVisible(true);
				dispose();
			}
		});
		btnCelulares.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCelulares.setFont(new Font("Dialog", Font.BOLD, 18));
		btnCelulares.setIcon(new ImageIcon(Main.class.getResource("/icons/telefono-inteligente.png")));
		btnCelulares.setForeground(Color.BLACK);
		btnCelulares.setBackground(new Color(255, 204, 0));
		btnCelulares.setBounds(12, 253, 173, 51);
		pnlMenu.add(btnCelulares);
		
		JButton btnCompu = new JButton("Computo");
		btnCompu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCompu.setFont(new Font("Dialog", Font.BOLD, 18));
		btnCompu.setIcon(new ImageIcon(Main.class.getResource("/icons/puesto-de-trabajo.png")));
		btnCompu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.this.dispose();
				mostrarCO mostrar = new mostrarCO();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		btnCompu.setForeground(Color.BLACK);
		btnCompu.setBackground(new Color(255, 204, 0));
		btnCompu.setBounds(12, 336, 173, 51);
		pnlMenu.add(btnCompu);
		
		JButton btnGames = new JButton("Consolas");
		btnGames.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGames.setFont(new Font("Dialog", Font.BOLD, 18));
		btnGames.setIcon(new ImageIcon(Main.class.getResource("/icons/consola.png")));
		btnGames.setIcon(new ImageIcon(Main.class.getResource("/icons/consola.png")));
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.this.dispose();
				mostrarCON mostrar = new mostrarCON();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		btnGames.setForeground(Color.BLACK);
		btnGames.setBackground(new Color(255, 204, 0));
		btnGames.setBounds(12, 419, 173, 51);
		pnlMenu.add(btnGames);
		
		JLabel lblNewLabel = new JLabel("Categorías");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 173, 40);
		pnlMenu.add(lblNewLabel);
		setLocationRelativeTo(null);

		ImageIcon iconi = new ImageIcon("src/icons/vector final.png");
		/*btnMdatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Main.this.dispose();
				userDat iniciar = new userDat();
				iniciar.setVisible(true);
			}
		});*/
		
		JButton btn_men = new JButton();
		btn_men.setIcon(menui);
		btn_men.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_men.setBorderPainted(false);
		btn_men.setContentAreaFilled(false);
		btn_men.setBackground(new Color(0, 102, 204));
		btn_men.setBounds(0, 0, 79,79);
		btn_men.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int posicion = pnlMenu.getX();
				if (posicion > -214) {
					btn_men.setIcon(menui);
					Animacion.Animacion.mover_izquierda(0, -214, 2, 2, pnlMenu);
				}
				else {
					btn_men.setIcon(izq);
					Animacion.Animacion.mover_derecha(-214, 0, 2, 2, pnlMenu);
				}
			}
		});
		
		JPanel panelMperfil = new JPanel();
		panelMperfil.setBackground(new Color(0, 153, 204));
		panelMperfil.setBounds(1081, 78, 184, 236);
		contentPane.add(panelMperfil);
		panelMperfil.setLayout(null);
		
		JButton btnMdatos = new JButton("Mis datos");
		btnMdatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new userDat(user).setVisible(true);
				dispose();
			}
		});
		btnMdatos.setIcon(new ImageIcon(Main.class.getResource("/icons/carnet-de-identidad.png")));
		btnMdatos.setFont(new Font("Dialog", Font.BOLD, 13));
		btnMdatos.setForeground(Color.BLACK);
		btnMdatos.setBackground(new Color(255, 204, 0));
		btnMdatos.setBorderPainted(false);
		btnMdatos.setBounds(0, 12, 180, 33);
		panelMperfil.add(btnMdatos);
		
				JButton btnMpago = new JButton("Tarjeta");
				btnMpago.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(user.gettieTarje()==true) {
							menuTar tarje = new menuTar(user);
							tarje.setVisible(true);
							dispose();
						}else {
							new regisTar2(user).setVisible(true);
							dispose();
						}
					}
				});
				btnMpago.setIcon(new ImageIcon(Main.class.getResource("/icons/secure-payment (1).png")));
				btnMpago.setFont(new Font("Dialog", Font.BOLD, 13));
				btnMpago.setForeground(Color.BLACK);
				btnMpago.setToolTipText("Formas de pago");
				btnMpago.setBorderPainted(false);
				btnMpago.setBackground(new Color(255, 204, 0));
				btnMpago.setBounds(0, 57, 180, 33);
				panelMperfil.add(btnMpago);
				
				JButton btnCsesion = new JButton("Historial compras");
				btnCsesion.setIcon(new ImageIcon(Main.class.getResource("/icons/shopping-history.png")));
				btnCsesion.setFont(new Font("Dialog", Font.BOLD, 13));
				btnCsesion.setForeground(Color.BLACK);
				btnCsesion.setBorderPainted(false);
				btnCsesion.setBackground(new Color(255, 204, 0));
				btnCsesion.setBounds(0, 102, 180, 33);
				panelMperfil.add(btnCsesion);
				
				JButton btnSesion = new JButton("Cerrar Sesion");
				btnSesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerra sesion?", "Confirmar cerrar sesion", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
						if (resp == 0) {
							Main.this.dispose();
							Loggin iniciar = new Loggin();
							iniciar.setVisible(true);
						}
						else {
							Animacion.Animacion.mover_derecha(896, 1081, 1, 1, panelMperfil);
						}
					}
				});
				btnSesion.setIcon(new ImageIcon(Main.class.getResource("/icons/cerrar-sesion.png")));
				btnSesion.setFont(new Font("Dialog", Font.BOLD, 13));
				btnSesion.setForeground(Color.BLACK);
				btnSesion.setBorderPainted(false);
				btnSesion.setBackground(new Color(255, 204, 0));
				btnSesion.setBounds(0, 147, 180, 33);
				panelMperfil.add(btnSesion);
				
				JButton btnSalir = new JButton("Salir");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
						if (resp == 0) {
							System.exit(0);
						}
						else {
							Animacion.Animacion.subir(110, -250, 1, 1, panelMperfil);
						}
					}
				});
				btnSalir.setIcon(new ImageIcon(Main.class.getResource("/icons/colocarse (1).png")));
				btnSalir.setFont(new Font("Dialog", Font.BOLD, 13));
				btnSalir.setForeground(Color.BLACK);
				btnSalir.setBorderPainted(false);
				btnSalir.setBackground(new Color(255, 204, 0));
				btnSalir.setBounds(0, 192, 180, 33);
				panelMperfil.add(btnSalir);
		contentPane.add(btn_men);
		setLocationRelativeTo(null);
							
							JButton btnMperfil = new JButton(user.getUsername());
							btnMperfil.setContentAreaFilled(false);
							btnMperfil.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									int posicion = panelMperfil.getX();
									if (posicion > 1080) {
										Animacion.Animacion.mover_izquierda(1081, 896, 1, 1, panelMperfil);
									}
									else {
										Animacion.Animacion.mover_derecha(896, 1081, 1, 1, panelMperfil);
									}
								}
							});
							btnMperfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnMperfil.setHorizontalTextPosition(SwingConstants.CENTER);
							btnMperfil.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
							btnMperfil.setBorderPainted(false);
							btnMperfil.setBackground(new Color(0, 102, 204));
							btnMperfil.setForeground(Color.WHITE);
							btnMperfil.setBounds(942, 0, 133, 77);
							contentPane.add(btnMperfil);
							
							JPanel panel = new JPanel();
							panel.setBackground(new Color(0, 102, 204));
							panel.setBounds(0, 0, 1080, 79);
							contentPane.add(panel);
							panel.setLayout(null);
							
							JButton btnNewButton = new JButton("");
							btnNewButton.setPressedIcon(new ImageIcon(Main.class.getResource("/icons/carro_agr.png")));
							btnNewButton.setBounds(788, 11, 111, 66);
							panel.add(btnNewButton);
							btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnNewButton.setBorderPainted(false);
							btnNewButton.setRolloverIcon(new ImageIcon(Main.class.getResource("/icons/carro_agr.png")));
							btnNewButton.setIcon(new ImageIcon(Main.class.getResource("/icons/carrofin.png")));
							btnNewButton.setContentAreaFilled(false);
							btnNewButton.setBorder(null);
							
									JLabel jlabel_log = new JLabel();
									jlabel_log.setBounds(75, -1, 127, 78);
									panel.add(jlabel_log);
									Icon icone = new ImageIcon(iconi.getImage().getScaledInstance(jlabel_log.getWidth(),
											jlabel_log.getHeight(),Image.SCALE_DEFAULT));
									jlabel_log.setIcon(icone);
									
										JLabel jlabel_user = new JLabel();
										jlabel_user.setBounds(896, 17, 45, 45);
										panel.add(jlabel_user);
										Icon ico = new ImageIcon(usuari.getImage().getScaledInstance(jlabel_user.getWidth(),
												jlabel_user.getHeight(),Image.SCALE_DEFAULT));
										jlabel_user.setIcon(ico);
												
												JLabel lblNewLabel_2 = new JLabel("New label");
												lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/icons/fridai.jpg")));
												lblNewLabel_2.setBounds(0, 78, 1080, 605);
												contentPane.add(lblNewLabel_2);
	}
}
