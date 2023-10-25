package clases;


class Celular extends producto{
    
    private String color; 
    private int memoria;
    private String resolucion;
    private int camara;
    private String sistemaOpe;
    
    public Celular(String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario ,String color, int memoria, String resolucion, int camara, String sistemaOpe){
         super(descripcion,id,precio,descuento,modelo,marca,tamano,cantidadDisponible,cantidadUsuario);
         this.color = color;
         this.resolucion = resolucion;
         this.camara = camara;
         this.sistemaOpe = sistemaOpe;
    }
    
}
