package modelos;

public class Libro {
    private static int contador = 0;
    private final int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    private int copiasDisponibles;
    private String estado; // disponible - no disponible

    public Libro(String titulo, String autor, int anioPublicacion, int copiasDisponibles) {
        this.id = Libro.contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        setCopiasDisponibles(copiasDisponibles);
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCopiasDisponibles() {
        return this.copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


