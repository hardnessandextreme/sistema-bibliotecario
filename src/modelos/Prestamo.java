package modelos;

import java.time.LocalDate;

public class Prestamo {
    private static int contador = 0;
    private int id;
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado; // activo, devuelto, vencido

    public Prestamo() {}
}
