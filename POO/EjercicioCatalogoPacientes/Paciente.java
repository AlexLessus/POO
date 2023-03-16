public class Paciente {
   //Atributos
   private int id;
   private String nombre;
   private int edad;
   private float peso;
   private String expediente;
   
   public Paciente() {  }
   
   //Constructor
   public Paciente(int id, String nombre, int edad, float peso, String expediente) {
      this.id = id;
      this.nombre = nombre;
      this.edad = edad;
      this.peso = peso;
      this.expediente = expediente;
   }
   
   //setters
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public void setEdad(int edad) {
      this.edad = edad;
   }
   public void setPeso(float peso) {
      this.peso = peso;
   }
   public void setExpediente(String expediente) {
      this.expediente = expediente;
   }
   
   //getters
   public int getId() {
      return id;
   }
   public String getNombre() {
      return nombre;
   }
   public int getEdad() {
      return edad;
   }  
   public float getPeso() {
      return peso;
   }
   public String getExpediente() {
      return expediente;
   }
   //  \t = tabulacion
   public String toString() {
      return "Datos del paciente\n" + 
             "ID--------: " + id + "\n" +
             "Nombre----: " + nombre + "\n" +
             "Edad------: " + edad + " años\n" +
             "Peso------: " + peso + " kg.\n" +
             "Expediente: \n\t\t- " + expediente;
   }
}