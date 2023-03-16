//La clase Trabajador contendrá los atributos idTrabajador (int), nombre (String) y puesto (String), 
public class Trabajador {
   private int id;
   private String nombre;
   private String puesto;
   
   //un constructor que reciba información para inicializar a todos los atributos
   public Trabajador(int id, String nombre, String puesto) {
      this.id = id;
      this.nombre = nombre;
      this.puesto = puesto;
   } 
   
   //métodos get para cada atributo 
   public int getId() {
      return id;  
   }
   public String getNombre() {
      return nombre;   
   }
   public String getPuesto() {
      return puesto;
   }
   
   //el método toString.
   public String toString() {
      return "Datos del trabajador\n" + 
             "ID----: " + id + "\n" +
             "Nombre: " + nombre + "\n" +
             "Puesto: " + puesto;    
   }
}