package ProyectoNieves;

public class main {
    public static void main(String[] args) {
        Vehiculo v1 = new DronTransporte("Dron1z");
        ((DronTransporte)v1).sincronizarGPS();
        Vehiculo v2 = new CamionAutonomo("Camion324x");
        ((CamionAutonomo)v2).sincronizarGPS();
        CentroControl c1 = new CentroControl();
        c1.registrarUnidad(v1);
        c1.registrarUnidad(v2);
        c1.monitorearFlota();

    }
}
