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
                ", fecha=" + getFechaString() +
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

    public String getFechaString() {
        return this.fecha.format(FechaUtil.FECHA_HORA_FORMATO);
    }

    public boolean isPagada() {
        return this.pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}

//class Prueba{
//    public static void main(String[] args) {
//        Usuario usuario = new Usuario("Jonathan", "Quinte", "0987654321", "0912345678", "jonathanquinte6@gmail.com");
//
//        Multa multa = new Multa(usuario, 100.0, "Se excedio el limite de pago.");
//
//        System.out.println(multa);
//    }
//}
