package ProyectoNieves;
import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Vehiculo> vehiculos;
    public CentroControl(){
        this.vehiculos = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        vehiculos.add(v);
    }
    public void monitorearFlota(){
        for(Vehiculo i : vehiculos ){
            i.patronMovimiento();

            if (i instanceof IConectable) {
                ((IConectable) i).sincronizarGPS();
        }
    }
}
