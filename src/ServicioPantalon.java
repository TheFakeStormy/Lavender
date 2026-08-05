public class ServicioPantalon implements Servicio{
    @Override
    public double calcular(int cantidad) {
        return 3.50*cantidad;
    }
}
