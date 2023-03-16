public class Persona{
   private String nombre;
   private int edad;
   private float estatura;
   
   public Persona(){
      
   }
   public Persona(String name, int age, float heigth){
      nombre = name;
      edad = age;
      estatura = heigth;
      
   } 
   public void ImpPersona(){
      System.out.printf("----\nNombre: %s\nEdad: %d\nEstatura: %.2f\n", nombre, edad, estatura);
   }
}