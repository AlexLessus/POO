/*
   4. Modifique el programa 3 para que ahora el vector esté declarado en la clase
      PruebaClaseA y sea enviado como parámetro a los métodos de la clase ClaseA
*/
import java.util.Scanner;
public class ClaseAv2 {
      
   public void llenar(String nombres[]) {   
      Scanner get = new Scanner(System.in);
      for(int i = 0; i<nombres.length; i++) {
         System.out.printf("Nombre[%d]: ", i+1);
         nombres[i] = get.nextLine();
      }
   }
   
   public void menor6(String nombres[]){
      for(int i = 0; i<nombres.length; i++) {
         if(nombres[i].length() < 6)
            System.out.println(nombres[i]);
      }
   }
   
   public int cantidadA(String nombre){
      int a = 0;
      for(int i = 0; i<nombre.length(); i++) {
         if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'A')
            a++;
      }
      return a;
   }
}