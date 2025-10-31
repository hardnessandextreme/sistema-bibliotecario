package servicios;

import interfaces.IDevolucion;
import modelos.Prestamo;

public class DevolucionServicio implements IDevolucion {
    private PrestamoServicio prestamoServicio;

    @Override
    public void registrarDevolucion(int idPrestamo, String observaciones) {

    }

    private void generarMultaRetraso(Prestamo prestamo){

    }
}
