package visual;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class mostrarCO extends JFrame {
	private int cont1,cont2,cont3;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mostrarCO frame = new mostrarCO();
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
	public mostrarCO() {
		this.cont1=0;
		this.cont2=0;
		this.cont3=0;
		setForeground(Color.LIGHT_GRAY);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 204));
		panel.setBounds(0, 0, 1080, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(446, 11, 182, 110);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(mostrarCO.class.getResource("/icons/vector final.png")));
		 
		ImageIcon icono9 = new ImageIcon(mostrarCO.class.getResource("/icons/casa.png"));
		Icon quake9 = new ImageIcon(icono9.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
		ImageIcon icono10 = new ImageIcon(mostrarCO.class.getResource("/icons/casa.png"));
		Icon quake10 = new ImageIcon(icono10.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
		
		JButton btnNewButton_6 = new JButton("");
        btnNewButton_6.setIcon(quake9);
		btnNewButton_6.setBounds(948, 28, 95, 63);
		panel.add(btnNewButton_6);
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setIcon(quake10);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarCO.this.dispose();
				Main mostrar = new Main();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		
		
		ImageIcon icono1 = new ImageIcon(mostrarCO.class.getResource("/icons/compi.png"));
		Icon quake1 = new ImageIcon(icono1.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		JLabel lblNewLabel_3 = new JLabel("Ver mas...");
		lblNewLabel_3.setToolTipText( "<html>Procesador:ADM Ryzen 3 <p>Modelo:CM-00388 <p> Color:Negro-RGB <p> Memoria: 1T<p>Memoria Ram: 8 GB<p>Windos 10<p>Nucleos:4" );
		lblNewLabel_3.setBounds(190, 270, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("<html><BIG>" + cont1 + "</BIG><html>");
		lblNewLabel_1.setBounds(872, 246, 58, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton();
		ImageIcon icono2 = new ImageIcon(mostrarCO.class.getResource("/icons/punta1.png")); 
	    Icon quake2 = new ImageIcon(icono2.getImage().getScaledInstance(15,15,Image.SCALE_SMOOTH)); 
	   
	    btnNewButton.setIcon(quake2);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(cont1 > 0) {
					 cont1--;
				     lblNewLabel_1.setText( "<html><BIG> " + cont1 + "</BIG><html>");
		 	        }else 
		 	        JOptionPane.showMessageDialog( mostrarCO.this, "Tiene que selecionar mas objetos." ); 
			}
		});
		btnNewButton.setBounds(792, 250, 58, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		ImageIcon icono3 = new ImageIcon(mostrarCO.class.getResource("/icons/punta2.png")); 
	    Icon quake3 = new ImageIcon(icono3.getImage().getScaledInstance(15,15,Image.SCALE_SMOOTH)); 
	    btnNewButton_1.setIcon(quake3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont1 < 5) {
					cont1++;
					lblNewLabel_1.setText( "<html><BIG> " + cont1 + "</BIG><html>");
			        
			        }
			        else 
			        	JOptionPane.showMessageDialog( mostrarCO.this, "No puede comprar mas de 5 objetos." );
		    	 
		 	       
			}
		});
		btnNewButton_1.setBounds(912, 250, 58, 23);
		contentPane.add(btnNewButton_1);
		
		ImageIcon icono5 = new ImageIcon(mostrarCO.class.getResource("/icons/lapti.jpeg"));
		Icon quake5 = new ImageIcon(icono5.getImage().getScaledInstance(150,100,Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel_4 = new JLabel("Ver mas...");
		lblNewLabel_4.setToolTipText("<html>Marca:ASUS<P>Procesador:Intel Core i7 <p>Modelo:GF63 <p> Color:Negro-RGB<p>Resolcion: 15.6 Full HD <p> Memoria: 1T<p>Memoria Ram: 12 GB<p>Windos 10<p>Nucleos:6");
		lblNewLabel_4.setBounds(190, 460, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html><BIG>"+ cont2 +"</BIG><html>");
		lblNewLabel_1_1.setBounds(872, 417, 58, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont2 > 0) {
					 cont2--;
				     lblNewLabel_1_1.setText( "<html><BIG> " + cont2 + "</BIG><html>");
		 	        }else 
		 	        JOptionPane.showMessageDialog( mostrarCO.this, "Tiene que selecionar mas objetos." ); 
			}
		});
		btnNewButton_2.setBounds(792, 423, 58, 23);
		btnNewButton_2.setIcon(quake2);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton();
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont2 < 5) {
					cont2++;
					 lblNewLabel_1_1.setText( "<html><BIG> " + cont2 + "</BIG><html>");
			        
			        }
			        else 
			        	JOptionPane.showMessageDialog( mostrarCO.this, "No puede comprar mas de 5 objetos." );
			}
		});
		btnNewButton_1_1.setBounds(912, 423, 58, 23);
		btnNewButton_1_1.setIcon(quake3);
		contentPane.add(btnNewButton_1_1);
        
		ImageIcon icono4 = new ImageIcon(mostrarCO.class.getResource("/icons/mac.jpg"));
		Icon quake4 = new ImageIcon(icono4.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel_5 = new JLabel("Ver mas...");
		lblNewLabel_5.setToolTipText("<html>Marca: Apple <p>Procesador: Intel Core i5 <p>Modelo: iMac Retina 27 <p> Color: Blanco<p> Memoria: 512GB<p>Memoria Ram: 8 GB<p>macOS Catalina 10.15");
		lblNewLabel_5.setBounds(190, 638, 58, 14);
		contentPane.add(lblNewLabel_5);
	    
		JLabel lblNewLabel_1_1_1 = new JLabel("<html><BIG>"+cont3+"</BIG><html>");
		lblNewLabel_1_1_1.setBounds(872, 583, 58, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont3 > 0) {
					 cont3--;
					 lblNewLabel_1_1_1.setText( "<html><BIG> " + cont3 + "</BIG><html>");
		 	        }else 
		 	        JOptionPane.showMessageDialog( mostrarCO.this, "Tiene que selecionar mas objetos." ); 
			}
		});
		btnNewButton_3.setBounds(792, 589, 58, 23);
		btnNewButton_3.setIcon(quake2);
		contentPane.add(btnNewButton_3);
		
		
		
		JButton btnNewButton_1_2 = new JButton();
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont3 < 5) {
					cont3++;
					lblNewLabel_1_1_1.setText( "<html><BIG> " + cont3 + "</BIG><html>");
			        
			        }
			        else 
			        	JOptionPane.showMessageDialog( mostrarCO.this, "No puede comprar mas de 5 objetos." );
			}
		});
		btnNewButton_1_2.setBounds(912, 589, 58, 23);
		btnNewButton_1_2.setIcon(quake3);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton();
		ImageIcon icono6 = new ImageIcon(mostrarCO.class.getResource("/icons/carritos.png")); 
	    Icon quake6 = new ImageIcon(icono6.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)); 
	    btnNewButton_4.setIcon(quake6);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(cont1!=0 && cont2!=0 && cont3!=0){
				 cont1=0;
				 cont2=0;
				 cont3=0;
				 lblNewLabel_1.setText("<html><BIG> " + cont1 + "</BIG><html>");
				 lblNewLabel_1_1.setText("<html><BIG> " + cont2 + "</BIG><html>");
				 lblNewLabel_1_1_1.setText("<html><BIG> " + cont3 + "</BIG><html>");
		    	 JOptionPane.showMessageDialog( mostrarCO.this,"Se agrego al carrito" ); 
			}else
				 JOptionPane.showMessageDialog( mostrarCO.this,"Debe selecionar productos antes" );	
			}
		});
		btnNewButton_4.setBounds(888, 160, 98, 49);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CANCELAR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 cont1=0;
				 cont2=0;
				 cont3=0;
				 lblNewLabel_1.setText("<html><BIG> " + cont1 + "</BIG><html>");
				 lblNewLabel_1_1.setText("<html><BIG> " + cont2 + "</BIG><html>");
				 lblNewLabel_1_1_1.setText("<html><BIG> " + cont3 + "</BIG><html>");
			}
		});
		btnNewButton_5.setBounds(765, 160, 98, 49);
		contentPane.add(btnNewButton_5);

		ImageIcon icono11 = new ImageIcon(mostrarCO.class.getResource("/icons/estrellita.png"));
		Icon quake11 = new ImageIcon(icono11.getImage().getScaledInstance(100,20,Image.SCALE_SMOOTH));
		JLabel lblNewLabel_7 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_7.setBounds(451, 167, 200, 29);
		contentPane.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_8.setBounds(364, 361, 200, 29);
		contentPane.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_9.setBounds(385, 550, 100, 29);
		contentPane.add(lblNewLabel_9);
		
		
		JLabel lblNewLabel = new JLabel("<html><H2>Computadora Gamer Xtreme </H2><p>ID: 2312341234<P> PC Gaming CM-00388, AMD Ryzen 3 3200G 3.60GHz, 8GB, 240GB SSD, FreeDOS - incluye Monitor, Teclado y Mouse .<p> Precio reducido de <FONT color=\"red\"><s>11 243 $</s></FONT> a un 20% desde 9 232$<html>",quake1,SwingConstants.LEFT);   
		//lblNewLabel.setIcon(new ImageIcon());
		lblNewLabel.setBounds(35, 131, 667, 157);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel("<html><H2>Laptop Gamer MSI </H2><p>ID: 3443523415 <p>Laptop Gamer MSI GF63 Thin 10SCSR 15.6\" Full HD, Intel Core i7-10750H 2.60GHz, 8GB, 512GB SSD.<p>Precio reducido de <FONT color=\"red\"><s>33 223 $</s></FONT> a un 14% desde 28 798 $<html>", quake5, SwingConstants.LEFT);
		lblNewLabel_2.setBounds(35, 325, 625, 157);
		contentPane.add(lblNewLabel_2);
		JLabel lblNewLabel_2_1 = new JLabel("<html><H2>Apple iMac Retina 27</H2><p>ID: 46237648237 <P>  Apple iMac Retina 27\", Intel Core i5 3.30GHz, 8GB, 512GB SSD, Plata (Septiembre - 2020). <p>Precio reducido de <FONT color=\"red\"><s>1 049 $</s></FONT> a un 20% desde 849 $<html>", quake4, SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(35, 513, 679, 144);
		contentPane.add(lblNewLabel_2_1);

	}

}
