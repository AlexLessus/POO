import java.util.Scanner;
public class PruebaControlPrestamos {
   public static Scanner leer = new Scanner(System.in);
   public static void main(String args[]) {
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
   
   public static void realizarAlta(ControlPrestamos cp, int opc) {
      int id, celda;
      switch(opc) {
         case 1:
            String nombre, puesto;
            Trabajador t;
            if(cp.getContTrabajador() < cp.CANTIDAD_TRABAJADORES) {
               System.out.print("\nAlta de un trabajador");
               System.out.print("\nIngrese el id---: ");
               id = leer.nextInt(); 
               celda = cp.busquedaTrabajador(id);
               if(celda == -1) {
                  leer.nextLine();
                  System.out.print("Nombre---------: ");
                  nombre = leer.nextLine();
                  System.out.print("Puesto---------: ");
                  puesto = leer.nextLine();
                  t = new Trabajador(id, nombre, puesto);
                  cp.agregarTrabajador(t);
                  System.out.print("Alta exitosa... Presione ENTER para continuar");
                  leer.nextLine();
               }else {
                  System.out.print("Ya existe un paciente con ese ID... Presione ENTER para continuar");
                  limpiarPausar();
               }    
            }else {
               System.out.print("El catalogo de trabajadores ya está lleno... Presione ENTER para continuar");
               limpiarPausar();
            }  
            break;
          
      }      
   }

   public static void catalogoHerramientas() {
         
   }
   
   public static void controlPrestamos() {
         
   }
   
   public static void realizarAlta() {
      
   }
}
