public class Pantalon extends Prenda{
    public Pantalon(String tipo, int cantidad){
        super(tipo, cantidad, new ServicioPantalon());
    }
}
