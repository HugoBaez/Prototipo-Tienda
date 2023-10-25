package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Ticket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
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
	public Ticket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 634, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ticket.class.getResource("/icons/hamburger_icon_145980.png")));
		lblNewLabel_1.setBounds(578, 0, 46, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ticket.class.getResource("/icons/504.jpg")));
		lblNewLabel.setBounds(0, 0, 634, 51);
		panel.add(lblNewLabel);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setForeground(Color.BLACK);
		lblTicket.setFont(new Font("Arial", Font.BOLD, 45));
		lblTicket.setBounds(241, 87, 156, 66);
		contentPane.add(lblTicket);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCantidad.setBounds(110, 164, 115, 25);
		contentPane.add(lblCantidad);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setFont(new Font("Arial", Font.PLAIN, 16));
		textPane.setBounds(181, 208, 248, 184);
		contentPane.add(textPane);
		
		JLabel label_2 = new JLabel("< Volver");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(20, 436, 90, 53);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(235, 167, 109, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(451, 169, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setBounds(120, 208, 38, 184);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(451, 208, 46, 184);
		contentPane.add(textPane_2);
		
		JLabel lblNewLabel_4 = new JLabel("Total:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(358, 406, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBackground(SystemColor.control);
		textField.setBounds(411, 403, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}