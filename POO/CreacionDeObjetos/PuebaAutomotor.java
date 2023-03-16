//e)Construya en otro archivo la clase PruebaAutomotor y agr�guele el m�todo main.
import java.util.Scanner;
public class PuebaAutomotor{
   public static void main(String args[]){
      //f)Construya el objeto auto1 de la clase Automotor que utilice al constructor vac�o.
      Automotor auto1 = new Automotor();//argumentos != parametros
      //g)Use el m�todo de ese objeto que imprime los atributos.
      System.out.println("Datos del objeto auto1");
      auto1.printData();
        
      /*h)Construya tres objetos de la clase Automotor con los siguientes datos:
         auto2:
            n�mero de pasajeros = 7
            capacidad del tanque de gasolina = 70
            consumo de gasolina en kil�metros por litro = 10
         auto3:
            n�mero de pasajeros = 5
            capacidad del tanque de gasolina = 46
            consumo de gasolina en kil�metros por litro = 15
         auto4:
            n�mero de pasajeros = 40
            capacidad del tanque de gasolina = 200
            consumo de gasolina en kil�metros por litro = 8
      */
      Automotor auto2 = new Automotor(7, 70f, 10f);
      Automotor auto3 = new Automotor(5, 46f, 15f);
      Automotor auto4 = new Automotor(40, 200f, 8f);
      
      
      //i)Use el m�todo que imprime los atributos para cada uno de los tres objetos creados en
      //el paso anterior
      System.out.println("----\nDatos del objeto auto2");
      auto3.printData();
      System.out.println("----\nDatos del objeto auto3");
      auto3.printData();
      System.out.println("----\nDatos del objeto auto4");
      auto4.printData();
      
      //j)Lea desde el teclado los datos de un nuevo auto (n�mero de pasajeros, capacidad del
      //tanque y consumo de gasolina).
      Scanner read = new Scanner(System.in);
      int numPas;
      float tanque, consumo;
      System.out.println("\n====\nIngrese el numero de pasajeros");
      numPas = read.nextInt();
      System.out.println("Ingrese la capacidad del tanque");
      tanque = read.nextFloat();
      System.out.println("Ingrese el consumo en lt/km");
      consumo = read.nextFloat();      
      
      //k)Construya el objeto auto5 de la clase Automotor con los datos le�dos.

      Automotor auto5 = new Automotor(numPas, tanque, consumo);
      
      //i)Use el m�todo de ese objeto que imprime los atributos
      auto5.printData();
   }
}