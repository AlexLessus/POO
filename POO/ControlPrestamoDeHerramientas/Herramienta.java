public class Herramienta {
   private int id;
   private String nombre;
   private String marca;
   private char estado;
   
   public Herramienta(int id, String nombre, String marca, char estado) {
      this.id = id;
      this.nombre = nombre;
      this.marca = marca;
      this.estado = estado;
   }
   
   public int getId() {
      return id;
   }
   public String getNombre() {
      return nombre;
   }
   public String getMarca() {
      return marca;
   }
   public char getEstado() {
      return estado;
   }
   
   public void setEstado(char estado) {
      this.estado = estado;
   }
   public String toString() {
      return "Datos del trabajador\n" + 
             "ID----: " + id + "\n" +
             "Nombre: " + nombre + "\n" +
             "Marca-: " + marca + "\n" +
             "Estado: " + estado();    
   }
   
   private String estado() {
      if(estado == 'P') 
         return "Prestada";
      else
         return "Disponible"; 
   }
}
