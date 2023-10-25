package clases;

import javax.swing.JOptionPane;

public abstract class excepcion{
	public static boolean esNumero(String cadena) {
		//Excepcion para cualquier entero
		try {
			Integer.parseInt(cadena);
			if (Integer.parseInt(cadena)<=0) {
				JOptionPane.showMessageDialog(null,"Error, el dato no puede ser negativo o cero","", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			else
				return true;
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Error, debe ingresar un numero","", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}

	//Excepcion para el numero de tarjeta
	public static boolean esLong(String cadena){
		try {
			Long.parseLong(cadena);
			if (Long.parseLong(cadena)<1000000000000000L || Long.parseLong(cadena)>9999999999999999L) {
				JOptionPane.showMessageDialog(null,"Error, el numero debe tener 16 digitos","", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			else
				return true;
		}catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Error, debe ingresar un numeros","", JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}
	
}