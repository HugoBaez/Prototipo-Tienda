package visual;
import clases.*;
//import java.awt.BorderLayout;
//import visual.Main;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

@SuppressWarnings("serial")
public class Loggin extends JFrame {
	private JPanel contentPane;
	private JTextField usr;
	private JPasswordField pssword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loggin frame = new Loggin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loggin() {
		super("Bienvenido");
		setIconImage(Toolkit.getDefaultToolkit().getImage(registrar.class.getResource("/icons/vecIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 427);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton verif = new JButton("Ingresar");
		verif.setBorderPainted(false);
		verif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=usr.getText().trim();
				String pin=pssword.getText();
				int pin1;
				FileInputStream fichero;
				
				if(!user.equals("") && !pin.equals("")) {
					if (pin.length()<4) {
						JOptionPane.showMessageDialog(null,"El PIN debe ser de 4 digitos","", JOptionPane.WARNING_MESSAGE);
					}else {
						pin1=Integer.parseInt(pin);
						try {
							fichero = new FileInputStream("src/usuarios/"+user+".obj");
							ObjectInputStream leer = new ObjectInputStream(fichero);
							usuario useri=(usuario)leer.readObject();
							leer.close();
							fichero.close();
							if (pin1!=useri.getPin()) {
								JOptionPane.showMessageDialog(null,"PIN incorrecto","", JOptionPane.WARNING_MESSAGE);
								pssword.setText("");
							}else {
								JOptionPane.showMessageDialog(null,"Bienvenido "+useri.getUsername()+" =)","",JOptionPane.INFORMATION_MESSAGE);
								new Main(useri).setVisible(true);
								dispose();
								
							}
						}catch(FileNotFoundException ex){
							JOptionPane.showMessageDialog(null,"El usuario ingresado no existe","", JOptionPane.WARNING_MESSAGE);
							usr.setText("");
							pssword.setText("");
						}catch (IOException ex) {
							JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
						} catch (ClassNotFoundException e) {
							JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
						}
					}
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		JButton Regist = new JButton("Registrarse");
		Regist.setBorderPainted(false);
		Regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario user = new usuario();
				new registrar(user,"","","","","").setVisible(true);
				dispose();
			}
		});
		Regist.setForeground(Color.BLACK);
		Regist.setFont(new Font("Dialog", Font.PLAIN, 12));
		Regist.setBackground(Color.ORANGE);
		Regist.setBounds(170, 302, 112, 27);
		contentPane.add(Regist);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u00BFNo tienes cuenta?");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(28, 302, 123, 27);
		contentPane.add(lblNewLabel_1_2);
		
		verif.setFont(new Font("Dialog", Font.BOLD, 16));
		verif.setForeground(Color.BLACK);
		verif.setBackground(Color.ORANGE);
		verif.setBounds(115, 264, 105, 27);
		contentPane.add(verif);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Loggin.class.getResource("/icons/61_85304.png")));
		lblNewLabel.setBounds(130, 13, 90, 96);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(40, 121, 230, 17);
		contentPane.add(lblNewLabel_1);
		
		usr = new JTextField();
		usr.setHorizontalAlignment(JTextField.CENTER);
		usr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()==' ' && e.getKeyChar()!='\b') {
					e.consume();
				}
				if(usr.getText().length() >= 15) {
					e.consume();
				}
			}
		});
		usr.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		usr.setFont(new Font("Dialog", Font.PLAIN, 14));
		usr.setForeground(SystemColor.menuText);
		usr.setBounds(40, 150, 230, 28);
		contentPane.add(usr);
		usr.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PIN:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(40, 189, 230, 17);
		contentPane.add(lblNewLabel_1_1);
		
		pssword = new JPasswordField();
		pssword.setHorizontalAlignment(JTextField.CENTER);
		pssword.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()<'0' || e.getKeyChar()>'9' && e.getKeyChar()!='\b') {
					e.consume();
				}
				else {
					if(pssword.getText().length() >= 4) {
						e.consume();
					}
				}
			}
		});
		pssword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pssword.setFont(new Font("Arial Black", Font.BOLD, 14));
		pssword.setForeground(SystemColor.menuText);
		pssword.setBounds(40, 212, 230, 28);
		contentPane.add(pssword);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
				if (resp == 0) {
					System.exit(0);
				}
			}
		});
		btnSalir.setBorderPainted(false);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBackground(Color.RED);
		btnSalir.setBounds(10, 347, 66, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Loggin.class.getResource("/icons/504.jpg")));
		lblNewLabel_2.setBounds(-366, -130, 706, 519);
		contentPane.add(lblNewLabel_2);
	}
}