public class RegistroEdredon extends Prenda{
    public RegistroEdredon(String tipo, int cantidad){
        super(tipo, cantidad, new ServicioEdredon());
    }
}
