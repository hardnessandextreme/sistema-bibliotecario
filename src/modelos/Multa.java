package modelos;

import java.time.LocalDate;

public class Multa {
    private static int contador = 0;
    private int id;
    private Usuario usuario;
    private String motivo;
    private LocalDate fecha;
    private boolean pagada;

    public Multa(Usuario usuario, String motivo, LocalDate fecha, boolean pagada) {

    }
}
