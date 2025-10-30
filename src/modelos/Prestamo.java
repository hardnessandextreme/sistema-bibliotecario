package modelos;

import util.FechaUtil;

import java.time.LocalDateTime;

public class Prestamo {
    private static int DIAS_GRACIA = 30;
    private static int contador = 0;
    private final int id;
    private Usuario usuario;
    private Libro libro;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado; // activo, devuelto, vencido
    private int diasTranscurridos;

    public Prestamo(Usuario usuario, Libro libro){
        this.id = Prestamo.contador++;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = LocalDateTime.now();
        this.fechaFin = this.fechaInicio.plusDays(Prestamo.DIAS_GRACIA);
        this.estado = "activo";
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + this.id +
                ", usuario=" + this.usuario.getNombre() + " " + this.usuario.getApellido() +
                ", libro=" + this.libro.getTitulo() +
                ", fechaInicio=" + getFechaInicioString() +
                ", fechaFin=" + getFechaFinString() +
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

    public LocalDateTime getFechaInicio() {
        return this.fechaInicio;
    }

    public String getFechaInicioString() {
        return this.fechaInicio.format(FechaUtil.FECHA_HORA_FORMATO);
    }

    public LocalDateTime getFechaFin() {
        return this.fechaFin;
    }

    public String getFechaFinString() {
        return this.fechaFin.format(FechaUtil.FECHA_HORA_FORMATO);
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
