public class Password {
   private final static int LONGITUD_DEF = 8;
   //Que tenga los atributos longitud y contraseña (no use la ñ como parte del nombre de este atributo). 
   //Por defecto, la longitud será de 8.Que tenga los atributos longitud y contraseña (no use la ñ como 
   //parte del nombre de este atributo). Por defecto, la longitud será de 8.
   private int longitud;
   private String contrasenia;

   //constructores
   public Password() {
      longitud = LONGITUD_DEF;
   }
   public Password(int longitud) {
      this.longitud = longitud;
      contrasenia = generarPass();
   }
   
   //Metodos publicos
   private String generarPass() {
       String pass = "";
       char minus, mayus, num;
       int eleccion;
       
       for(int i = 0; i < longitud; i++) {
         //generamos un numero aleatorio entre 1 y 3
         eleccion = ((int)Math.floor(Math.random() * 3 + 1));
         //Segun el numero generado se decide si añadimos una minuscula, 
         //mayuscula o numero
         if(eleccion == 1) {
            minus = (char)((int)Math.floor(Math.random() * (123 - 97) + 97));
            pass += minus;
         } else if(eleccion == 2) {
            mayus = (char)((int)Math.floor(Math.random() * (91 - 65) + 65));
            pass += mayus;
         } else {
            num = (char)((int)Math.floor(Math.random() * (58 - 48) + 48));
            pass += num;
         }
       }
       return pass;
   }
   
   public boolean esFuerte() {
      int contadorNum = 0;
      int contadorMayus = 0;
      int contadorMinus = 0;
      
      for(int i = 0; i<contrasenia.length(); i++) {
         if(contrasenia.charAt(i) >= 97 && contrasenia.charAt(i) <= 122) {
            contadorMinus++;
         }else if(contrasenia.charAt(i) >= 65 && contrasenia.charAt(i) <= 90) {
            contadorMayus++;
         }else {
            contadorNum++;
         }
      }
      
      return contadorNum >= 5 && contadorMinus >= 1 && contadorMayus >= 2;
   }
   
   public String getPassword() {
      return contrasenia;
   } 
   public int getLongitud() {
      return longitud;
   }
   
   public void setLongitud() {
      this.longitud = longitud;
   }
}