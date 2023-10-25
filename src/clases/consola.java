package clases;


public class consola extends producto{
	protected int capacidad;
	protected String edicion;

	public consola(String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario ,int capacidad, String edicion){
		super(descripcion,id, precio,descuento,modelo, marca,tamano,cantidadDisponible,cantidadUsuario );
		this.capacidad=capacidad;
		this.edicion=edicion;
	}

}