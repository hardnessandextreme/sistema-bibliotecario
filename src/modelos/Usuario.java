package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario ;
    private String cedulaUsuario;
    private String celularUsuario;
    private String emailUsuario;
    private LocalDateTime fechaRegistroUsuario;
    private boolean estadoUsuario;

    public Usuario(String nombreUsuario) {
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
