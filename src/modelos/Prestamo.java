package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Prestamo {
    private static final DateTimeFormatter FECHA_HORA_FORMATO = DateTimeFormatter.ofPattern("dd MMM yyyy, H:mm",
            new Locale("es", "EC"));
    private static int contador = 0;
    private int id;
    private Usuario usuario;
    private Libro libro;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado; // activo, devuelto, vencido

    public Prestamo(Usuario usuario, Libro libro){
        this.id = Prestamo.contador++;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = LocalDateTime.now();
        this.estado = "activo";
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + this.id +
                ", usuario=" + this.usuario.getNombre() + " " + this.usuario.getApellido() +
                ", libro=" + this.libro.getTitulo() +
                ", fechaInicio=" + getFechaInicio() +
                ", fechaFin=" + getFechaFin() +
                ", estado='" + this.estado + '\'' +
                '}';
    }

    public static int getContador() {
        return Prestamo.contador;
    }

    public int getId() {
        return this.id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public String getFechaInicio() {
        return this.fechaInicio.format(FECHA_HORA_FORMATO);
    }

    public String getFechaFin() {
        return this.fechaInicio.plusDays(30).format(FECHA_HORA_FORMATO);
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

//class Prueba{
//    public static void main(String[] args) {
//        Usuario usuario = new Usuario("Jonathan", "Quinte", "0987654321", "0912345678", "jonathanquinte6@gmail.com");
//        Libro libro = new Libro("Rayuela", "Júlio Cortazar", "01239ASD34", 1998, 1);
//
//        Prestamo prestamo = new Prestamo(usuario, libro);
//
//        System.out.println(prestamo);
//    }
//}
