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

    public Libro(String titulo, String autor, String isbn, int anioPublicacion, int copiasDisponibles) {
        this.id = Libro.contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        setCopiasDisponibles(copiasDisponibles);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", isbn='" + isbn + '\'' +
                ", copiasDisponibles=" + copiasDisponibles +
                ", estado='" + estado + '\'' +
                '}';
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
        if  (copiasDisponibles < 0) {
            throw new IllegalArgumentException("copiasDisponibles negativo");
        }
        this.copiasDisponibles = copiasDisponibles;
        this.estado = (copiasDisponibles > 0) ? "disponible" : "no disponible";
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

//class prueba{
//    public static void main(String[] args) {
//        Libro libro = new Libro("Rayuela", "Julio Cortázar","B973F45893RT", 1970, 0);
//        System.out.println(libro);
//    }
//}


