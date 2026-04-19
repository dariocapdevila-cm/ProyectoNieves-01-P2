package ProyectoNieves;

 class CamionAutonomo extends Vehiculo {

     public CamionAutonomo(String id) {
         super(id);
         System.out.println("Vehiculo: Camión Autónomo");
     }

     @Override
     public String patronMovimiento() {
         return "Patron detectado: lineal con aceleración progresiva";
     }
