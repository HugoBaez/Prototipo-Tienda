package clases;


public class ropa extends producto {
    
    protected String material;
    protected String composicion;
    protected String color;
    
    public ropa(String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario, String material, String composicion, String color){
        super(descripcion, id, precio, descuento, modelo, marca, tamano, cantidadDisponible, cantidadUsuario);
        this.material = material;
        this.composicion = composicion;
        this.color = color;
    }
    
}
