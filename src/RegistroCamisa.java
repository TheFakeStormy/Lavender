public class RegistroCamisa extends Prenda{
    public RegistroCamisa(String tipo, int cantidad){
        super(tipo, cantidad, new ServicioCamisa());
    }
}
