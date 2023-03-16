/*
   5. Construya un programa que permita simular el manejo de una cuenta bancaria (crear
      cuenta, depositar, retirar y consultar saldo). E\l programa debe solicitar al usuario el saldo
      inicial con el que se crear� la cuenta y enviar �ste al m�todo constructor de la cuenta para
      inicializar a una variable de instancia con dicho saldo. Despu�s de esto, el usuario podr�
      realizar tantos dep�sitos, retiros y consultas de saldo como desee, la �nica restricci�n es que
      el usuario no podr� retirar m�s dinero del que tenga c�mo saldo
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