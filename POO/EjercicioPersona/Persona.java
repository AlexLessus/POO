public class Persona {
   //Declaraci�n de constantes con mayusculas
   private final static char SEXO_DEF = 'H';
   public final static int INFRAPESO = -1;
   public final static int PESO_IDEAL = 0;
   public final static int SOBREPESO = 1;
   //static: desde otra clase se podr� acceder a estas constantes
   /*
        � Atributos: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
        No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, 
        tambi�n su tipo. Por default, todos los atributos menos el DNI ser�n valores por default seg�n su tipo. 
        Sexo ser� hombre por default, usa una constante para ello.
   */
   private String nombre;
   private int edad;
   private String dni;
   private char sexo;
   private float peso;
   private float altura;
   
   /*
       � Constructores:
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
      calcularIMC(): calculara el �ndice de masa corporal, (peso en kg. / altura en mt ^ 2),
       esto es, si esta f�rmula calcula un valor menor que 20, significa que la persona est� 
       por debajo de su peso ideal y el m�todo devolver� un -1; si calcula un n�mero entre 20 y 25 
       (incluidos), significa que la persona est� en su peso ideal y el m�todo devolver� un 0 y si 
       calcula un valor mayor que 25 significa que la persona tiene sobrepeso y el m�todo devolver� un 1. 
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
   
   //toString(): devuelve toda la informaci�n del objeto.
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
             "Edad: " + edad + " a�os\n"+
             "DNI: " + dni + "\n"+
             "Peso: " + peso + " kg\n"+
             "Altura: " + altura + " mts.\n";
   }  
   
   //Metodos Set
   //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, ser� H. No ser� visible al exterior.
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
      generarDNI(): genera un n�mero aleatorio de 4 cifras y a partir de �ste 
      se genera su letra correspondiente. Este m�todo ser� invocado cuando se 
      construya el objeto. Puedes utilizar un m�todo auxiliar para que te sea 
      m�s f�cil. No ser� visible al exterior.
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