package clases;

//Creacion de una excepcion personaliza. saldo de tarjeta
public class InsuficientSald extends Exception{
	
	public static final long serialVersionUID = 800L;
	
	public InsuficientSald(String msg) {
		super(msg);
	}
}