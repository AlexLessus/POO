public class CatalogoPacientes{
   private Paciente pacientes[];
   private int cont;
   
   //Constructor
   public CatalogoPacientes(int cantidadPacientes) {
      pacientes = new Paciente[cantidadPacientes];
      cont = 0;
   }
   
   public int getCont() {
      return cont;
   }
   
   public int busqueda(int id) {
      for(int i = 0; i < cont; i++) {
         if(pacientes[i].getId() == id) {
            return i;
         }
      }
      return -1;
   }
   
   public void agregar(Paciente p) {
      pacientes[cont] = p;
      cont++;
   }
   
   public Paciente getPaciente(int celda) {
      return pacientes[celda]; 
   }
   
   public void modificar(Paciente p, int celda) {
      pacientes[celda] = p;
   }
   
   public void eliminar(int celda) {
      for(int i=celda; i<cont-1; i++) {
         pacientes[i] = pacientes[i+1];
      }
      cont--;
   }
}