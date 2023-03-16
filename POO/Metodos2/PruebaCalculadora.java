import java.util.Scanner;
public class PruebaCalculadora{
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      int n1, n2, opc;
      Calculadora calc = new Calculadora();
      
            
      System.out.print("Introduzca un numero entero: ");
      n1 = get.nextInt();
      System.out.print("Introduzca otro numero entero: ");
      n2 = get.nextInt();
      
      System.out.println("[1] Sumar\n[2] Multiplicar\n[3] Restar\n[4] Dividir");
      opc = get.nextInt();
      switch(opc){
         case 1:
            System.out.printf("%d + %d = %d", n1, n2, calc.sumar(n1,n2));
         break;
         case 2:
            System.out.printf("%d * %d = %d", n1, n2, calc.multiplicar(n1,n2));
         break;
         case 3:
            System.out.printf("%d - %d = %d", n1, n2, calc.restar(n1,n2));
         break;
         case 4:
            System.out.printf("%d / %d = %.2f", n1, n2, calc.dividir(n1,n2));
         break;
         default:
         
      }
      
      
   }
}