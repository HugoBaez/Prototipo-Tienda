package clases;


public class computo extends producto{
	private String procesador;
	private String disco;
	private String ram;
	private String sistemaOpe;
	private String resolucion;
	private int peso;

	public computo(String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario, String procesador, String disco, String ram, String sistemaOpe, String resolucion, int peso){
		super(descripcion,id, precio,descuento,modelo, marca,tamano,cantidadDisponible,cantidadUsuario );
		this.procesador=procesador;
		this.disco=disco;
		this.ram=ram;
		this.sistemaOpe=sistemaOpe;
		this.resolucion=resolucion;
		this.peso=peso;
	}

}