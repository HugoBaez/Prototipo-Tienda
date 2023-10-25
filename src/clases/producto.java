package clases;

public abstract class producto {
    protected String descripcion;
    protected double id;
    protected float precio;
    protected float descuento;
    protected String modelo;
    protected String marca;
    protected String tamano;
    protected int cantidadDisponible;
    protected int cantidadUsuario;
     
     public producto (String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario ){
         this.descripcion = descripcion;
         this.id = id;
         this.precio = precio;
         this.descuento = descuento;
         this.modelo = modelo;
         this.marca = marca;
         this.tamano = tamano;
         this.cantidadDisponible = cantidadDisponible;
         this.cantidadUsuario = cantidadUsuario;
         
     }
     
     public float getTotal() {
    	 return precio*descuento*cantidadUsuario;
     }
     
     public String mostrar() {
    	 return "cadena de prueba";
     }
     
     public int getNoProdu() {
    	 return cantidadUsuario;
     }
}
