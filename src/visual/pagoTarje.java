package visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class pagoTarje extends JPanel {

	/**
	 * Create the panel.
	 */
	public pagoTarje() {
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 78, 1074, 605);
		
		JLabel lblNewLabel = new JLabel("Pago con tarjeta");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(424, 36, 280, 58);
		add(lblNewLabel);
		
		JLabel jlabel_tarje = new JLabel();
		jlabel_tarje.setBounds(372, 25, 70,69);
		add(jlabel_tarje);
		
		ImageIcon tarje = new ImageIcon("src/icons/tarjetalogo.png");
		Icon icono = new ImageIcon(tarje.getImage().getScaledInstance(jlabel_tarje.getWidth(),
				jlabel_tarje.getHeight(),Image.SCALE_DEFAULT));
		jlabel_tarje.setIcon(icono);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(115, 154, 709, 379);
		add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Detalles de la compra");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(105, 119, 211, 33);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("($100 de cargo extra)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_1_1.setBounds(834, 286, 211, 33);
		add(lblNewLabel_1_1);
		
		JRadioButton envio = new JRadioButton("");
		envio.setBackground(Color.WHITE);
		envio.setHorizontalAlignment(SwingConstants.CENTER);
		envio.setBounds(928, 322, 29, 23);
		add(envio);
		
		JLabel lblEnvioExpress = new JLabel("Envio express");
		lblEnvioExpress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblEnvioExpress.setBounds(894, 275, 99, 14);
		add(lblEnvioExpress);
		this.repaint();
	}
}
