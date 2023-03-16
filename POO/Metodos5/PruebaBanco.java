import java.util.Scanner;
public class PruebaBanco {
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      int opc;
      
      System.out.print("Saldo inicial: ");
      Banco cuenta = new Banco(get.nextFloat());
      
      do{
         System.out.println("______________");
         System.out.print(" [1] Depositar\n [2] Retirar\n [3] Consultar\n [4] Salir\nSeleccione una opción:");
         opc = get.nextInt();
         switch(opc){
            case 1:
               System.out.print("----\nCantidad a depositar: ");
               cuenta.depositar(get.nextFloat());            
               break;
            case 2:
               System.out.print("----\nCantidad a retirar: ");
               cuenta.retirar(get.nextFloat());
            break;
            case 3:
               System.out.printf("----\nSaldo en la cuenta: $%.2f\n", cuenta.getSaldo());
            break;
            default:
               System.out.println(" (!) Opción no valida");
            break;
         }
      }while(opc != 4);
      
   }
}