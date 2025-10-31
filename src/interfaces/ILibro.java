package interfaces;

import modelos.Libro;

import java.util.List;

public interface ILibro {
    void registrarLibro(Libro libro);
    Libro buscarPorIsbn(String isbn);
    List<Libro> listarLibros();
}
