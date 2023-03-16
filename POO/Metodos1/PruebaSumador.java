import java.util.Scanner;
public class PruebaSumador{
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      int n1, n2;
      Sumador sum = new Sumador();
      
      System.out.println("Introduzca un numero entero: ");
      n1 = get.nextInt();
      System.out.println("Introduzca otro numero entero: ");
      n2 = get.nextInt();
      
      System.out.printf("%d + %d = %d", n1, n2, sum.suma(n1,n2));
   }
}