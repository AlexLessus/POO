/*
  4.- Programa que construya 2 objetos de la clase Compra con datos leídos desde el teclado. 
  Los atributos de la clase Compra son: número de compra, número de factura, nombre del proveedor, 
  fecha de la compra (dividido en día, mes y año), valor de la compra. 
  Después, imprima los datos de cada una de las compras. 
  Dibuje el diagrama de clases UML de la clase Compra.
  */
public class Compra {
   private int nCompra;
   private int nFactura;
   private String proveedor;
   private String fechaC;// dd/mm/aaa
   private float valorC;
   
   public Compra() {   }
   
   public Compra(int nCompra, int nFactura,  String proveedor, String fechaC, float valorC) {
      this.nCompra = nCompra;
      this.nFactura = nFactura;
      this.proveedor = proveedor;
      this.fechaC = fechaC;
      this.valorC = valorC;
   }   
   
   public void print(){
      System.out.printf("Numero de compra: %d\n", nCompra);
      System.out.printf("Numero de factura: %d\n", nFactura);
      System.out.printf("Nombre del proveedor: %s\n", proveedor);
      System.out.printf("Fecha de la compra: %s\n", fechaC);
      System.out.printf("Valor de la compra: %.2f\n", valorC);
   } 
   
}  