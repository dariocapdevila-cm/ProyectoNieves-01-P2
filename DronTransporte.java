package ProyectoNieves;

 class DronTransporte extends Vehiculo implements IConectable {
     public DronTransporte(String id) {
         super(id);
         System.out.println("Vehiculo:Dron de Transporte");
     }

     @Override
     public String patronMovimiento() {
         return "Patrón detectado: alabeo,cabeceo,guiñada,aceleración";
     }

     @Override
     public void sincronizarGPS() {
         System.out.println("GPS Sincronizado correctamente");
     }
 }
