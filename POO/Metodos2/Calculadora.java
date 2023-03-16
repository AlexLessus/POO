/*
   2. Construya la clase Calculadora que mediante métodos calcule y regrese la suma,
      multiplicación, resta y división de dos números enteros recibidos como parámetros.
      Realice la clase PruebaCalculadora que contenga al método main, en él construya un
      objeto de la clase Calculadora, presente un menú con las opciones 1) Sumar, 2) multiplicar,
      3) Restar, 4) Dividir, 5) Finalizar programa y desde éste se manden ejecutar los métodos
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