package visual;

import java.awt.BorderLayout;
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



public class mostrarLB3 extends JFrame {
	private int cont1,cont2,cont3;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mostrarLB3 frame = new mostrarLB3();
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
	public mostrarLB3() {
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
		lblNewLabel_6.setIcon(new ImageIcon(mostrarLB3.class.getResource("/icons/vector final.png")));
		 
		ImageIcon icono9 = new ImageIcon(mostrarLB3.class.getResource("/icons/casa.png"));
		Icon quake9 = new ImageIcon(icono9.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
		ImageIcon icono10 = new ImageIcon(mostrarLB3.class.getResource("/icons/casa.png"));
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
				mostrarLB3.this.dispose();
				Main mostrar = new Main();
				mostrar.setLocationRelativeTo(null);
				mostrar.setVisible(true);
			}
		});
		
		
		ImageIcon icono1 = new ImageIcon(mostrarLB3.class.getResource("/icons/refri.png"));
		Icon quake1 = new ImageIcon(icono1.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		JLabel lblNewLabel_3 = new JLabel("Ver mas...");
		lblNewLabel_3.setToolTipText( "<html>Modelo:WRX735SDHZ <p> Color:Gris<p> Energia:800-1200 watts horas/día,<p>Peso:136,1 kg<p> Tamaño: 1752,6 mm x 889 mm x 889 mm<html>" );
		lblNewLabel_3.setBounds(190, 271, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("<html><BIG>" + cont1 + "</BIG><html>");
		lblNewLabel_1.setBounds(872, 246, 58, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton();
		ImageIcon icono2 = new ImageIcon(mostrarLB3.class.getResource("/icons/punta1.png")); 
	    Icon quake2 = new ImageIcon(icono2.getImage().getScaledInstance(15,15,Image.SCALE_SMOOTH)); 
	   
	    btnNewButton.setIcon(quake2);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(cont1 > 0) {
					 cont1--;
				     lblNewLabel_1.setText( "<html><BIG> " + cont1 + "</BIG><html>");
		 	        }else 
		 	        JOptionPane.showMessageDialog( mostrarLB3.this, "Tiene que selecionar mas objetos." ); 
			}
		});
		btnNewButton.setBounds(792, 250, 58, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		ImageIcon icono3 = new ImageIcon(mostrarLB3.class.getResource("/icons/punta2.png")); 
	    Icon quake3 = new ImageIcon(icono3.getImage().getScaledInstance(15,15,Image.SCALE_SMOOTH)); 
	    btnNewButton_1.setIcon(quake3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont1 < 5) {
					cont1++;
					lblNewLabel_1.setText( "<html><BIG> " + cont1 + "</BIG><html>");
			        
			        }
			        else 
			        	JOptionPane.showMessageDialog( mostrarLB3.this, "No puede comprar mas de 5 objetos." );
		    	 
		 	       
			}
		});
		btnNewButton_1.setBounds(912, 250, 58, 23);
		contentPane.add(btnNewButton_1);
		
		ImageIcon icono5 = new ImageIcon(mostrarLB3.class.getResource("/icons/lavatora.png"));
		Icon quake5 = new ImageIcon(icono5.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel_4 = new JLabel("Ver mas...");
		lblNewLabel_4.setToolTipText("<html>Modelo: LMDX3124PBAB0 <p> Color:negro,gris<p> Energia:200-500 watts horas/día,<p>Peso:50,23 kg<p> Tamaño: 800,6 mm x 400 mm x 350 mm<html>");
		lblNewLabel_4.setBounds(190, 466, 58, 14);
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
		 	        JOptionPane.showMessageDialog( mostrarLB3.this, "Tiene que selecionar mas objetos." ); 
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
			        	JOptionPane.showMessageDialog( mostrarLB3.this, "No puede comprar mas de 5 objetos." );
			}
		});
		btnNewButton_1_1.setBounds(912, 423, 58, 23);
		btnNewButton_1_1.setIcon(quake3);
		contentPane.add(btnNewButton_1_1);
        
		ImageIcon icono4 = new ImageIcon(mostrarLB3.class.getResource("/icons/estufi.png"));
		Icon quake4 = new ImageIcon(icono4.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel_5 = new JLabel("Ver mas...");
		lblNewLabel_5.setToolTipText("<html>Refrigerador French Door 36 Whirlpool WRX735SDHZ <p> Dos puertas<p> Control Inverso<p> Doble motor<p> Dispensador de agua<p> 32 000 $  30%  27 000 $<html>");
		lblNewLabel_5.setBounds(190, 644, 58, 14);
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
		 	        JOptionPane.showMessageDialog( mostrarLB3.this, "Tiene que selecionar mas objetos." ); 
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
			        	JOptionPane.showMessageDialog( mostrarLB3.this, "No puede comprar mas de 5 objetos." );
			}
		});
		btnNewButton_1_2.setBounds(912, 589, 58, 23);
		btnNewButton_1_2.setIcon(quake3);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton();
		ImageIcon icono6 = new ImageIcon(mostrarLB3.class.getResource("/icons/carritos.png")); 
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
		    	 JOptionPane.showMessageDialog( mostrarLB3.this,"Se agrego al carrito" ); 
			}else
				 JOptionPane.showMessageDialog( mostrarLB3.this,"Debe selecionar productos antes" );	
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
		ImageIcon icono11 = new ImageIcon(mostrarRO.class.getResource("/icons/estrellita.png"));
		Icon quake11 = new ImageIcon(icono11.getImage().getScaledInstance(100,20,Image.SCALE_SMOOTH));
		JLabel lblNewLabel_7 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_7.setBounds(535, 167, 200, 29);
		contentPane.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_8.setBounds(363, 358, 200, 29);
		contentPane.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("", quake11, SwingConstants.LEFT);
		lblNewLabel_9.setBounds(466, 540, 100, 29);
		contentPane.add(lblNewLabel_9);
		JLabel lblNewLabel = new JLabel("<html><H2>Refrigerador French Door 36 Whirlpool </H2><p>ID: DF-SDFDFSIVJ45<P> Refrigerador whirlpool de doble puerta con termometro, dispensador de agua y almacenamineto inferior extra.<p> Precio reducido de <FONT color=\"red\"><s>32 000 $</s></FONT> a un 30% desde 27 000$<html>",quake1,SwingConstants.LEFT);   
		//lblNewLabel.setIcon(new ImageIcon());
		lblNewLabel.setBounds(35, 131, 667, 157);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel("<html><H2>Mini lavadora Mabe </H2><p>ID: LA-JDHRNAO3411<p>La lavadora cuenta con un diseño de doble tina cuya capacidad de lavado es de 13 kg. Te brinda 3 niveles de agua para que laves distintas cargas.<p>Precio reducido de <FONT color=\"red\"><s>5799 $</s></FONT> a un 30% desde 3 999 $<html>", quake5, SwingConstants.LEFT);
		lblNewLabel_2.setBounds(35, 325, 625, 157);
		contentPane.add(lblNewLabel_2);
		JLabel lblNewLabel_2_1 = new JLabel("<html><H2>Estufa de Gas Maytag MF8000S</H2><p>ID: ET-2RTWQWESDAS <P> Exclusivo quemador Power brinda máxima potencia y rapidez para cocinar con mayor consistencia y precisión los alimentos gracias a sus 11,300 BTUs<p> Precio reducido de <FONT color=\"red\"><s>19 599 $</s></FONT> a un 30% desde 15 299 $<html>", quake4, SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(35, 513, 679, 144);
		contentPane.add(lblNewLabel_2_1);
		
		
		
	}
}
