package visual;

import java.awt.Color;
import clases.*;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;


import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;


public class metodoPag extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	private JTextField txt_noTar;
	private JTextField txt_cvv;
	private JTextField txt_mes;
	private JTextField txt_an;
	private usuario user;

	JPanel tarjeta,noTarje,efectivo;
	JRadioButton credi;
	JRadioButton efecti;
	private final ButtonGroup MetodoPago = new ButtonGroup();
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public metodoPag(usuario user) {
		this.user=user;
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 78, 1074, 605);
		
		tarjeta= new JPanel();
		tarjeta.setBackground(Color.WHITE);
		tarjeta.setBounds(0, 214, 1074, 391);
		tarjeta.setLayout(null);
		tarjeta.setVisible(false);
		
		noTarje= new JPanel();
		noTarje.setBackground(Color.WHITE);
		noTarje.setBounds(0, 214, 1074, 391);
		noTarje.setLayout(null);
		noTarje.setVisible(false);
		
		efectivo= new JPanel();
		efectivo.setBackground(Color.WHITE);
		efectivo.setBounds(0, 214, 1074, 391);
		efectivo.setLayout(null);
		efectivo.setVisible(false);
		if(user.gettieTarje()==true) {
			add(tarjeta);
		}
		add(efectivo);
		add(noTarje);
		if(user.gettieTarje()==true) {
			tarTrue();
		}
		noHay();
		pagoEfe();
		
		JLabel jlabel_tarje = new JLabel();
		jlabel_tarje.setBounds(192, 134, 70,69);
		add(jlabel_tarje);
		

		ImageIcon tarje = new ImageIcon("src/icons/tarjetalogo.png");
		Icon icono = new ImageIcon(tarje.getImage().getScaledInstance(jlabel_tarje.getWidth(),
				jlabel_tarje.getHeight(),Image.SCALE_DEFAULT));
		jlabel_tarje.setIcon(icono);
		this.repaint();
		
		JLabel jlabel_efec = new JLabel();
		jlabel_efec.setBounds(655, 134, 70,69);
		add(jlabel_efec);
		
		ImageIcon efec = new ImageIcon("src/icons/pagoEfec.png");
		Icon icono1 = new ImageIcon(efec.getImage().getScaledInstance(jlabel_efec.getWidth(),
				jlabel_efec.getHeight(),Image.SCALE_DEFAULT));
		jlabel_efec.setIcon(icono1);
		this.repaint();
			
		JLabel lblNewLabel = new JLabel("Metodo de pago");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(405, 38, 280, 58);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tarjeta de credito");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(285, 145, 157, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Efectivo");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(735, 149, 90, 14);
		add(lblNewLabel_1_1);
		
		credi = new JRadioButton("");
		credi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(credi.isSelected()==true) {
					if(user.gettieTarje()==true) {
						tarjeta.setVisible(true);
						efectivo.setVisible(false);
					}else {
						noTarje.setVisible(true);
						efectivo.setVisible(false);
					}
				}
			}
		});
		credi.setBackground(Color.WHITE);
		credi.setBounds(349, 174, 21, 23);
		
		
		efecti = new JRadioButton("");
		efecti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(efecti.isSelected()==true) {
					if(user.gettieTarje()==true) {
						tarjeta.setVisible(false);
						efectivo.setVisible(true);
					}else {
						noTarje.setVisible(false);
						efectivo.setVisible(true);
					}
				}
			}
		});
		efecti.setBackground(Color.WHITE);
		efecti.setBounds(768, 174, 21, 23);
		add(efecti);
		add(credi);
		MetodoPago.add(credi);
		MetodoPago.add(efecti);
	}
	
	public void tarTrue() {
		txt_noTar = new JTextField();
		txt_noTar.setText(user.getNumero());
		txt_noTar.setEditable(false);
		txt_noTar.setHorizontalAlignment(JTextField.CENTER);
		txt_noTar.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_noTar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_noTar.setBounds(159, 163, 339, 20);
		txt_noTar.setColumns(10);
		tarjeta.add(txt_noTar);
		
		JLabel lblCvv = new JLabel("CVV:");
		lblCvv.setHorizontalAlignment(SwingConstants.LEFT);
		lblCvv.setForeground(Color.BLACK);
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCvv.setBounds(98, 194, 39, 16);
		tarjeta.add(lblCvv);
		
		txt_cvv = new JTextField();
		txt_cvv.setText(Integer.toString(user.getCvv()));
		txt_cvv.setEditable(false);
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_cvv.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_cvv.setColumns(10);
		txt_cvv.setBounds(159, 194, 339, 20);
		txt_cvv.setHorizontalAlignment(JTextField.CENTER);
		txt_cvv.setFont(new Font("Arial", Font.PLAIN,15));
		tarjeta.add(txt_cvv);
		
		txt_mes = new JTextField();
		txt_mes.setText(user.getMes());
		txt_mes.setEditable(false);
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_mes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_mes.setColumns(10);
		txt_mes.setBounds(243, 247, 68, 20);
		txt_mes.setHorizontalAlignment(JTextField.CENTER);
		txt_mes.setFont(new Font("Arial", Font.PLAIN,15));
		tarjeta.add(txt_mes);
		
		txt_an = new JTextField();
		txt_an.setText(Integer.toString(user.getAn()));
		txt_an.setEditable(false);
		txt_an.setHorizontalAlignment(JTextField.CENTER);
		txt_an.setFont(new Font("Arial", Font.PLAIN, 15));
		txt_an.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_an.setColumns(10);
		txt_an.setBounds(357, 247, 68, 20);
		tarjeta.add(txt_an);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumero.setBounds(71, 163, 78, 16);
		tarjeta.add(lblNumero);
		
		JLabel lblDatosDeLa = new JLabel("Datos de la tarjeta");
		lblDatosDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeLa.setForeground(Color.BLACK);
		lblDatosDeLa.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 25));
		lblDatosDeLa.setBounds(193, 64, 280, 58);
		tarjeta.add(lblDatosDeLa);
		
		JLabel lblFechaDeExpiracion = new JLabel("Fecha de expiracion:");
		lblFechaDeExpiracion.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeExpiracion.setForeground(Color.BLACK);
		lblFechaDeExpiracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeExpiracion.setBounds(55, 247, 167, 16);
		tarjeta.add(lblFechaDeExpiracion);
		
		JLabel idente = new JLabel("New label");
		idente.setBounds(643, 26, 295, 270);
		tarjeta.add(idente);
		
		ImageIcon logo = new ImageIcon("src/icons/tarjetaLogo2.png");
		Icon icono4 = new ImageIcon(logo.getImage().getScaledInstance(idente.getWidth(),
				idente.getHeight(),Image.SCALE_DEFAULT));
		idente.setIcon(icono4);
		
		JLabel lblparaContinuarPulse = new JLabel("(Para continuar pulse siguiente)");
		lblparaContinuarPulse.setHorizontalAlignment(SwingConstants.CENTER);
		lblparaContinuarPulse.setForeground(Color.BLACK);
		lblparaContinuarPulse.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 20));
		lblparaContinuarPulse.setBounds(653, 280, 280, 58);
		tarjeta.add(lblparaContinuarPulse);
		
		JLabel Jlabel_sald = new JLabel("Saldo suficiente");
		Jlabel_sald.setHorizontalAlignment(SwingConstants.CENTER);
		Jlabel_sald.setForeground(Color.PINK);
		Jlabel_sald.setFont(new Font("Calibri", Font.PLAIN, 22));
		Jlabel_sald.setBounds(193, 280, 280, 58);
		tarjeta.add(Jlabel_sald);
		
		JLabel lblNewLabel_5 = new JLabel("/");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(309, 251, 46, 14);
		tarjeta.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setText(user.getNombre());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(159, 132, 339, 20);
		tarjeta.add(textField);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(71, 132, 78, 16);
		tarjeta.add(lblNombre);
		this.repaint();
		
	}
	
	public void noHay() {
		
		JLabel pensa = new JLabel();
		pensa.setBounds(411, 11, 245, 236);
		noTarje.add(pensa);
		
		ImageIcon emoji = new ImageIcon("src/icons/pensativo.png");
		Icon icono2 = new ImageIcon(emoji.getImage().getScaledInstance(pensa.getWidth(),
				pensa.getHeight(),Image.SCALE_DEFAULT));
		pensa.setIcon(icono2);
		
		JLabel lblNewLabel_2 = new JLabel("Usted no cuenta con tarjeta de credito");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 29));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(244, 258, 580, 40);
		noTarje.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Registrela desde el menu de usuario");
		lblNewLabel_6.setForeground(Color.GRAY);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(395, 298, 295, 30);
		noTarje.add(lblNewLabel_6);
	}
	
	public void pagoEfe() {
		
		JLabel lblNewLabel_3 = new JLabel("(Pulse el boton siguiente)");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(308, 110, 465, 61);
		efectivo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Se le dara un ticket de compra");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(308, 182, 455, 61);
		efectivo.add(lblNewLabel_4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public boolean getCredi() {
		return credi.isSelected();
	}
	
	public boolean getEfecti() {
		return efecti.isSelected();
	}
}
