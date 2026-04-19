package ProyectoNieves;

 class CamionAutonomo extends Vehiculo implements IConectable {

     public CamionAutonomo(String id) {
         super(id);
         System.out.println("Vehiculo: Camión Autónomo");
     }

     @Override
     public void patronMovimiento() {
         System.out.println("Patron detectado: lineal con aceleración progresiva");

     }

     @Override
     public void sincronizarGPS() {
         System.out.println("GPS sincronizado correctamente");
     }
 }
