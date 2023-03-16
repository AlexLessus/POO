public class Persona {
   //Declaración de constantes con mayusculas
   private final static char SEXO_DEF = 'H';
   public final static int INFRAPESO = -1;
   public final static int PESO_IDEAL = 0;
   public final static int SOBREPESO = 1;
   //static: desde otra clase se podrá acceder a estas constantes
   /*
        • Atributos: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
        No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, 
        también su tipo. Por default, todos los atributos menos el DNI serán valores por default según su tipo. 
        Sexo será hombre por default, usa una constante para ello.
   */
   private String nombre;
   private int edad;
   private String dni;
   private char sexo;
   private float peso;
   private float altura;
   
   /*
       • Constructores:
       Un constructor para inicializar los atributos por default.
       Un constructor para inicializar los atributos nombre, edad y sexo, el resto por default.
       Un constructor para inicializar los atributos nombre, edad, sexo, peso y altura.
   */
   public Persona() {   
      nombre = "";
      sexo = SEXO_DEF;
      generarDni();
      edad = 0;
      peso = 0f;
      altura = 0f;   
   }
   
   public Persona(String nombre, int edad, char sexo) {
      this.nombre = nombre;
      this.edad = edad;
      generarDni();
      this.sexo = sexo;
      comprobarSexo(sexo);
      peso = 0f;
      altura = 0f;   
      
   }
   
   public Persona(String nombre, int edad, char sexo, float peso, float altura) {
      this.nombre = nombre;
      this.edad = edad;
      generarDni();
      this.sexo = sexo;
      comprobarSexo(sexo);
      this.peso = peso;
      this.altura = altura; 
   }
   
   //Metodos publicos
   /*
      calcularIMC(): calculara el índice de masa corporal, (peso en kg. / altura en mt ^ 2),
       esto es, si esta fórmula calcula un valor menor que 20, significa que la persona está 
       por debajo de su peso ideal y el método devolverá un -1; si calcula un número entre 20 y 25 
       (incluidos), significa que la persona está en su peso ideal y el método devolverá un 0 y si 
       calcula un valor mayor que 25 significa que la persona tiene sobrepeso y el método devolverá un 1. 
       Utiliza constantes para devolver estos valores.
   */
   public int calcularIMC() {
      float pesoActual = peso/ (float)(Math.pow(altura, 2));
      if (pesoActual >= 20 && pesoActual <= 25) {
         return PESO_IDEAL;
      }
      else if(pesoActual < 20) {
         return INFRAPESO;
      }
      else {
         return SOBREPESO;
      }
      
   }
   
   //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
   public boolean esMayorDeEdad() {
      return edad >= 18;
   }
   
   //toString(): devuelve toda la información del objeto.
   public String toString() {
      //Devuelve el contenido del objeto en un string
      String sexo;
      if(this.sexo == 'H') {
         sexo = "Hombre";
      }else {
         sexo = "Mujer";
      }
      return "Informacion de la persona: \n"+
             "Nombre: " + nombre + "\n"+
             "Sexo: " + sexo + "\n"+
             "Edad: " + edad + " años\n"+
             "DNI: " + dni + "\n"+
             "Peso: " + peso + " kg\n"+
             "Altura: " + altura + " mts.\n";
   }  
   
   //Metodos Set
   //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No será visible al exterior.
   private void comprobarSexo(char sexo) {
      if(sexo != 'H' && sexo != 'M') {
         this.sexo = SEXO_DEF;
      }
   }
   
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public void setSexo(char sexo) {
      this.sexo = sexo;
   }
   public void setEdad(int edad) {
      this.edad = edad;
   }
   public void setPeso(float peso) {
      this.peso = peso;
   }
   public void setAltura(float altura) {
      this.altura = altura;
   }
   
   //Metodos privados
   /*
      generarDNI(): genera un número aleatorio de 4 cifras y a partir de éste 
      se genera su letra correspondiente. Este método será invocado cuando se 
      construya el objeto. Puedes utilizar un método auxiliar para que te sea 
      más fácil. No será visible al exterior.
   */
   private void generarDni() {
      final int DIVISOR = 23;
      
      //gernera un numero aleatorio de 4 digitos
      int numDni = ((int)Math.floor(Math.random() * (10000 - 1000) + 1000));
      int res = numDni - (numDni / DIVISOR * DIVISOR);
      
      //Calcula la letra del DNI
      char letraDni = generarLetraDni(res);      
      
      //Pasa el DNI a String
      this.dni = Integer.toString(numDni) + letraDni;
      
   }
   
   private char generarLetraDni(int res) {
      char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
      return letras[res];
   }
   
   
   
}  