import java.util.Scanner;
public class Prueba2Automotor {
   public static void main(String args[]) {
      Automotor autos[] = new Automotor[5];
      
      autos[0] = new Automotor();
      System.out.println("------\nAuto 0: ");
      autos[0].printData();
      
      
      autos[1] = new Automotor(2, 70f, 10f);
      autos[2] = new Automotor(5, 46f, 15f);
      autos[3] = new Automotor(40, 200f, 8f);
      // ==
      //Automotor auto = new Automotor(40, 200f, 8f);
      //autos[3] = auto;  
      
      System.out.println("------\nAuto 1: ");
      autos[1].printData();
      System.out.println("------\nAuto 2: ");
      autos[2].printData();
      System.out.println("------\nAuto 3: ");
      autos[3].printData();
      
      Scanner get = new Scanner(System.in);
      int numPas;
      float tanque, consumo;
      System.out.println("\n====\nIngrese el numero de pasajeros");
      numPas = get.nextInt();
      System.out.println("Ingrese la capacidad del tanque");
      tanque = get.nextFloat();
      System.out.println("Ingrese el consumo en lt/km");
      consumo = get.nextFloat();      
      
      autos[4] = new Automotor(numPas, tanque, consumo);

      System.out.println("------\nAuto 4: ");
      autos[4].printData();
      
      System.out.println("\nContenido del arreglo autos: ");
      for(int i=0; i<autos.length; i++){
         System.out.println("----\nAuto "+i);
         autos[i].printData();
      }
   }
}