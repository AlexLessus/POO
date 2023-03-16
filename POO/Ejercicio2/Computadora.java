/*
   2.- Programa que construya 2 objetos de la clase Computadora con datos inventados por usted. 
   Los atributos de la clase Computadora son: marca, modelo, procesador, memoria RAM, disco duro. 
   Después, imprima los datos de cada una de las computadoras. Dibuje el diagrama de clases UML de la clase Computadora.
*/
public class Computadora {
   private String marca;
   private String modelo;
   private String procesador;
   private int ram;
   private int discoDuro;
   
   public Computadora() {   }
   
   public Computadora(String marca, String modelo, String procesador, int ram, int discoDuro) {
      this.marca = marca;
      this.modelo = modelo;
      this.procesador = procesador;
      this.ram = ram;
      this.discoDuro = discoDuro;
   }   
   
   public void print(){
      System.out.printf("Marca: %s\n", marca);
      System.out.printf("Modelo: %s\n", modelo);
      System.out.printf("Procesador: %s\n", procesador);
      System.out.printf("Memoria RAM: %dGB\n", ram);
      System.out.printf("Disco duro: %dGB\n", discoDuro);
   } 
}