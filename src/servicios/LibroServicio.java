package servicios;

import interfaces.ILibro;
import modelos.Libro;

import java.util.List;

public class LibroServicio implements ILibro {
    private List<Libro> libros;

    @Override
    public void registrarLibro(Libro libro) {

    }

    @Override
    public Libro buscarPorIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Libro> listarLibros() {
        return List.of();
    }

    private boolean validarDatos(Libro libro){
        return true;
    }
}
