/*
   2. Construya la clase Calculadora que mediante m�todos calcule y regrese la suma,
      multiplicaci�n, resta y divisi�n de dos n�meros enteros recibidos como par�metros.
      Realice la clase PruebaCalculadora que contenga al m�todo main, en �l construya un
      objeto de la clase Calculadora, presente un men� con las opciones 1) Sumar, 2) multiplicar,
      3) Restar, 4) Dividir, 5) Finalizar programa y desde �ste se manden ejecutar los m�todos
      adecuados del objeto de la clase Calculadora. Dibuje el diagrama de clases UML de la
      clase Calculadora.
*/
public class Calculadora {
   public int sumar(int n1, int n2){
      return n1 + n2;
   }
   public int multiplicar(int n1, int n2){
      return n1 * n2;
   }
   public int restar(int n1, int n2){
      return n1 - n2;
   }
   public float dividir(int n1, int n2){
      return n1 / n2;
   }
} 