package visual;
import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class comprar extends JFrame implements ActionListener{

	private JPanel contentPane;
	private usuario user;
	private JScrollPane scrollPane;
	private metodoPag panel1,panelTar;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					FileInputStream fichero = new FileInputStream("src/usuarios/Vector.obj");
					ObjectInputStream leer = new ObjectInputStream(fichero);
					usuario useri=(usuario)leer.readObject();
					leer.close();
					fichero.close();
					comprar frame = new comprar(useri);
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
	public comprar(usuario user) {
		super("Vector's Boing");
		this.user=user;
		setIconImage(Toolkit.getDefaultToolkit().getImage(registrar.class.getResource("/icons/vecIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	
		ImageIcon iconi = new ImageIcon("src/icons/vector final.png");
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 78, 1074, 605);
		contentPane.add(scrollPane);
		
		panel1=new metodoPag(user);
		scrollPane.setViewportView(panel1);
		
		JLabel jlabel_log = new JLabel();
		jlabel_log.setBounds(134, 0, 127, 78);
		contentPane.add(jlabel_log);
		Icon icone = new ImageIcon(iconi.getImage().getScaledInstance(jlabel_log.getWidth(),
				jlabel_log.getHeight(),Image.SCALE_DEFAULT));
		jlabel_log.setIcon(icone);
		this.repaint();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 204));
		panel.setBounds(0, 0, 1080, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main(user).setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(10, 11, 114, 57);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(btnAtras);
		btnAtras.setBorder(null);
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 22));
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBackground(new Color(0, 153, 204));
		
		btnNext = new JButton("Siguiente");
		btnNext.setBounds(939, 11, 114, 57);
		btnNext.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(btnNext);
		btnNext.setBorder(null);
		btnNext.setFont(new Font("Dialog", Font.BOLD, 22));
		btnNext.setForeground(Color.BLACK);
		btnNext.setBackground(Color.ORANGE);
		
		JLabel lblNewLabel = new JLabel("Realizar compra");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(258, 0, 565, 79);
		panel.add(lblNewLabel);
		this.repaint();
	}
	
	private void definirPanel(metodoPag panel) {
		scrollPane.setViewportView(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNext) {
			definirPanel(panel1);
		}
	}
	
}
