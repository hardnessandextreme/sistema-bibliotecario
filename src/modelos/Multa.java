package modelos;

import util.FechaUtil;

import java.time.LocalDateTime;

public class Multa {
    private static int contador = 0;
    private final int id;
    private Usuario usuario;
    private double monto;
    private String motivo;
    private LocalDateTime fecha;
    private boolean pagada;

    public Multa(Usuario usuario, double monto, String motivo) {
        this.id = Multa.contador++;
        this.usuario = usuario;
        this.monto = monto;
        this.motivo = motivo;
        this.fecha = LocalDateTime.now();
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

    public double getMonto() {
        return this.monto;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public String getFecchaString() {
        return this.fecha.format(FechaUtil.FECHA_HORA_FORMATO);
    }

    public boolean isPagada() {
        return this.pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
