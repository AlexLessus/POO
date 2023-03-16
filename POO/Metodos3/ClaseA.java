/*
   3. Construya la clase ClaseA que a través de un método almacene 5 nombres de personas
      en un arreglo declarado como atributo de dicha clase. Haga un método que encuentre e
      imprima los nombres de menos de 6 letras. Haga un método que devuelva la cantidad de
      letras "A" o "a" que tiene el nombre que se encuentre en la celda cero del arreglo. Uso
      obligatorio de ciclos. Construya la clase PruebaClaseA que contenga al método main,
      construya un objeto de la clase claseA y pruebe los métodos de dicho objeto. Dibuje el
      diagrama de clases UML de la clase ClaseA.
*/
import java.util.Scanner;
public class ClaseA {
   private String nombres[] = new String[5];
   
   public void llenar() {
      Scanner get = new Scanner(System.in);
      for(int i = 0; i<nombres.length; i++) {
         System.out.printf("Nombre[%d]: ", i+1);
         nombres[i] = get.nextLine();
      }
   }
   
   public void menor6(){
      for(int i = 0; i<nombres.length; i++) {
         if(nombres[i].length() < 6)
            System.out.println(nombres[i]);
      }
   }
   
   public int cantidadA(){
      int a = 0;
      for(int i = 0; i<nombres[0].length(); i++) {
         if(nombres[0].charAt(i) == 'a' || nombres[0].charAt(i) == 'A')
            a++;
      }
      return a;
   }
}