import java.util.Scanner;
public class PruebaPassword {
   public static void main(String args[]) {
      Scanner get = new Scanner(System.in);
      final int TAM_ARREGLO;
      final int LONGITUD;
      Password passwords[]; 
      boolean fortalezas[];
      String esFuerte;
      
      System.out.print("�Cuantos passwords manejar� el programa? ");
      TAM_ARREGLO = get.nextInt();
      
      passwords = new Password[TAM_ARREGLO];
      
      System.out.print("\nIndique el tama�o de los passwords: ");
      LONGITUD = get.nextInt();
      
      fortalezas = new boolean[TAM_ARREGLO];
      
      for(int i = 0; i < TAM_ARREGLO; i++){
         passwords[i] = new Password(LONGITUD);
         fortalezas[i] = passwords[i].esFuerte();
         if(fortalezas[i]) {
            esFuerte = "La contrase�a es fuerte";
         }else {
            esFuerte = "La contrase�a no es fuerte";         
         }
         
         System.out.printf("%s %s\n", passwords[i].getPassword(), esFuerte);
      }
   }  
}