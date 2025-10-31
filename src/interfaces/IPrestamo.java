package interfaces;

import modelos.Prestamo;

import java.util.List;

public interface IPrestamo {
    void registrarPrestamo(Prestamo prestamo);
    void devolverPrestamo(int idPrestamo);
    List<Prestamo> listarPrestamos();
}
