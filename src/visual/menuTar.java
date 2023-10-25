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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class menuTar extends JFrame {

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario user=new usuario();
					menuTar frame = new menuTar(user);
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
	public menuTar(usuario user) {
		super("Datos de tarjeta");
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
		
		JLabel lblNewLabel = new JLabel("Mi tarjeta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(292, 29, 148, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNoTarjeta = new JLabel("No. Tarjeta:");
		lblNoTarjeta.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoTarjeta.setForeground(Color.WHITE);
		lblNoTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoTarjeta.setBounds(138, 236, 99, 20);
		contentPane.add(lblNoTarjeta);
		this.repaint();
		
		txt_noTar = new JTextField();
		txt_noTar.setText(user.getNumero());
		txt_noTar.setEditable(false);
		txt_noTar.setHorizontalAlignment(JTextField.CENTER);
		txt_noTar.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_noTar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_noTar.setBounds(237, 236, 339, 20);
		contentPane.add(txt_noTar);
		txt_noTar.setColumns(10);
		setLocationRelativeTo(null);
		
		JLabel lblCvv = new JLabel("CVV:");
		lblCvv.setHorizontalAlignment(SwingConstants.LEFT);
		lblCvv.setForeground(Color.WHITE);
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCvv.setBounds(188, 267, 39, 16);
		contentPane.add(lblCvv);
		
		txt_cvv = new JTextField();
		txt_cvv.setText(Integer.toString(user.getCvv()));
		txt_cvv.setEditable(false);
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_cvv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_cvv.setColumns(10);
		txt_cvv.setBounds(237, 267, 339, 20);
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_cvv);
		
		txt_mes = new JTextField();
		txt_mes.setText(user.getMes());
		txt_mes.setEditable(false);
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_mes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_mes.setColumns(10);
		txt_mes.setBounds(311, 298, 68, 20);
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_mes);
		
		txt_sald = new JTextField();
		txt_sald.setText(Float.toString(user.getSaldo()));
		txt_sald.setEditable(false);
		txt_sald.setHorizontalAlignment(JTextField.CENTER);
		txt_sald.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_sald.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_sald.setColumns(10);
		txt_sald.setBounds(285, 341, 224, 20);
		txt_sald.setHorizontalAlignment(JTextField.CENTER);
		txt_sald.setFont(new Font("Arial", Font.PLAIN,15));
		contentPane.add(txt_sald);
		
		JButton btnNewButton = new JButton("Recargar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entrada;
				boolean validar=false;
				do {
					entrada=(JOptionPane.showInputDialog(null,"¿Cuanto va a recargar?","", JOptionPane.QUESTION_MESSAGE));
					if(entrada!=null) {
						validar=excepcion.esNumero(entrada);
						if(validar==true) {
							user.ahorrar(Integer.parseInt(entrada));
							txt_sald.setText(Float.toString(user.getSaldo()));
						}
					}
				}while(entrada!=null && validar==false);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(138, 420, 159, 39);
		contentPane.add(btnNewButton);
		
		JLabel jlabel_tar = new JLabel("");
		jlabel_tar.setBounds(290, 75, 150, 150);
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
		lblFechaDeExpiracion.setBounds(114, 292, 187, 29);
		contentPane.add(lblFechaDeExpiracion);
		
		JLabel lblSaldo = new JLabel("Saldo:  $");
		lblSaldo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaldo.setForeground(Color.WHITE);
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaldo.setBounds(205, 341, 80, 16);
		contentPane.add(lblSaldo);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(375, 299, 46, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("< Volver");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(32, 560, 90, 53);
		contentPane.add(lblNewLabel_2);
		setLocationRelativeTo(null);

		ImageIcon wallpaper = new ImageIcon("src/icons/504.jpg");
		
		txt_an = new JTextField();
		txt_an.setText(Integer.toString(user.getAn()));
		txt_an.setEditable(false);
		txt_an.setHorizontalAlignment(JTextField.CENTER);
		txt_an.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_an.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_an.setColumns(10);
		txt_an.setBounds(414, 298, 68, 20);
		contentPane.add(txt_an);
		
		JButton botonAtras = new JButton("Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File fichero = new File("src/usuarios/"+user.getUsername()+".obj");
					FileOutputStream fichero1= new FileOutputStream(fichero);
					ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
					escribir.writeObject(user);
					escribir.close();
					fichero1.close();
					new Main(user).setVisible(true);
					dispose();
				}catch(IOException ex){
					JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		botonAtras.setBorder(null);
		botonAtras.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		botonAtras.setForeground(Color.WHITE);
		botonAtras.setBackground(new Color(153, 153, 255));
		botonAtras.setBounds(10, 11, 89, 23);
		contentPane.add(botonAtras);
		
		JButton btnNewButton_1 = new JButton("Cambiar tarjeta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new regisTar3(user).setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(417, 420, 159, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel jlabel_wallp = new JLabel();
		jlabel_wallp.setBounds(0, 0, 719,555);
		contentPane.add(jlabel_wallp);
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallp.getWidth(),
				jlabel_wallp.getHeight(),Image.SCALE_DEFAULT));
		jlabel_wallp.setIcon(icono);
		this.repaint();
}
}