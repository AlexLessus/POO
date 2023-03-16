import java.util.Scanner;
public class PruebaCatalogoPacientes {
   //Variable global
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[]) {
      int opc, cantidadPacientes;
      
      System.out.print("Ingrese la cantidad de pacientes que contendrá el catalogo: ");
      cantidadPacientes = leer.nextInt();
      CatalogoPacientes cp = new CatalogoPacientes(cantidadPacientes);
      
      do{
         System.out.println("\nHOSTPITAL PUERTA DE COBRE - CATALOGO DE PACIENTES ");
         System.out.println("[1] Alta de un paciente");
         System.out.println("[2] Consulta de un paciente");
         System.out.println("[3] Consulta de todos los pacientes");
         System.out.println("[4] Modificacion de un paciente");
         System.out.println("[5] Baja de un paciente");
         System.out.println("[6] Finalizar programa");         
         System.out.print("¿Opcion deseada? [1-6]: ");
         opc = leer.nextInt();
         switch(opc) {
               case 1: //Alta de un paciente
                  realizarAlta(cp, cantidadPacientes);
                  break;
                  
               case 2: //Consulta de un paciente
                  realizarConsultaIndividual(cp);
                  break;   
                  
               case 3: //Consulta de todos los pacientes
                  realizarConsultaGeneral(cp);                  
                  break;
                  
               case 4: //Modificacion de un paciente
                  realizarModificacion(cp);
                  break;
               case 5: //Baja de un paciente
                  realizarBaja(cp);           
                  break;
               case 6: 
                  System.out.println("Programa finalizado");
                  break;
               default:
                  System.out.print("Opcion no valida... Presiona ENTER para continuar");
                  limpiarPausar();
         }
         
      }while(opc != 6);
      
   }
   
   private static void limpiarPausar() {
      leer.nextLine(); //limpia el enter de la linea de entrada
      leer.nextLine(); //espera a que el usuario pulse ENTER
   }
   
   static private void realizarAlta(CatalogoPacientes cp, int cantidadPacientes) {
      int id, celda, edad;
      String nombre, expediente;
      float peso;
      Paciente p;
      
      if(cp.getCont() < cantidadPacientes) {
         System.out.print("\nAlta de un paciente");
         System.out.print("\nIngrese el id---: ");
         id = leer.nextInt(); 
         celda = cp.busqueda(id);
         if(celda == -1) {
            leer.nextLine();
            System.out.print("Nombre----------: ");
            nombre = leer.nextLine();
            System.out.print("Edad------------: ");
            edad = leer.nextInt();
            System.out.print("Peso------------: ");
            peso = leer.nextFloat();
            leer.nextLine();
            System.out.print("Expediente------: ");
            expediente = leer.nextLine();
            p = new Paciente(id, nombre, edad, peso, expediente);
            cp.agregar(p);
            System.out.print("Alta exitosa... Presione ENTER para continuar");
            leer.nextLine();
         }else {
            System.out.print("Ya existe un paciente con ese ID... Presione ENTER para continuar");
            limpiarPausar();
         }         
      }else {
         System.out.print("El catalogo ya está lleno... Presione ENTER para continuar");
         limpiarPausar();
      }
   }
   
   private static void realizarConsultaIndividual(CatalogoPacientes cp) {
      int celda, id;
      if(cp.getCont()>0) {
            System.out.println("\nCONSULTA DE UN PACIENTE");
            System.out.print("Ingrese el ID: ");
            id = leer.nextInt();
            celda = cp.busqueda(id);
            if(celda != -1) {
               System.out.println(cp.getPaciente(celda).toString());
               System.out.print("Presione ENTER para continuar");
               limpiarPausar();
            }else {
               System.out.print("No existe un paciente con este Id... Presione ENTER para continuar");
               limpiarPausar();
            }
      }else {
            System.out.print("El catalgo está vacio... Presione ENTER para continuar");
            limpiarPausar();
      }
   }
   
   private static void realizarConsultaGeneral(CatalogoPacientes cp) {
      if(cp.getCont() > 0) {
         System.out.println("\nCONSULTA DE TODOS LOS PACIENTES");
         for(int i = 0; i < cp.getCont(); i++) {
            System.out.println(cp.getPaciente(i).toString());
            System.out.println("----------------------");
            
         }
         System.out.print("Fin de la consulta... Presione ENTER para continuar");
         limpiarPausar();
      }else {
         System.out.print("El catalgo está vacio... Presione ENTER para continuar");
         limpiarPausar();      
      }
   }
   
   
   private static void realizarModificacion(CatalogoPacientes cp) {
      int id, celda, campo;
      Paciente p;
      
      if(cp.getCont() > 0) {
         System.out.println("\nMODIFICACION DE UN PACIENTE");
         System.out.print("Ingrese el ID: ");
         id = leer.nextInt();
         celda = cp.busqueda(id);
         if(celda != -1) {
            p = cp.getPaciente(celda);
            do{
                 System.out.printf("\nId: %d\n" ,p.getId());
                 System.out.printf("[1] Nombre----: %s\n", p.getNombre());
                 System.out.printf("[2] Edad------: %d\n", p.getEdad());
                 System.out.printf("[3] Peso------: %.2f\n", p.getPeso());
                 System.out.printf("[4] Expediente: \n\t\t- %s\n", p.getExpediente()); 
                 System.out.println("[5] Ninguno---:");
                 System.out.print("¿Campo a modificar? [1-5]: ");
                 campo = leer.nextInt();
                 switch (campo) {
                     case 1:
                        leer.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        p.setNombre(leer.nextLine());
                        break;
                     case 2:
                        System.out.print("Ingrese la edad: ");
                        p.setEdad(leer.nextInt());
                        break;
                     case 3:
                        System.out.print("Ingrese el peso: ");
                        p.setPeso(leer.nextFloat());
                        break;
                     case 4:
                        leer.nextLine();
                        System.out.print("Ingrese el Expediente: ");
                        p.setExpediente(p.getExpediente() + "\n\t\t-" + leer.nextLine());
                        break;
                     case 5:
                        break;
                     default:
                        System.out.print("Campo no valido... Presione ENTER para continuar");
                        limpiarPausar();                        
                 }
            } while(campo != 5);  
            
            //cp.modificar(p, celda);
            System.out.print("Modificacion exitosa... Presione ENTER para continuar");
            limpiarPausar();
         }else {
            System.out.print("No existe un paciente con este Id... Presione ENTER para continuar");
            limpiarPausar();
         }

      }else {
         System.out.print("El catalgo está vacio... Presione ENTER para continuar");
         limpiarPausar();         
      }
   }
   
   private static void realizarBaja(CatalogoPacientes cp) {
      int celda, id, resp;
      if(cp.getCont()>0) {
            System.out.println("\nELMINACION DE UN PACIENTE");
            System.out.print("Ingrese el ID: ");
            id = leer.nextInt();
            celda = cp.busqueda(id);
            if(celda != -1) {
               System.out.println(cp.getPaciente(celda).toString());
               System.out.print("¿Está seguro de eliminar a este paciente? [1=si, 2=no]: ");
               resp = leer.nextInt();
               if(resp == 1) {
                  cp.eliminar(celda);
                  System.out.print("Baja exitosa... Presione ENTER para continuar");
                  limpiarPausar();                    
               }
            }else {
               System.out.print("No existe un paciente con este Id... Presione ENTER para continuar");
               limpiarPausar();
            }
      }else {
            System.out.print("El catalgo está vacio... Presione ENTER para continuar");
            limpiarPausar();
      }
   }
   

   
}
