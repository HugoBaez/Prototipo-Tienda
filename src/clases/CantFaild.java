package clases;

//Creacion de una excepcion personaliza. saldo de tarjeta
public class CantFaild extends Exception{
	
	public static final long serialVersionUID = 500L;
	
	public CantFaild(String msg) {
		super(msg);
	}
}
