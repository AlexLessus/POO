public class Canela{
   private String nombre = "Canela";
   private int peso;
   private String colorPelo;
   private float altura;
   
   public Canela() {   }
   
   public void setPeso(int peso) {
      this.peso = peso;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public void setAltura(float altura) {
      this.altura = altura;
   }
   public void setColorPelo(String colorPelo) {
      this.colorPelo = colorPelo;
   }
   
   public void print(){
      System.out.printf("Nombre: %s\n", nombre);
      System.out.printf("Altura: %.2f\n", altura);
      System.out.printf("Peso: %d\n", peso);
      System.out.printf("Color de pelo: %s\n", colorPelo);
   } 
   
   
}