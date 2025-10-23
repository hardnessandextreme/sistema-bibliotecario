package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Usuario {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String numeroTelefono;
    private String email;
    private final LocalDateTime fechaRegistroUsuario;
    private boolean estado;

    public Usuario(String nombre, String apellido, String cedula, String numeroTelefono, String email) {
        this.id = Usuario.contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.estado = true;
        this.fechaRegistroUsuario = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + this.nombre + '\'' +
                ", registroUsuario=" + getFechaRegistroUsuario() +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaRegistroUsuario() {
        DateTimeFormatter fechaHoraFormato = DateTimeFormatter.ofPattern("dd MMM yyyy, H:mm", new Locale("es", "EC"));
        return this.fechaRegistroUsuario.format(fechaHoraFormato);
    }
}

//class prueba{
//    public static void main(String[] args) {
//        Usuario usuario = new Usuario("Jonathan");
//
//        System.out.println(usuario);
//    }
//}
