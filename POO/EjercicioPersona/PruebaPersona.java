import java.util.Scanner;
public class PruebaPersona {
   public static void main(String args[]) {
      //zona de declaracion
      Scanner get = new Scanner(System.in);
      String nombre;
      int edad;
      char sexo;
      float peso, altura;
      
      //1. Crea el objeto persona1 utilizando el constructor sin parámetros.
      Persona persona1 = new Persona();
      
      //2. Imprima los datos del objeto persona1 utilizando su método toString.
      System.out.print("Datos del objeto persona1:\n"+persona1.toString());
      
      /*    
         4. Utilice los métodos set del objeto persona1 para asignar la siguiente información:
         Nombre: ALDO RAFAEL PEREZ LOPEZ
         Edad: 53
         Peso: 106.5
         Altura: 1.78
      */
      persona1.setNombre("ALDO RAFAEL PEREZ LOPEZ");
      persona1.setEdad(53);
      persona1.setPeso(106.5f);
      persona1.setAltura(1.78f);
      
      //Imprima los datos del objeto persona1 utilizando su método toString.
      System.out.print("\nDatos del objeto persona1:\n"+persona1.toString());
      
      /*
         Lea por teclado el nombre, edad y sexo de una persona, construya el objeto persona2 
         con los datos leídos utilizando el constructor de 3 parámetros. Imprima los datos del 
         objeto persona2 utilizando su método toString.
      */
      System.out.print("\nDatos de una nueva persona:\nIngrese el nombre: ");
      nombre = get.nextLine();
      System.out.print("Ingrese la edad: ");
      edad = get.nextInt();
      get.nextLine();
      System.out.print("Ingrese el sexo [H = hombre, M = mujer]: ");
      sexo = get.nextLine().charAt(0);
      
      
      Persona persona2 = new Persona(nombre, edad, sexo);
      
      System.out.print("\nDatos del objeto persona2:\n"+persona2.toString());
      /*
         10. Utilice los métodos set del objeto persona2 para asignar la siguiente información:
         Peso: 43.5
         Altura: 1.67
      */
      persona2.setPeso(42.5f);
      persona2.setAltura(1.67f);
      
      
      /*
         Lea por teclado el nombre, edad, sexo, peso y altura de una persona, construya el objeto 
         persona3 con los datos leídos utilizando el constructor de 5 parámetros. Imprima los datos 
         del objeto persona3 utilizando su método toString.
      */
      System.out.print("\nDatos de una nueva persona:\nIngrese el nombre: ");
      nombre = get.nextLine();
      System.out.print("Ingrese la edad: ");
      edad = get.nextInt();
      get.nextLine();
      System.out.print("Ingrese el sexo [H = hombre, M = mujer]: ");
      sexo = get.nextLine().charAt(0);
      System.out.print("Ingrese el peso: ");
      peso = get.nextFloat();
      System.out.print("Ingrese la altura: ");
      altura = get.nextFloat();
      
      Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
   
      System.out.print("\nDatos del objeto persona3:\n"+persona3.toString());
      
      /*
         Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por 
         debajo de su peso ideal con un mensaje. Utilice un método auxiliar al método main para esta labor.
         Ejecute el programa, ingrese los datos del paso 8 y cuando se le soliciten los datos de la nueva persona ingrese la siguiente información:
         Nombre: ANA ISABEL LARES PONCE
         Edad: 17
         Sexo: M
         Peso: 56.5
         Altura: 1.60
      */
      System.out.println("\nIndice de masa corporal");
      System.out.println("persona1:");
      imprimirMensajePeso(persona1);
      
      System.out.println("\npersona2:");
      imprimirMensajePeso(persona2);
      
      System.out.println("\npersona3:");
      imprimirMensajePeso(persona3);
      
      /*
         Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de 
         su peso ideal con un mensaje. Utilice un método auxiliar al método main para esta labor.
      */
      System.out.println("\nInformacion sobre mayoria de edad:");
      System.out.println("persona1:");
      imprimirMayorDeEdad(persona1);
      
      System.out.println("\npersona2:");
      imprimirMayorDeEdad(persona2);
      
      System.out.println("\npersona3:");
      imprimirMayorDeEdad(persona3);
      

   }
   
   public static void imprimirMensajePeso(Persona p) {
      int imc = p.calcularIMC();
      switch(imc) {
         case Persona.PESO_IDEAL:
            System.out.println("La persona está en su peso ideal");
         break;
         case Persona.INFRAPESO:
            System.out.println("La persona está debajo de su peso ideal");
         break;
         case Persona.SOBREPESO:
            System.out.println("La persona está por encima de su peso ideal");
         break;
      }
   }
   
   public static void imprimirMayorDeEdad(Persona p) {
      if(p.esMayorDeEdad()) 
         System.out.print("La persona es Mayor de edad");
      else 
         System.out.print("La persona es Menor de edad");
   }
   
}