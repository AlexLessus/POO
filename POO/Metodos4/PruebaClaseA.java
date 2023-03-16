import java.util.Scanner;
public class PruebaClaseA {
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      String nombres[] = new String[5];
      ClaseA nom = new ClaseA();
      
      System.out.println("Ingrese 5 nombres:");
      nom.llenar(nombres);
      
      System.out.println("\nNombres con menos de 6 letras: ");
      nom.menor6(nombres);
      
      System.out.println("\nCantidad de 'A' o 'a' en Nombres[0]: "+nom.cantidadA(nombres[0]));
   }  
}