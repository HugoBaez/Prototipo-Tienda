package visual;
import clases.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import clases.*;

import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class registrar extends JFrame {

	private JPanel contentPane;
	private JPasswordField capPin;
	private JTextField textField;
	private usuario user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		usuario user=new usuario();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrar frame = new registrar(user,"","","","","");
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
	public registrar(usuario user,String nombre,String direccion,String edad, String username, String pin) {
		super("Sign in");
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
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(209, 29, 294, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(112, 258, 68, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextField Nombre = new JTextField();
		Nombre.setText(nombre);
		Nombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Nombre.getText().length() >= 80) {
					e.consume();
				}
			}
		});
		Nombre.setFont(new Font("Arial", Font.PLAIN, 15));
		Nombre.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Nombre.setHorizontalAlignment(JTextField.CENTER);
		Nombre.setBounds(190, 258, 341, 24);
		contentPane.add(Nombre);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Edad:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(135, 332, 45, 16);
		contentPane.add(lblNewLabel_1_1);
		this.repaint();
		
		JTextField capEdad = new JTextField();
		capEdad.setText(edad);
		capEdad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(capEdad.getText().length() >= 3) {
						e.consume();
					}
				}
			}
		});
		capEdad.setHorizontalAlignment(JTextField.CENTER);
		capEdad.setFont(new Font("Arial", Font.PLAIN, 15));
		capEdad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capEdad.setBounds(190, 330, 61, 24);
		contentPane.add(capEdad);
		
		JTextField capDirecc = new JTextField();
		capDirecc.setText(direccion);
		capDirecc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(capDirecc.getText().length() >= 80) {
					e.consume();
				}
			}
		});
		capDirecc.setHorizontalAlignment(JTextField.CENTER);
		capDirecc.setFont(new Font("Arial", Font.PLAIN, 15));
		capDirecc.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capDirecc.setBounds(190, 293, 341, 24);
		contentPane.add(capDirecc);
		
		JTextField capUser = new JTextField();
		capUser.setText(username);
		capUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()==' ' && e.getKeyChar()!='\b') {
					e.consume();
				}
				if(capUser.getText().length() >= 15) {
					e.consume();
				}
			}
		});
		capUser.setHorizontalAlignment(JTextField.CENTER);
		capUser.setBounds(190, 380, 127, 20);
		capUser.setFont(new Font("Arial", Font.PLAIN, 15));
		capUser.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(capUser);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Direccion:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(103, 293, 77, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Username:");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(96, 380, 84, 16);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("PIN:");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(145, 418, 35, 16);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("(solo 4 digitos)");
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_4.setBounds(209, 443, 95, 16);
		contentPane.add(lblNewLabel_1_1_4);
		
		capPin = new JPasswordField();
		capPin.setText(pin);
		capPin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(capPin.getText().length() >= 4) {
						e.consume();
					}
				}
			}
		});
		capPin.setHorizontalAlignment(JTextField.CENTER);
		capPin.setFont(new Font("Arial", Font.PLAIN, 15));
		capPin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capPin.setBounds(190, 419, 127, 20);
		contentPane.add(capPin);
		
		JLabel jlabel_user = new JLabel("");
		jlabel_user.setBounds(296, 91, 130, 130);
		contentPane.add(jlabel_user);
		setLocationRelativeTo(null);
		
		ImageIcon logo = new ImageIcon("src/icons/user.png");
		Icon icono1 = new ImageIcon(logo.getImage().getScaledInstance(jlabel_user.getWidth(),
				jlabel_user.getHeight(),Image.SCALE_DEFAULT));
		jlabel_user.setIcon(icono1);
		this.repaint();
		setLocationRelativeTo(null);
		
		JButton RegistraTarBoton = new JButton("Registrar una Tarjeta");
		if (user.gettieTarje()==true) {
			RegistraTarBoton.setEnabled(false);
		}
		RegistraTarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new regisTar(user,Nombre.getText(),capDirecc.getText(),capEdad.getText(),capUser.getText(),capPin.getText()).setVisible(true);
				dispose();
			}
		});
		RegistraTarBoton.setBorder(null);
		RegistraTarBoton.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		RegistraTarBoton.setForeground(Color.WHITE);
		RegistraTarBoton.setBackground(new Color(153, 153, 255));
		RegistraTarBoton.setBounds(375, 373, 138, 35);
		contentPane.add(RegistraTarBoton);
		
		JButton RegitraDatBoton = new JButton("Finalizar");
		RegitraDatBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Nombre.getText()).equals("") && !(capDirecc.getText()).equals("") &&
						!(capEdad.getText()).equals("") && !(capUser.getText()).equals("") &&
						!(capPin.getText()).equals("")) {
					if(Integer.parseInt(capEdad.getText())>0 && Integer.parseInt(capEdad.getText())<=100) {
						if(capPin.getText().length()==4) {
							if(capUser.getText().length()>=3) {
								File archivo = new File("src/usuarios/"+capUser.getText()+".obj");
								if (!archivo.exists()) {
									user.modifUser(Nombre.getText(), capUser.getText(),Integer.parseInt(capPin.getText()),
											Integer.parseInt(capEdad.getText()),capDirecc.getText());
									try{
										File fichero = new File("src/usuarios/"+user.getUsername()+".obj");
										FileOutputStream fichero1= new FileOutputStream(fichero);
										ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
										escribir.writeObject(user);
										escribir.close();
										fichero1.close();
										JOptionPane.showMessageDialog(null,"Usuario registrado con exito","",JOptionPane.INFORMATION_MESSAGE);
										new Loggin().setVisible(true);
										dispose();
									}catch(IOException ex){
										JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null,"El Usuario que intenta registrar ya existe","", JOptionPane.WARNING_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null,"El usuario debe ser de al menos 3 carcateres","", JOptionPane.WARNING_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null,"El PIN debe tener 4 digitos","", JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null,"Edad invalida","", JOptionPane.WARNING_MESSAGE);
						capEdad.setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		RegitraDatBoton.setBorder(null);
		RegitraDatBoton.setFont(new Font("Dialog", Font.BOLD, 14));
		RegitraDatBoton.setForeground(Color.BLACK);
		RegitraDatBoton.setBackground(Color.ORANGE);
		RegitraDatBoton.setBounds(292, 487, 120, 35);
		contentPane.add(RegitraDatBoton);
		this.repaint();
		
		JButton botonAtras = new JButton("Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Loggin().setVisible(true);
				dispose();
			}
		});
		botonAtras.setBorder(null);
		botonAtras.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		botonAtras.setForeground(Color.WHITE);
		botonAtras.setBackground(new Color(153, 153, 255));
		botonAtras.setBounds(10, 11, 89, 23);
		contentPane.add(botonAtras);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("(opcional)");
		lblNewLabel_1_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_4_1.setBounds(411, 420, 68, 16);
		contentPane.add(lblNewLabel_1_1_4_1);
		this.repaint();
		
		JLabel jlabel_tarje = new JLabel("");
		jlabel_tarje.setBounds(421, 332, 45, 40);
		contentPane.add(jlabel_tarje);
		setLocationRelativeTo(null);
		
		ImageIcon tarj = new ImageIcon("src/icons/tarjetalogo.png");
		Icon icono2 = new ImageIcon(tarj.getImage().getScaledInstance(jlabel_tarje.getWidth(),
				jlabel_tarje.getHeight(),Image.SCALE_DEFAULT));
		jlabel_tarje.setIcon(icono2);
		this.repaint();
		
		JLabel jlabel_wallp = new JLabel();
		jlabel_wallp.setBounds(0, 0, 719,555);
		contentPane.add(jlabel_wallp);
		setLocationRelativeTo(null);

		ImageIcon wallpaper = new ImageIcon("src/icons/504.jpg");
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallp.getWidth(),
				jlabel_wallp.getHeight(),Image.SCALE_DEFAULT));
		jlabel_wallp.setIcon(icono);
		
	}
	
}
