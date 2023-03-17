public class ControlPrestamos {
   private Trabajador trabajadores[] = new Trabajador[110];
   private Herramienta herramientas[] = new Herramienta[250];
   private Prestamo prestamos[] = new Prestamo[500];
   private int contTrabajador; 
   private int contHerramienta;
   private int contPrestamo;
   
   
   public ControlPrestamos() {
      contTrabajador = 0;
      contHerramienta = 0;
      contPrestamo = 0;
   }
   
   public int getContTrabajador() {
      return contTrabajador;
   }
   public int getContHerramienta() {
      return contHerramienta;
   }
   public int getContPrestamo() {
      return contPrestamo;
   }
   
   
   public void agregarTrabajador(Trabajador t) {
      trabajadores[contTrabajador] = t;
      contTrabajador++;
   }
   public void agregarHerramienta(Herramienta h) {
      herramientas[contHerramienta] = h;
      contHerramienta++;
   }
   public void agregarPrestamo(Prestamo p) {
      prestamos[contPrestamo] = p;
      contPrestamo++;
   }
   
   
}
