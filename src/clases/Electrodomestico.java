package clases;

 class Electrodomestico extends producto{
     
    private String color;
    private int voltaje;
    private int peso;
    
    public Electrodomestico (String descripcion, double id, float precio, float descuento, String modelo, String marca, String tamano, int cantidadDisponible, int cantidadUsuario,String color, int voltaje, int peso){
        
         super(descripcion, id, precio, descuento, modelo, marca, tamano, cantidadDisponible, cantidadUsuario);
         this.color = color;
         this.voltaje = voltaje;
         this.peso = peso;
        
    }
    
}
