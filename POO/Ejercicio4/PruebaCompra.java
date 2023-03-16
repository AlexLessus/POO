import java.util.Scanner;
public class PruebaCompra {
   public static int nCompra, nFactura;
   public static String proveedor, fechaC;
   public static float valorC;
   public static Scanner get = new Scanner(System.in);
   
   public static void main(String args[]) {
      System.out.println("Compra 1");
      llenarDatos();
      Compra compra1 = new Compra(nCompra, nFactura, proveedor, fechaC, valorC);
      System.out.println("\nCompra 2");
      llenarDatos();
      Compra compra2 = new Compra(nCompra, nFactura, proveedor, fechaC, valorC);
      
      System.out.println("\n  Datos de la compra 1");
      compra1.print();
      System.out.println("\n  Datos de la compra 2");
      compra2.print();
      
      System.out.println("\n  Alexis De Jesus Perez Carmona 20/02/2023");
   }
   private static void llenarDatos() {
      System.out.print("Introduzca:\n Numero de compra: ");
      nCompra = get.nextInt();      
      System.out.print(" Numero de factura: ");
      nFactura = get.nextInt();  get.nextLine();
      System.out.print(" Nombre del Proveedor: ");
      proveedor = get.nextLine();
      System.out.print(" Fecha de la compra(dd/mm/aaaa): ");
      fechaC = get.nextLine();   
      System.out.print(" Valor de la compra: ");
      valorC = get.nextFloat();   
   }
}