package ProyectoNieves;

public class main {
    public static void main(String[] args) {
        Vehiculo v1 = new DronTransporte("Dron1z");
        Vehiculo v2 = new CamionAutonomo("Camion324x");
        CentroControl c1 = new CentroControl();
        c1.registrarUnidad(v1);
        c1.registrarUnidad(v2);
        c1.monitorearFlota();
    }
}
