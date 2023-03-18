public class ControlPrestamos {
   public final static int CANTIDAD_TRABAJADORES = 110;
   public final static int CANTIDAD_HERRAMIENTAS = 250;
   public final static int CANTIDAD_PRESTAMOS = 500;
   private Trabajador trabajadores[] = new Trabajador[CANTIDAD_TRABAJADORES];
   private Herramienta herramientas[] = new Herramienta[CANTIDAD_HERRAMIENTAS];
   private Prestamo prestamos[] = new Prestamo[CANTIDAD_PRESTAMOS];
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
   
   
   public int busquedaTrabajador(int id) {
      for(int i = 0; i < contTrabajador; i++) {
         if(trabajadores[i].getId() == id) {
            return i;
         }
      }
      return -1;
   }
   public int busquedaHerramienta(int id) {
      for(int i = 0; i < contHerramienta; i++) {
         if(herramientas[i].getId() == id) {
            return i;
         }
      }
      return -1;
   }
   
   public Trabajador getTrabajador(int celda) {
      return trabajadores[celda];
   }
   public Herramienta getHerramienta(int celda) {
      return herramientas[celda];
   }
}
