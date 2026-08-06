public class RegistroPantalon extends Prenda{
    public RegistroPantalon(String tipo, int cantidad){
        super(tipo, cantidad, new ServicioPantalon());
    }
}
