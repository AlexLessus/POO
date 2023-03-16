import java.util.Scanner;
public class PruebaClaseAv2 {
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      String nombres[] = new String[5];
      ClaseAv2 nom = new ClaseAv2();
      
      nom.llenar(nombres);
      nom.menor6(nombres);
      
      System.out.println("\nCantidad de 'A' o 'a' en Nombres[0]: "+nom.cantidadA(nombres[0]));
   }  
}