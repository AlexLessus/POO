public class Prestamo {
   private int numPrestamo;
   private int idTrabajador;
   private int idHerramienta;
   private String fechaPrestamo;
   private String fechaDevolucion;
   private char estado;
   
   public Prestamo(int numPrestamo, int idTrabajador, int idHerramienta, String fechaPrestamo, String fechaDevolucion, char estado) {
      this.numPrestamo = numPrestamo;
      this.idTrabajador = idTrabajador;
      this.idHerramienta = idHerramienta;
      this.fechaPrestamo = fechaPrestamo;
      this.fechaDevolucion = fechaDevolucion;
      this.estado = estado;
   }
   
   public int getNumPrestamo() {
      return numPrestamo;
   }
   public int getIdTrabajador() {
      return idTrabajador;
   }
   public int getIdHerramienta() {
      return idHerramienta;
   }
   public String getFechaPrestamo() {
      return fechaPrestamo;
   }
   public String getFechaDevolucion() {
      return fechaDevolucion;
   }
   public char getEstado() {
      return estado;
   }
   
   public void setFechaDevolucion(String fechaDevolucion) {
      this.fechaDevolucion = fechaDevolucion;
   }
   public void setEstado(char estado) {
      this.estado = estado;
   }
}
