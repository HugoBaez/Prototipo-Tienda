package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class Carro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carro frame = new Carro();
					frame.setLocationRelativeTo(null);
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
	public Carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 204));
		panel_1.setBounds(0, 0, 784, 75);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JProgressBar avance = new JProgressBar();
		avance.setForeground(Color.GREEN);
		avance.setBorderPainted(false);
		avance.setValue(21);
		avance.setOpaque(true);
		avance.setBackground(Color.WHITE);
		avance.setBounds(156, 11, 433, 28);
		panel_1.add(avance);
		

	
		
		
		
		JPanel pnlConf = new JPanel();
		pnlConf.setBackground(Color.CYAN);
		pnlConf.setBounds(0, 465, 784, 386);
		panel.add(pnlConf);
		pnlConf.setLayout(null);
		
		JButton btnConf = new JButton("Confirmacion");
		btnConf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avance.setValue(97);
				int posicion = pnlConf.getY();
				if (posicion > 75) {
					Animacion.Animacion.subir(465, 75, 1, 1, pnlConf);
				}
				else {
					Animacion.Animacion.bajar(75, 465, 1, 1, pnlConf);
				}
			}
		});
		btnConf.setBorder(null);
		btnConf.setBackground(Color.YELLOW);
		btnConf.setBounds(500, 50, 89, 23);
		panel_1.add(btnConf);
		
		JButton btnPedir = new JButton("Hacer Pedido");
		btnPedir.setBounds(685, 352, 89, 23);
		pnlConf.add(btnPedir);
		btnPedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avance.setValue(100);
				JOptionPane.showMessageDialog(null,"Pedido Realizado Exitosamente \n Grcias Por Su Compra :) ","",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnPedir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPedir.setBorder(null);
		btnPedir.setBackground(Color.YELLOW);
		
		JPanel pnlPay = new JPanel();
		pnlPay.setBackground(Color.YELLOW);
		pnlPay.setBounds(0, -390, 784, 386);
		panel.add(pnlPay);
		pnlPay.setLayout(null);
		
		JButton btnPago = new JButton("Pago");
		btnPago.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avance.setValue(73);
				int posicion = pnlPay.getY();
				if (posicion > -390) {
					Animacion.Animacion.subir(75, -390, 1, 1, pnlPay);
				}
				else {
					Animacion.Animacion.bajar(-390, 75, 1, 1, pnlPay);
				}
			}
		});
		btnPago.setBorder(null);
		btnPago.setBackground(Color.YELLOW);
		btnPago.setBounds(384, 50, 89, 23);
		panel_1.add(btnPago);
		
		JLabel lblNewLabel = new JLabel("Pago");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(171, 99, 269, 116);
		pnlPay.add(lblNewLabel);
		
		JPanel pnlDire = new JPanel();
		pnlDire.setBackground(Color.GREEN);
		pnlDire.setBounds(-790, 75, 784, 386);
		panel.add(pnlDire);
		pnlDire.setLayout(null);
		
		JButton btnDirec = new JButton("Direcci\u00F3n");
		btnDirec.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDirec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avance.setValue(47);
				int posicion = pnlDire.getX();
				if (posicion > -790) {
					Animacion.Animacion.mover_izquierda(0, -790, 1, 1, pnlDire);
				}
				else {
					Animacion.Animacion.mover_derecha(-790, 0, 1, 1, pnlDire);
				}
			}
		});
		btnDirec.setBorder(null);
		btnDirec.setBackground(Color.YELLOW);
		btnDirec.setBounds(271, 50, 89, 23);
		panel_1.add(btnDirec);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(209, 157, 166, 60);
		pnlDire.add(lblNewLabel_1);
		
		JPanel pnlProd = new JPanel();
		pnlProd.setBackground(Color.PINK);
		pnlProd.setBounds(0, 75, 784, 386);
		panel.add(pnlProd);
		pnlProd.setLayout(null);
		
		JButton btnProd = new JButton("Productos");
		btnProd.setSelected(true);
		btnProd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avance.setValue(21);
				int posicion = pnlProd.getX();
				if (posicion > 0) {
					Animacion.Animacion.mover_izquierda(790, 0, 1, 1, pnlProd);
				}
				else {
					Animacion.Animacion.mover_derecha(0, 790, 1, 1, pnlProd);
				}
			}
		});
		btnProd.setBorder(null);
		btnProd.setBackground(Color.YELLOW);
		btnProd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProd.setBounds(156, 50, 89, 23);
		panel_1.add(btnProd);
		
		
		JLabel lblNewLabel_2 = new JLabel("Productos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setBounds(220, 112, 480, 81);
		pnlProd.add(lblNewLabel_2);
	}
}
