public class PruebaComputadora {
   public static void main(String args[]) {
      Computadora equipo1 = new Computadora("HP","Pavilion 15","Rysen 5", 16, 512);
      Computadora equipo2 = new Computadora("Lenovo","IdealPad","Intel i3", 8, 128);
      System.out.println("\nDatos de la computadora 1: ");
      equipo1.print();
      System.out.println("\nDatos de la computadora 2: ");
      equipo2.print();
   }
}