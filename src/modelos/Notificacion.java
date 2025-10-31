package modelos;

import java.time.LocalDateTime;

public class Notificacion {
    private static int contador = 0;
    private final int id;
    private Usuario usuario;
    private String mensaje;
    private LocalDateTime fechaEnvio;

    public Notificacion(Usuario usuario, String mensaje) {
        this.id = Notificacion.contador++;
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.fechaEnvio = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", mensaje='" + mensaje + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                '}';
    }

    public void EnviarNotificacion() {

    }
}
