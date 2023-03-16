/*
  3.- Programa que construya 2 objetos de la clase CuentaBancaria con datos leídos desde el teclado. 
  Los atributos de la clase CuentaBancaria son: número de cuenta, nombre del cliente, tipo de cuenta, 
  saldo. Después, imprima los datos de cada una de las cuentas.
  Dibuje el diagrama de clases UML de la clase CuentaBancaria.*/
public class CuentaBancaria {
   private String nombre;
   private String tipo;
   private int numC;
   private float saldo;
   
   public CuentaBancaria() {   }
   
   public CuentaBancaria(int numC, String tipo, String nombre, float saldo) {
      this.numC = numC;
      this.tipo = tipo;
      this.nombre = nombre;
      this.saldo = saldo;
   }   
   
   public void print(){
      System.out.printf("Numero de cuenta: %d\n", numC);
      System.out.printf("Tipo de cuenta: %s\n", tipo);
      System.out.printf("Nombre del cliente: %s\n", nombre);
      System.out.printf("Saldo: %.2f$\n", saldo);
   } 
   
}