import java.util.Scanner;
public class PruebaCuentaBancaria {
   private static int numC;
   private static String nombre, tipo;
   private static float saldo;
   private static Scanner get = new Scanner(System.in);
   
   public static void main(String args[]) {
      System.out.println("Cuenta 1");
      llenarDatos();
      CuentaBancaria cuenta1 = new CuentaBancaria(numC, tipo, nombre, saldo);
      
      System.out.println("\nCuenta 2");
      llenarDatos();
      CuentaBancaria cuenta2 = new CuentaBancaria(numC, tipo, nombre, saldo);
      
      System.out.println("\n  Datos de la cuenta 1: ");
      cuenta1.print();
      System.out.println("\n  Datos de la cuenta 2: ");
      cuenta2.print();
      
      System.out.println("\n  Alexis De Jesus Perez Carmona 20/02/2023");
   }
   private static void llenarDatos() {
      System.out.print("Introduzca:\n Numero de cuenta: ");
      numC = get.nextInt();      get.nextLine();
      System.out.print(" Nombre del cliente: ");
      nombre = get.nextLine();
      System.out.print(" Tipo de cuenta: ");
      tipo = get.nextLine();
      System.out.print(" Saldo: ");
      saldo = get.nextFloat();   
   }
}