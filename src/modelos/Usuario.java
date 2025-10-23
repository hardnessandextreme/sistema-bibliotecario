package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Usuario {
    private static int contadorUsuario = 0;
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario ;
    private String cedulaUsuario;
    private String celularUsuario;
    private String emailUsuario;
    private LocalDateTime fechaRegistroUsuario;
    private boolean estadoUsuario;

    public Usuario(String nombreUsuario) {
        this.idUsuario = Usuario.contadorUsuario++;
        this.nombreUsuario = nombreUsuario;
        this.fechaRegistroUsuario = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + this.nombreUsuario + '\'' +
                ", registroUsuario=" + getFechaRegistroUsuario() +
                '}';
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getCelularUsuario() {
        return celularUsuario;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getFechaRegistroUsuario() {
        DateTimeFormatter fechaHoraFormato = DateTimeFormatter.ofPattern("dd MMM yyyy, H:mm", new Locale("es", "EC"));
        return this.fechaRegistroUsuario.format(fechaHoraFormato);
    }
}

class prueba{
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jonathan");

        System.out.println(usuario);
    }
}
