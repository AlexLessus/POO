/*
   5.- 
*/
public class Automotor{
   private int numPas;
   private float tanque;
   private float consumo;
   //b) Agregue a la clase automotor un contructor vacio
   public Automotor(){
   
   }
   //c) Agregue a la clase Automotor un constructor que sea capaz de recibir el número de
   //pasajeros, la capacidad del tanque y el consumo, para inicializar los atributos
   public Automotor(int numPas, float tanque, float consumo){
      //atributo = parametro
      this.numPas = numPas;
      this.tanque = tanque;
      this.consumo = consumo;
   }
   //d)Agregue a la clase Automotor un método que permita imprimir los atributos.
   public void printData(){
      System.out.printf("Numero de pasajeros: %d\n", numPas);
      System.out.printf("Conbustible en el tanque: %.2f\n", tanque);
      System.out.printf("Consumo en km/lt: %.2f\n", consumo);
   }
   
   
}