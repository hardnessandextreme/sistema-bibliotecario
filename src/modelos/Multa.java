package modelos;

import java.time.LocalDate;

public class Multa {
    private static int contador = 0;
    private int id;
    private Usuario usuario;
    private double monto;
    private String motivo;
    private LocalDate fecha;
    private boolean pagada;

    public Multa(Usuario usuario, double monto, String motivo) {
        this.id = Multa.contador++;
        this.usuario = usuario;
        this.monto = monto;
        this.motivo = motivo;
        this.fecha = LocalDate.now();
        this.pagada = false;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id=" + this.id +
                ", usuario=" + this.usuario +
                ", monto=" + this.monto +
                ", motivo='" + this.motivo + '\'' +
                ", fecha=" + this.fecha +
                ", pagada=" + this.pagada +
                '}';
    }

    public static int getContador() {
        return Multa.contador;
    }

    public int getId() {
        return this.id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getMonto() {
        return this.monto;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public boolean isPagada() {
        return this.pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
