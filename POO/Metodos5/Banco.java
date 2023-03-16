/*
   5. Construya un programa que permita simular el manejo de una cuenta bancaria (crear
      cuenta, depositar, retirar y consultar saldo). E\l programa debe solicitar al usuario el saldo
      inicial con el que se creará la cuenta y enviar éste al método constructor de la cuenta para
      inicializar a una variable de instancia con dicho saldo. Después de esto, el usuario podrá
      realizar tantos depósitos, retiros y consultas de saldo como desee, la única restricción es que
      el usuario no podrá retirar más dinero del que tenga cómo saldo
*/
public class Banco{ 
   private float saldo;
   
   public Banco() {   }
   
   public Banco(float saldo) {
      this.saldo = saldo;
   }
   
   public void depositar(float deposito) {
      saldo += deposito;
   }
   
   public void retirar(float retiro) { 
      if(saldo < retiro)
         System.out.println("(!) Saldo insuficiente (!)");
      else
         saldo -= retiro;
   }
   
   public float getSaldo() {
      return saldo;
   }   
}