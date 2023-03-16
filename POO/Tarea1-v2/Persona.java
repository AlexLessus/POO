public class Persona{
   private String nombre;
   private int edad;
   private float estatura;
   
   public Persona(){
      
   }
   public Persona(String nombre, int edad, float estatura){
      this.nombre = nombre;
      this.edad = edad;
      this.estatura = estatura;
      
   } 
   public void ImpPersona(){
      System.out.printf("----\nNombre: %s\nEdad: %d\nEstatura: %.2f\n", nombre, edad, estatura);
   }
}