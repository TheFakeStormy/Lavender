public class Camisa extends Prenda{
    public Camisa (String tipo, int cantidad){
        super(tipo, cantidad, new ServicioCamisa());
    }
}
