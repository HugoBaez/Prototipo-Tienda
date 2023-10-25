package visual;
import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class userDat extends JFrame {

	private JPanel contentPane;
	private JTextField txt_comp;
	private usuario user;
	private JTextField txt_pin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario user=new usuario();
					userDat frame = new userDat(user);
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
	public userDat(usuario user) {
		super("Datos de usuario");
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
		
		JLabel lblNewLabel = new JLabel("Mis datos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(292, 29, 148, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(112, 258, 68, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextField Nombre = new JTextField();
		Nombre.setText(user.getNombre());
		Nombre.setEditable(false);
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
		capEdad.setEditable(false);
		capEdad.setHorizontalAlignment(JTextField.CENTER);
		capEdad.setFont(new Font("Arial", Font.PLAIN, 15));
		capEdad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capEdad.setBounds(190, 330, 61, 24);
		contentPane.add(capEdad);
		
		JTextField capDirecc = new JTextField();
		capDirecc.setText(user.getDireccion());
		capDirecc.setEditable(false);
		capDirecc.setHorizontalAlignment(JTextField.CENTER);
		capDirecc.setFont(new Font("Arial", Font.PLAIN, 15));
		capDirecc.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capDirecc.setBounds(190, 293, 341, 24);
		contentPane.add(capDirecc);
		
		JTextField capUser = new JTextField();
		capUser.setText(user.getUsername());
		capUser.setEditable(false);
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
		
		JPasswordField contra = new JPasswordField();
		contra.setText(Integer.toString(user.getPin()));
		contra.setEditable(false);
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
		
		JButton RegitraDatBoton = new JButton("Modificar datos");
		RegitraDatBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new userModif(user).setVisible(true);
				dispose();
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
				new Main(user).setVisible(true);
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
		this.repaint();
		
		JTextField txt_comp = new JTextField();
		txt_comp.setText(Integer.toString(user.getCompras()));
		txt_comp.setEditable(false);
		txt_comp.setHorizontalAlignment(SwingConstants.CENTER);
		txt_comp.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_comp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_comp.setBounds(470, 330, 61, 24);
		contentPane.add(txt_comp);
		
		txt_pin = new JTextField();
		txt_pin.setText(Integer.toString(user.getPin()));
		txt_pin.setHorizontalAlignment(SwingConstants.CENTER);
		txt_pin.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_pin.setEditable(false);
		txt_pin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_pin.setBounds(299, 418, 127, 20);
		contentPane.add(txt_pin);
		
		JButton botMpin = new JButton("Mostrar");
		botMpin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contra.isVisible()==true) {
					txt_pin.setVisible(true);
					contra.setVisible(false);
					botMpin.setText("Ocultar");
				}else {
					txt_pin.setVisible(false);
					contra.setVisible(true);
					botMpin.setText("Mostrar");
				}
			}
		});
		botMpin.setForeground(Color.WHITE);
		botMpin.setFont(new Font("Arial Narrow", Font.PLAIN, 10));
		botMpin.setBorder(null);
		botMpin.setBackground(new Color(153, 153, 255));
		botMpin.setBounds(431, 419, 61, 16);
		contentPane.add(botMpin);
		
		JLabel jlabel_wallp = new JLabel();
		jlabel_wallp.setBounds(0, 0, 719,555);
		contentPane.add(jlabel_wallp);
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallp.getWidth(),
				jlabel_wallp.getHeight(),Image.SCALE_DEFAULT));
		jlabel_wallp.setIcon(icono);
		
	}
}