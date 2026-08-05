public abstract class Prenda {
    String tipo;
    int cantidad;
    Servicio servicio;

    public Prenda(String tipo, int cantidad, Servicio servicio) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.servicio = servicio;
    }

    public double CalcularCosto(){
        return this.servicio.calcular(this.cantidad);
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

}
