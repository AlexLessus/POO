public class Prestamo {
   private int numPrestamo;
   private int idTrabajador;
   private int idHerramienta;
   private String fechaPrestamo;
   private String fechaDevolucion;
   private char estado;
   
   public Prestamo(int numPrestamo, int idTrabajador, int idHerramienta, String fechaPrestamo, char estado) {
      this.numPrestamo = numPrestamo;
      this.idTrabajador = idTrabajador;
      this.idHerramienta = idHerramienta;
      this.fechaPrestamo = fechaPrestamo;
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
   public String getFechDevolucion() {
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
