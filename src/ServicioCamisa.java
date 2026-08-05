public class ServicioCamisa implements Servicio{
    @Override
    public double calcular(int cantidad) {
        return 1.50*cantidad;
    }
}
