import java.util.Scanner;
public class PruebaControlPrestamos {
   public static void main(String args[]) {
     Scanner leer = new Scanner(System.in);
     int opc;
      do {
         System.out.println("\nHORNOS MEXICANOS");
         System.out.println("[1] Catálogo de trabajadores");
         System.out.println("[2] Catálogo de herramientas");
         System.out.println("[3] Control de préstamos de herramientas");
         System.out.println("[4] Finalizar programa");         
         System.out.print("¿Opcion deseada? [1-4]: ");
         opc = leer.nextInt();
         switch(opc) {
            case 1: 
               
               break;
            case 2: 
            
               break;
            case 3: 
            
               break;
            case 4: 
            
               break;
            default:
            
         }
      }while(opc != 4);
      
   }
   public static void catalogoTrabajadores() {
         
   }
   public static void catalogoHerramientas() {
         
   }
   public static void controlPrestamos() {
         
   }
}