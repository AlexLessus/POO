public class PrubaPersona{
   public static void main(String args[]){
      Persona juan = new Persona("juan", 18, 1.98f);
      Persona juan2 = new Persona("juan2", 11, 1.58f);
      Persona juan3 = new Persona("juan3", 23, 1.38f);
                  
      juan.ImpPersona();
      juan2.ImpPersona();
      juan3.ImpPersona();
      
      //Destruir objeto
      juan = null;
   }
}