package clases;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class tarjeta implements extra,Serializable{
	//Atributos
	private float saldo;
	private String numero;
	private int cvv;
	private String mes;
	private int an;

	//cosntructor
	public tarjeta(String numero, int cvv, String mes, int an, float saldo){
		this.numero=numero;
		this.cvv=cvv;
		this.mes=mes;
		this.an=an;
		this.saldo=saldo;
	}

	public void ahorrar(int entrada){
		this.saldo=this.saldo+entrada;
		JOptionPane.showMessageDialog(null,"Recarga exitosa","", JOptionPane.INFORMATION_MESSAGE);
	}

	public void gastar(int gasto) throws Exception {
        if(gasto>saldo)//Verifica si hay saldo suficiente para comprar
            throw(new InsuficientSald("Saldo insuficiente"));//Este es el mensaje que se manda
        else
        	saldo=saldo-gasto;
    }

	public float getSaldo(){
		return saldo;
	}

	public String getNumero(){
		return numero;
	}

	public int getCvv(){
		return cvv;
	}


	/*public void setSaldo(int saldo){
		this.saldo=saldo;
	}

	public void setNumero(long numero){
		this.numero=numero;
	}

	public void setCvv(int cvv){
		this.cvv=cvv;
	}

	public void setExpiracion(String expiracion){
		this.expiracion=expiracion;
	}*/

	public void cambiarTarjeta(String numero, int cvv, String mes, int an, float saldo){
		this.numero=numero;
		this.cvv=cvv;
		this.mes=mes;
		this.an=an;
		this.saldo=saldo;
	}
	
	public String getMes() {
		return mes;
	}
	public int getAn() {
		return an;
	}
	public void cambiarTarjeta() {
	}
}