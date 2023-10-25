package visual;
import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class userModif extends JFrame {

	private JPanel contentPane;
	private JTextField txt_comp;
	private usuario user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario user=new usuario();
					userModif frame = new userModif(user);
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
	public userModif(usuario user) {
		super("Datos de usuario");
		this.user=user;
		String userName=user.getUsername();
		setIconImage(Toolkit.getDefaultToolkit().getImage(registrar.class.getResource("/icons/vecIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 592);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Modificar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(283, 27, 148, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(112, 258, 68, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextField Nombre = new JTextField();
		Nombre.setText(user.getNombre());
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
		capEdad.setText(Integer.toString(user.getEdad()));
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
		capDirecc.setText(user.getDireccion());
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
		capUser.setText(user.getUsername());
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
		capUser.setBounds(299, 380, 127, 20);
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
		lblNewLabel_1_1_2.setBounds(205, 380, 84, 16);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("PIN:");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(254, 418, 35, 16);
		contentPane.add(lblNewLabel_1_1_3);
		
		JTextField contra = new JTextField();
		contra.setText(Integer.toString(user.getPin()));
		contra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}else {
					if(contra.getText().length() >= 4) {
						e.consume();
					}
				}
			}
		});
		contra.setHorizontalAlignment(JTextField.CENTER);
		contra.setFont(new Font("Arial", Font.PLAIN, 15));
		contra.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contra.setBounds(299, 418, 127, 20);
		contentPane.add(contra);
		
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
		
		JButton RegitraDatBoton = new JButton("Guardar cambios");
		RegitraDatBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Nombre.getText()).equals("") && !(capDirecc.getText()).equals("") &&
						!(capEdad.getText()).equals("") && !(capUser.getText()).equals("") &&
						!(contra.getText()).equals("")) {
					if(Integer.parseInt(capEdad.getText())>0 && Integer.parseInt(capEdad.getText())<=100) {
						if(contra.getText().length()==4) {
							if(capUser.getText().length()>=3) {
								if((user.getUsername()).equals(capUser.getText())) {
									user.modifUser(Nombre.getText(), capUser.getText(),Integer.parseInt(contra.getText()),
											Integer.parseInt(capEdad.getText()),capDirecc.getText());
									try{
										File fichero = new File("src/usuarios/"+user.getUsername()+".obj");										
										FileOutputStream fichero1= new FileOutputStream(fichero);
										ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
										escribir.writeObject(user);
										escribir.close();
										fichero1.close();
										JOptionPane.showMessageDialog(null,"Usuario modificado con exito","",JOptionPane.INFORMATION_MESSAGE);
										new userDat(user).setVisible(true);
										dispose();
									}catch(IOException ex){
										JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
									}
								}else {
									File archivo = new File("src/usuarios/"+capUser.getText()+".obj");
									if (!archivo.exists()) {
										File borrar = new File(userName+"obj");
										if(borrar.delete()) {
											JOptionPane.showMessageDialog(null,"Fichero eliminado","", JOptionPane.INFORMATION_MESSAGE);
										}else {
											JOptionPane.showMessageDialog(null,"No se pudo borrar el fichero","", JOptionPane.WARNING_MESSAGE);
										}
										user.modifUser(Nombre.getText(), capUser.getText(),Integer.parseInt(contra.getText()),
												Integer.parseInt(capEdad.getText()),capDirecc.getText());
										try{
											File fichero = new File("src/usuarios/"+user.getUsername()+".obj");										
											FileOutputStream fichero1= new FileOutputStream(fichero);
											ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
											escribir.writeObject(user);
											escribir.close();
											fichero1.close();
											JOptionPane.showMessageDialog(null,"Usuario modificado con exito","",JOptionPane.INFORMATION_MESSAGE);
											new userDat(user).setVisible(true);
											dispose();
										}catch(IOException ex){
											JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
										}
									}else {
										JOptionPane.showMessageDialog(null,"El Usuario que intenta registrar ya existe","", JOptionPane.WARNING_MESSAGE);
									}
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
		RegitraDatBoton.setFont(new Font("Dialog", Font.BOLD, 13));
		RegitraDatBoton.setForeground(Color.BLACK);
		RegitraDatBoton.setBackground(Color.ORANGE);
		RegitraDatBoton.setBounds(306, 477, 120, 35);
		contentPane.add(RegitraDatBoton);
		this.repaint();
		this.repaint();
		
		JButton botonAtras = new JButton("Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new userDat(user).setVisible(true);
				dispose();
			}
		});
		botonAtras.setBorder(null);
		botonAtras.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		botonAtras.setForeground(Color.WHITE);
		botonAtras.setBackground(new Color(153, 153, 255));
		botonAtras.setBounds(10, 11, 89, 23);
		contentPane.add(botonAtras);
		this.repaint();
		setLocationRelativeTo(null);

		ImageIcon wallpaper = new ImageIcon("src/icons/504.jpg");
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Compras realizadas:");
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_4.setBounds(303, 330, 157, 24);
		contentPane.add(lblNewLabel_1_1_4);
		
		JTextField txt_comp = new JTextField();
		txt_comp.setText(Integer.toString(user.getCompras()));
		txt_comp.setEditable(false);
		txt_comp.setHorizontalAlignment(SwingConstants.CENTER);
		txt_comp.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_comp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_comp.setBounds(470, 330, 61, 24);
		contentPane.add(txt_comp);
		
		JLabel jlabel_wallp = new JLabel();
		jlabel_wallp.setBounds(0, 0, 719,555);
		contentPane.add(jlabel_wallp);
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallp.getWidth(),
				jlabel_wallp.getHeight(),Image.SCALE_DEFAULT));
		jlabel_wallp.setIcon(icono);
		
	}

}