public class PruebaClaseA {
   public static void main(String args[]) {
      ClaseA nom = new ClaseA();
      System.out.println("Ingrese 5 nombres:");
      nom.llenar();
      
      
      System.out.println("\nNombres con menos de 6 letras: ");
      nom.menor6();
      
      System.out.println("\nCantidad de 'A' o 'a' en Nombres[0]: "+nom.cantidadA());
   }  
}