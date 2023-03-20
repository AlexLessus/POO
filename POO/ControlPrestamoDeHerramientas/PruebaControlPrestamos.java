import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PruebaControlPrestamos {
   public static Scanner leer = new Scanner(System.in);
   public static void main(String args[]) {
     int opc;
     ControlPrestamos cp = new ControlPrestamos();
     do {
         System.out.println("\n\tHORNOS MEXICANOS");
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
               catalogoPrestamos(cp);
               break;
            case 4: 
               System.out.println("\n\t\t PROGRAMA FINALIZADO");
               break;
            default:
               System.out.println("\n(!) Opción no valida");
               break;
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
               System.out.println("\n(!) Opción no valida");
               break;
            
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
               System.out.println("\n(!) Opción no valida");
               break;
            
         }
      }while(opc != 4);

   }
   
   public static void catalogoPrestamos(ControlPrestamos cp) {
      int opc;
      do{
         System.out.println("\nHORNOS MEXICANOS \t CONTROL DE PRÉSTAMOS DE HERRAMIENTAS ");
         System.out.println("[1] Registrar préstamo");
         System.out.println("[2] Registrar devolución");
         System.out.println("[3] Consultar préstamo");
         System.out.println("[4] Reporte de préstamos activos"); 
         System.out.println("[5] Reporte de préstamos concluidos");        
         System.out.println("[6] Regresar al menú principal");  
         System.out.print("¿Opcion deseada? [1-6]: ");
         opc = leer.nextInt();
         switch(opc) {
            case 1: 
               realizarAlta(cp, 3);
               break;
            case 2: 
               realizarAlta(cp, 4);
               break;
            case 3: 
               realizarConsultaIndividual(cp, 3);
               break;
            case 4: 
               realizarConsultaGeneral(cp, 3);
               break;
            case 5:
               realizarConsultaGeneral(cp, 4);
            default:
               System.out.println("\n(!) Opción no valida");
               break;
            
         }
      }while(opc != 6);

   }
   
   public static void realizarAlta(ControlPrestamos cp, int opc) {
      int id, celda;
      String nombre;
      switch(opc) {
         case 1:
            String puesto;
            Trabajador t;
            if(cp.getContTrabajador() < cp.CANTIDAD_TRABAJADORES) {
               System.out.print("\nCATÁLOGO DE TRABAJADORES \t ALTA DE UN TRABAJADOR");
               System.out.print("\nIngrese el id: ");
               id = leer.nextInt(); 
               celda = cp.busquedaTrabajador(id);
               if(celda == -1) {
                  leer.nextLine();
                  System.out.print("Nombre-------: ");
                  nombre = leer.nextLine();
                  System.out.print("Puesto-------: ");
                  puesto = leer.nextLine();
                  t = new Trabajador(id, nombre, puesto);
                  cp.agregarTrabajador(t);
                  System.out.print("Alta exitosa... Presione ENTER para continuar");
                  leer.nextLine();
               }else {
                  System.out.print("Ya existe un trabajador con ese ID... Presione ENTER para continuar");
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
            if(cp.getContHerramienta() < cp.CANTIDAD_HERRAMIENTAS) {
               System.out.print("\nCATÁLOGO DE HERRAMIENTAS \t ALTA DE UNA HERRAMIENTA");
               System.out.print("\nIngrese el id: ");
               id = leer.nextInt(); 
               celda = cp.busquedaHerramienta(id);
               if(celda == -1) {
                  leer.nextLine();
                  System.out.print("Nombre-------: ");
                  nombre = leer.nextLine();
                  System.out.print("Marca--------: ");
                  marca = leer.nextLine();
                  h = new Herramienta(id, nombre, marca, 'D');
                  cp.agregarHerramienta(h);
                  System.out.print("Alta exitosa... Presione ENTER para continuar");
                  leer.nextLine();
               }else {
                  System.out.print("Ya existe una herramienta con ese ID... Presione ENTER para continuar");
                  limpiarPausar();
               }    
            }else {
               System.out.print("El catalogo de herramientas ya está lleno... Presione ENTER para continuar");
               limpiarPausar();
            }  
            break;
         case 3:
            String fechaPrestamo;
            int idT, idH;
            Prestamo p;
            if(cp.getContPrestamo() < cp.CANTIDAD_PRESTAMOS && cp.getContHerramienta() > 0 && cp.getContTrabajador() > 0) {
               System.out.println("\nCONTROL DE PRÉSTAMOS DE HERRAMIENTAS \t REGISTRAR PRÉSTAMO");
               System.out.printf("Numero de prestamo: %d", cp.getContPrestamo()+1);
               
               System.out.print("\nIngrese el id del trabajador: ");
               idT = leer.nextInt(); 
               celda = cp.busquedaTrabajador(idT);
               if(celda != -1) {
                  System.out.printf("Nombre del trabajador: %s", cp.getTrabajador(celda).getNombre());
               }else {
                  System.out.print("No se encuentra registrado el id ingresado... Presione ENTER para continuar");
                  break;
               }
               
               System.out.print("\nIngrese el id de la herramienta: ");
               idH = leer.nextInt();
               celda = cp.busquedaHerramienta(idH);
               if(celda != -1) {
                  if(cp.getHerramienta(celda).getEstado() == 'P') {
                     System.out.print("La herramienta se encuentra prestada... Presione ENTER para continuar");
                     limpiarPausar();
                     break;
                  }
                  System.out.printf("Nombre de la herramienta: %s", cp.getHerramienta(celda).getNombre());
               }else{
                  System.out.print("No se encuentra registrado el id ingresado... Presione ENTER para continuar");
                  break;
               }
               
               System.out.print("\nIngrese la fecha del prestamo [dd/mm/aaaa]: ");
               leer.nextLine();
               fechaPrestamo = leer.nextLine();
               System.out.print("¿Está seguro de registrar el prestamo? [1=Si, 2=No]: ");
               if(leer.nextInt() == 1) {
                  cp.getHerramienta(celda).setEstado('P');
                  p = new Prestamo(cp.getContPrestamo()+1, idT, idH, fechaPrestamo, null, 'A');
                  cp.agregarPrestamo(p);
                  System.out.print("Prestamo registrado correctamente... Presione ENTER para continuar");
                  limpiarPausar();
               }else {
                  System.out.print("Prestamo cancelado... Presione ENTER para continuar");
                  limpiarPausar();
               }
            }else {
               System.out.print("Uno de los catalogos está vacio o lleno... Presione ENTER para continuar");
               limpiarPausar();
            }
            break;
         //Registrar devolucion
         case 4:
            String fechaP, fechaD;
            int celdaTH;
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha1, fecha2;
            if(cp.getContPrestamo() > 0) {
               System.out.print("\nCONTROL DE PRÉSTAMOS DE HERRAMIENTAS \t REGISTRAR DEVOLUCIÓN");
               System.out.printf("\nNumero de prestamo: ");
               id = leer.nextInt();
               leer.nextLine();
               celda = cp.busquedaPrestamo(id);               
               if(celda != -1) {
                  id = cp.getPrestamo(celda).getIdTrabajador();                  
                  celdaTH = cp.busquedaTrabajador(id);
                  System.out.printf("ID del trabajador: %d",id );
                  System.out.printf("\nNombre del trabajador: %s", cp.getTrabajador(celdaTH).getNombre());
                  
                  id = cp.getPrestamo(celda).getIdHerramienta();
                  celdaTH = cp.busquedaHerramienta(id);
                  System.out.printf("\nID de la herramienta: %d", id);
                  System.out.printf("\nNombre de la herramienta: %s", cp.getHerramienta(celdaTH).getNombre());
                  fechaP = cp.getPrestamo(celda).getFechaPrestamo();
                  
                  System.out.printf("\nFecha del prestamo: %s", fechaP);
                  fecha1 = LocalDate.parse(fechaP, formato);
                  
                  System.out.printf("\nFecha de la devolucion: ");
                  fechaD = leer.nextLine();
                  fecha2 = LocalDate.parse(fechaD, formato);
                  if(fecha1.isAfter(fecha2)) {
                     System.out.print("La fecha debe ser después de la fecha del prestamo... Presione ENTER para continuar");
                     limpiarPausar(); 
                     break;
                  }               
                  System.out.print("¿Está seguro de registrar el prestamo? [1=Si, 2=No]: ");
                  if(leer.nextInt() == 1) {
                     cp.getPrestamo(celda).setFechaDevolucion(fechaD);
                     cp.getPrestamo(celda).setEstado('C');
                     System.out.print("Herramienta devuelta correctamente... Presione ENTER para continuar");
                     limpiarPausar();
                  }else {
                     System.out.print("Devolución cancelada... Presione ENTER para continuar");
                     limpiarPausar();
                  }
               }else {
                  System.out.print("No existe un prestamo con este Id... Presione ENTER para continuar");
                  limpiarPausar();
               }
            }else{ 
               System.out.print("No hay prestamos registrados... Presione ENTER para continuar");
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
         case 3:
         int celdaTH;
            if(cp.getContPrestamo() > 0) {
               System.out.println("\nCONTROL DE PRÉSTAMOS DE HERRAMIENTAS \t CONSULTAR PRÉSTAMO");
               System.out.print("Ingrese el ID: ");
               id = leer.nextInt();
               celda = cp.busquedaPrestamo(id);
               if(celda != -1) {
                  id = cp.getPrestamo(celda).getIdTrabajador();                  
                  celdaTH = cp.busquedaTrabajador(id);
                  System.out.printf("ID del trabajador: %d", id);
                  System.out.printf("\nNombre del trabajador: %s", cp.getTrabajador(celdaTH).getNombre());
                  id = cp.getPrestamo(celda).getIdHerramienta();
                  celdaTH = cp.busquedaHerramienta(id);
                  System.out.printf("\nID de la herramienta: %d", id);
                  System.out.printf("\nNombre de la herramienta: %s", cp.getHerramienta(celdaTH).getNombre());
                  System.out.printf("\nFecha del prestamo: %s", cp.getPrestamo(celda).getFechaPrestamo()); 

                  if(cp.getPrestamo(cp.getPrestamo(celda).getNumPrestamo()-1).getEstado() == 'C') 
                     System.out.printf("\nFecha de devolucion: %s\n", cp.getPrestamo(celda).getFechaDevolucion()); 
                  else
                     System.out.print("\nEstado: Activo\n");
                  System.out.print("Presione ENTER para continuar");
                  limpiarPausar();
               }else {
                  System.out.print("No existe una herramienta con este Id... Presione ENTER para continuar");
                  limpiarPausar();
               }
            }else {
               System.out.print("No hay prestamos registrados... Presione ENTER para continuar");
               limpiarPausar();
            }
            break;
      }
   }
   
   private static void realizarConsultaGeneral(ControlPrestamos cp, int opc) {
      int celda, celdaTH, id;
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
         case 3:
            if(cp.getContPrestamo() > 0) {
               System.out.println("\nCONTROL DE PRÉSTAMOS DE HERRAMIENTAS \t REPORTE DE PRÉSTAMOS ACTIVOS");
               for(int i = 0; i < cp.getContPrestamo(); i++) {
                  if(cp.getPrestamo(cp.getPrestamo(i).getNumPrestamo()-1).getEstado() == 'A') {
                     id = cp.getPrestamo(i).getIdTrabajador();                  
                     celdaTH = cp.busquedaTrabajador(id);
                     System.out.printf("ID del trabajador: %d", id);
                     System.out.printf("\nNombre del trabajador: %s", cp.getTrabajador(celdaTH).getNombre());
                     id = cp.getPrestamo(i).getIdHerramienta();
                     celdaTH = cp.busquedaHerramienta(id);
                     System.out.printf("\nID de la herramienta: %d", id);
                     System.out.printf("\nNombre de la herramienta: %s", cp.getHerramienta(celdaTH).getNombre());
                     System.out.printf("\nFecha del prestamo: %s\n", cp.getPrestamo(i).getFechaPrestamo()); 
                     System.out.println("-----------------------------------");
                  }
               }
               System.out.print("Fin del reporte.. Presione ENTER para continuar");
               limpiarPausar();
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();
            }
            break;
         case 4:
            if(cp.getContPrestamo() > 0) {
               System.out.println("\nCONTROL DE PRÉSTAMOS DE HERRAMIENTAS \t REPORTE DE PRÉSTAMOS CONCLUIDOS");
               for(int i = 0; i < cp.getContPrestamo(); i++) {
                  if(cp.getPrestamo(cp.getPrestamo(i).getNumPrestamo()-1).getEstado() == 'C') {
                     id = cp.getPrestamo(i).getIdTrabajador();                  
                     celdaTH = cp.busquedaTrabajador(id);
                     System.out.printf("ID del trabajador: %d", id);
                     System.out.printf("\nNombre del trabajador: %s", cp.getTrabajador(i).getNombre());
                     id = cp.getPrestamo(i).getIdHerramienta();
                     celdaTH = cp.busquedaHerramienta(id);
                     System.out.printf("\nID de la herramienta: %d", id);
                     System.out.printf("\nNombre de la herramienta: %s", cp.getHerramienta(celdaTH).getNombre());
                     System.out.printf("\nFecha del prestamo: %s", cp.getPrestamo(i).getFechaPrestamo()); 
                     System.out.printf("\nFecha de devolucion: %s\n", cp.getPrestamo(i).getFechaDevolucion()); 
                     System.out.println("-----------------------------------");
                  }
               }
               System.out.print("Fin del reporte.. Presione ENTER para continuar");
               limpiarPausar();
            }else {
               System.out.print("El catalgo está vacio... Presione ENTER para continuar");
               limpiarPausar();
            }            
            break;
      }
   }
}
