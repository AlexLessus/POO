import java.util.Scanner;
public class PruebaControlPrestamos {
   public static Scanner leer = new Scanner(System.in);
   public static void main(String args[]) {
     int opc;
     ControlPrestamos cp = new ControlPrestamos();
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
               catalogoTrabajadores(cp);
               break;
            case 2: 
               catalogoHerramientas(cp);
               break;
            case 3: 
            
               break;
            case 4: 
            
               break;
            default:
            
         }
      }while(opc != 4);
      
   }
   private static void limpiarPausar() {
      leer.nextLine(); //limpia el enter de la linea de entrada
      leer.nextLine(); //espera a que el usuario pulse ENTER
   }
   
   public static void catalogoTrabajadores(ControlPrestamos cp) {
      int opc;
      do{
         System.out.println("\nHORNOS MEXICANOS \t CATÁLOGO DE TRABAJADORES");
         System.out.println("[1] Alta de un trabajador");
         System.out.println("[2] Consulta de un trabajador");
         System.out.println("[3] Consulta de todos los trabajadores");
         System.out.println("[4] Regresar al menú principal");         
         System.out.print("¿Opcion deseada? [1-4]: ");
         opc = leer.nextInt();
         switch(opc) {
            case 1: 
               realizarAlta(cp, 1);
               break;
            case 2: 
               realizarConsultaIndividual(cp, 1);
               break;
            case 3: 
               realizarConsultaGeneral(cp, 1);
               break;
            case 4: 
               break;
            default:
            
         }
      }while(opc != 4);
      
      
   }
   public static void catalogoHerramientas(ControlPrestamos cp) {
      int opc;
      do{
         System.out.println("\nHORNOS MEXICANOS \t CATÁLOGO DE HERRAMIENTAS");
         System.out.println("[1] Alta de una herramienta");
         System.out.println("[2] Consulta de una herramienta");
         System.out.println("[3] Consulta de todas las herramientas");
         System.out.println("[4] Regresar al menú principal");         
         System.out.print("¿Opcion deseada? [1-4]: ");
         opc = leer.nextInt();
         switch(opc) {
            case 1: 
               realizarAlta(cp, 2);
               break;
            case 2: 
               realizarConsultaIndividual(cp, 2);
               break;
            case 3: 
               realizarConsultaGeneral(cp, 2);
               break;
            case 4: 
               break;
            default:
            
         }
      }while(opc != 4);

   }
   
   public static void controlPrestamos() {
         
   }
   
   public static void realizarAlta(ControlPrestamos cp, int opc) {
      int id, celda;
      String nombre;
      switch(opc) {
         case 1:
            String puesto;
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
         case 2:
            String marca;
            char estado;
            Herramienta h;
            if(cp.getContTrabajador() < cp.CANTIDAD_HERRAMIENTAS) {
               System.out.print("\nAlta de una herramienta");
               System.out.print("\nIngrese el id---------: ");
               id = leer.nextInt(); 
               celda = cp.busquedaHerramienta(id);
               if(celda == -1) {
                  leer.nextLine();
                  System.out.print("Nombre----------------: ");
                  nombre = leer.nextLine();
                  System.out.print("Marca-----------------: ");
                  marca = leer.nextLine();
                  System.out.print("Estado\n[A]Activo [D]Concluido: ");
                  estado = leer.nextLine().charAt(0);
                  h = new Herramienta(id, nombre, marca, estado);
                  cp.agregarHerramienta(h);
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
   
   public static void realizarConsultaIndividual(ControlPrestamos cp, int opc) {
      int id, celda;
      switch(opc) {
         case 1: 
            if(cp.getContTrabajador() > 0) {
               System.out.println("\nCONSULTA DE UN TRABAJADOR");
               System.out.print("Ingrese el ID: ");
               id = leer.nextInt();
               celda = cp.busquedaTrabajador(id);
               if(celda != -1) {
                  System.out.println(cp.getTrabajador(celda).toString());
                  System.out.print("Presione ENTER para continuar");
                  limpiarPausar();
               }else {
                  System.out.print("No existe un trabajador con este Id... Presione ENTER para continuar");
                  limpiarPausar();
               }
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();
            }
            break;
         case 2: 
            if(cp.getContHerramienta() > 0) {
               System.out.println("\nCONSULTA DE UNA HERRAMIENTA");
               System.out.print("Ingrese el ID: ");
               id = leer.nextInt();
               celda = cp.busquedaHerramienta(id);
               if(celda != -1) {
                  System.out.println(cp.getHerramienta(celda).toString());
                  System.out.print("Presione ENTER para continuar");
                  limpiarPausar();
               }else {
                  System.out.print("No existe una herramienta con este Id... Presione ENTER para continuar");
                  limpiarPausar();
               }
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();
            }
            break;
      }
   }
   private static void realizarConsultaGeneral(ControlPrestamos cp, int opc) {
      
      switch(opc) {
         case 1: 
            if(cp.getContTrabajador() > 0) {
               System.out.println("\nCONSULTA DE TODOS LOS TRABAJADORES");
               for(int i = 0; i < cp.getContTrabajador(); i++) {
                  System.out.println(cp.getTrabajador(i).toString());
                  System.out.println("----------------------");
                  
               }
               System.out.print("Fin de la consulta... Presione ENTER para continuar");
               limpiarPausar();
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();      
            }
            break;
         case 2: 
            if(cp.getContHerramienta() > 0) {
               System.out.println("\nCONSULTA DE TODOS LAS HERRMIENTAS");
               for(int i = 0; i < cp.getContHerramienta(); i++) {
                  System.out.println(cp.getHerramienta(i).toString());
                  System.out.println("----------------------");
                  
               }
               System.out.print("Fin de la consulta... Presione ENTER para continuar");
               limpiarPausar();
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();      
            }
            break;
      }
   }

}
