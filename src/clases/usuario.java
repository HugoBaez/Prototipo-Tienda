package clases;

import java.io.Serializable;

public class usuario implements extra,Serializable{
	private String nombre;
	private String userName;
	private int pin;
	private int edad;
	private String direccion;
	private tarjeta tarje;
	private boolean tieTarje;
	private carrito carro;
	private historial history;
	private int compras;
	
	public usuario(String nombre, String userName,int pin,int edad,String direccion){
		this.nombre=nombre;
		this.userName=userName;
		this.pin=pin;
		this.edad=edad;
		this.direccion=direccion;
	}

	public usuario(String nombre, String userName,int pin,int edad,String direccion, carrito carro, tarjeta tarje){
		this.nombre=nombre;
		this.userName=userName;
		this.pin=pin;
		this.edad=edad;
		this.direccion=direccion;
		this.carro=carro;
		this.tarje=tarje;
	}
	public void modifUser(String nombre, String userName,int pin,int edad,String direccion){
		this.nombre=nombre;
		this.userName=userName;
		this.pin=pin;
		this.edad=edad;
		this.direccion=direccion;
	}
	public usuario(){
		this.tieTarje=false;
		this.compras=0;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUsername(){
		return userName;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	public int getPin(){
		return pin;
	}
	public int getCompras() {
		return compras;
	}
	
	public void anadirProdu(producto produ){
		carro.anadirProdu(produ);
	}

	public void ahorrar(int entrada){
		tarje.ahorrar(entrada);
	}

	public void gastar(int gasto) throws Exception{
		tarje.gastar(gasto);
	}

	public float getSaldo(){
		return tarje.getSaldo();
	}

	public String getNumero(){
		return tarje.getNumero();
	}

	public int getCvv(){
		return tarje.getCvv();
	}

	public String getMes() {
		return tarje.getMes();
	}
	
	public int getAn() {
		return tarje.getAn();
	}
	public void setTarjeta(tarjeta tarje) {
		this.tarje=tarje;
		this.tieTarje=true;
	}
	public boolean gettieTarje() {
		return tieTarje;
	}
	/*public void setSaldo(int saldo){
		tarje.setSaldo(saldo);
	}

	public void setNumero(long numero){
		tarje.setNumero(numero);
	}

	public void setCvv(int cvv){
		tarje.setCvv(cvv);
	}

	public void setExpiracion(String expiracion){
		tarje.setExpiracion(expiracion);
	}*/

	public void cambiarTarjeta(String numero, int cvv, String mes, int an, float saldo){
		tarje.cambiarTarjeta(numero,cvv,mes,an,saldo);
	}

	public String mostrar(int i){
		return carro.mostrar(i);
	}
	
	public void eliminarPro(int i){
		carro.eliminarPro(i);
	}

	public void eliminar(int i,int cant) throws Exception{
		carro.eliminar(i,cant);
	}

	public float costoTot(){
		 return carro.costoTot();
	}

	public int getNoProdu(){
		return carro.getNoProdu();
	}
	public void setHistorial(){
		//aqui deberia cargarse el archivo de historial
		this.history=history;
	}

	@Override
	public void cambiarTarjeta() {
		// TODO Auto-generated method stub
		
	}
}