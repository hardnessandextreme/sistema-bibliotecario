package servicios;

import interfaces.IPrestamo;
import modelos.Libro;
import modelos.Prestamo;
import modelos.Usuario;

import java.util.List;

public class PrestamoServicio implements IPrestamo {
    private List<Prestamo> prestamos;
    private UsuarioServicio usuarioServicio;
    private LibroServicio libroServicio;

    @Override
    public void registrarPrestamo(Prestamo prestamo) {

    }

    @Override
    public void devolverPrestamo(int idPrestamo) {

    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return List.of();
    }

    private boolean validarDisponibilidad(Libro libro) {
        return true;
    }

    private boolean validarUsuario(Usuario usuario) {
        return true;
    }
}
