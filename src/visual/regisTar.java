package visual;
import clases.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class regisTar extends JFrame {

	private JPanel contentPane;
	private JTextField txt_noTar;
	private JTextField txt_cvv;
	private JTextField txt_mes;
	private JTextField txt_sald;
	private JTextField txt_an;
	private usuario user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		usuario user=new usuario();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regisTar frame = new regisTar(user,"","","","","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public regisTar(usuario user,String nombre,String direccion,String edad, String username, String pin) {
		super("Registrar Tarjeta");
		this.user=user;
		setIconImage(Toolkit.getDefaultToolkit().getImage(registrar.class.getResource("/icons/vecIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 592);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNoTarjeta = new JLabel("No. Tarjeta:");
		lblNoTarjeta.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoTarjeta.setForeground(Color.WHITE);
		lblNoTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoTarjeta.setBounds(139, 226, 99, 20);
		contentPane.add(lblNoTarjeta);
		this.repaint();
		txt_noTar = new JTextField();
		txt_noTar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if ((txt_noTar.getText().length()+1)%5==0 && txt_noTar.getText().length()<19) {
						String cad=txt_noTar.getText();
						txt_noTar.setText(cad+" ");
					}
					if(txt_noTar.getText().length() >= 19) {
						e.consume();
					}
				}
			}
		});
		txt_noTar.setHorizontalAlignment(JTextField.CENTER);
		txt_noTar.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_noTar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_noTar.setBounds(237, 228, 339, 20);
		contentPane.add(txt_noTar);
		txt_noTar.setColumns(10);
		setLocationRelativeTo(null);
		
		JLabel lblCvv = new JLabel("CVV:");
		lblCvv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvv.setForeground(Color.WHITE);
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCvv.setBounds(160, 271, 68, 16);
		contentPane.add(lblCvv);
		
		txt_cvv = new JTextField();
		txt_cvv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(txt_cvv.getText().length() >= 3) {
						e.consume();
					}
				}
			}
		});
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_cvv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_cvv.setColumns(10);
		txt_cvv.setBounds(237, 271, 339, 20);
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_cvv);
		
		txt_mes = new JTextField();
		txt_mes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(txt_mes.getText().length() >= 2) {
						e.consume();
					}
				}
			}
		});
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_mes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_mes.setColumns(10);
		txt_mes.setBounds(320, 315, 68, 20);
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_mes);
		
		txt_sald = new JTextField();
		txt_sald.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(txt_sald.getText().length() >= 9) {
						e.consume();
					}
				}
			}
		});
		txt_sald.setHorizontalAlignment(JTextField.CENTER);
		txt_sald.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_sald.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_sald.setColumns(10);
		txt_sald.setBounds(283, 367, 224, 20);
		txt_sald.setHorizontalAlignment(JTextField.CENTER);
		txt_sald.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_sald);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(txt_noTar.getText()).equals("") && !(txt_cvv.getText()).equals("") && !(txt_mes.getText()).equals("")
						&& !(txt_an.getText()).equals("") && !(txt_sald.getText()).equals("")) {
					if(txt_noTar.getText().length()==19) {
						if(txt_cvv.getText().length()==3) {
							if(txt_mes.getText().length()==2 && txt_an.getText().length()==2) {
								if(Integer.parseInt(txt_mes.getText())>0 && Integer.parseInt(txt_mes.getText())<=12) {
									if(Integer.parseInt(txt_an.getText())>20) {
										tarjeta tarje = new tarjeta(txt_noTar.getText(), Integer.parseInt(txt_cvv.getText()), 
												txt_mes.getText(), Integer.parseInt(txt_an.getText()), Float.parseFloat(txt_sald.getText()));
										user.setTarjeta(tarje);
										JOptionPane.showMessageDialog(null,"Tarjeta registrada con exito","",JOptionPane.INFORMATION_MESSAGE);
										new registrar(user,nombre,direccion,edad,username,pin).setVisible(true);
										dispose();
									}else {
										JOptionPane.showMessageDialog(null,"Anio invalido","", JOptionPane.WARNING_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null,"Mes invalido","", JOptionPane.WARNING_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null,"Tanto el mes como el ano deben tener 2 digitos","", JOptionPane.WARNING_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null,"El cvv debe tener 3 digitos","", JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null,"La tarjeta debe tener 16 digitos","", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(301, 434, 159, 39);
		contentPane.add(btnNewButton);
		
		JLabel jlabel_tar = new JLabel("");
		jlabel_tar.setBounds(301, 50, 150, 150);
		contentPane.add(jlabel_tar);
		setLocationRelativeTo(null);
		
		ImageIcon logo = new ImageIcon("src/icons/tarjetaLogo2.png");
		Icon icono1 = new ImageIcon(logo.getImage().getScaledInstance(jlabel_tar.getWidth(),
				jlabel_tar.getHeight(),Image.SCALE_DEFAULT));
		jlabel_tar.setIcon(icono1);
		this.repaint();
		setLocationRelativeTo(null);
		
		JLabel lblFechaDeExpiracion = new JLabel("Fecha de expiracion:");
		lblFechaDeExpiracion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeExpiracion.setForeground(Color.WHITE);
		lblFechaDeExpiracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeExpiracion.setBounds(123, 309, 187, 29);
		contentPane.add(lblFechaDeExpiracion);
		
		JLabel lblSaldo = new JLabel("Saldo:  $");
		lblSaldo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaldo.setForeground(Color.WHITE);
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaldo.setBounds(202, 367, 80, 16);
		contentPane.add(lblSaldo);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(375, 316, 46, 16);
		contentPane.add(lblNewLabel_1);
		
		
		ImageIcon wallpaper = new ImageIcon("src/icons/504.jpg");
		
		txt_an = new JTextField();
		txt_an.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(txt_an.getText().length() >= 2) {
						e.consume();
					}
				}
			}
		});
		txt_an.setHorizontalAlignment(JTextField.CENTER);
		txt_an.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_an.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_an.setColumns(10);
		txt_an.setBounds(410, 315, 68, 20);
		contentPane.add(txt_an);
		
		JButton botonAtras = new JButton("Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new registrar(user,nombre,direccion,edad,username,pin).setVisible(true);
				dispose();
			}
		});
		botonAtras.setBorder(null);
		botonAtras.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		botonAtras.setForeground(Color.WHITE);
		botonAtras.setBackground(new Color(153, 153, 255));
		botonAtras.setBounds(10, 11, 89, 23);
		contentPane.add(botonAtras);
		
		JLabel lblmes = new JLabel("(mes)");
		lblmes.setHorizontalAlignment(SwingConstants.LEFT);
		lblmes.setForeground(Color.WHITE);
		lblmes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmes.setBounds(340, 335, 34, 16);
		contentPane.add(lblmes);
		
		JLabel lblanio = new JLabel("(anio)");
		lblanio.setHorizontalAlignment(SwingConstants.LEFT);
		lblanio.setForeground(Color.WHITE);
		lblanio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblanio.setBounds(430, 337, 34, 16);
		contentPane.add(lblanio);
		
		JLabel jlabel_wallp = new JLabel();
		jlabel_wallp.setBounds(0, 0, 719,555);
		contentPane.add(jlabel_wallp);
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallp.getWidth(),
				jlabel_wallp.getHeight(),Image.SCALE_DEFAULT));
		jlabel_wallp.setIcon(icono);
		this.repaint();
	}
	
	public usuario getUser() {
		return user;
	}
}