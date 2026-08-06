import java.util.ArrayList;
import java.util.List;

public class Lavanderia {
    public static List<Prenda> prendas = new ArrayList<>();

    public static void Counter(){
        int TotalCamisas = 0;
        int TotalPantalones = 0;
        int TotalEdredones = 0;

        for(Prenda prenda : prendas){
            if(prenda instanceof RegistroCamisa){
                TotalCamisas = TotalCamisas + prenda.getCantidad();
            } else if (prenda instanceof  RegistroPantalon) {
                TotalPantalones = TotalPantalones + prenda.getCantidad();
            } else if (prenda instanceof RegistroEdredon) {
                TotalEdredones = TotalEdredones + prenda.getCantidad();
            }
        }
        System.out.println("Hay : "+TotalCamisas+" Camisas");
        System.out.println("Hay : "+TotalPantalones+" Pantalones");
        System.out.println("Hay : "+TotalEdredones+" Edredones");
    }
    
    public static void PrendaCantidad(){
        int CantidadCamisas = 0;
        int CantidadPantalones = 0;
        int CantidadEdredones = 0;
        for( Prenda prenda : prendas){
            if(prenda instanceof RegistroCamisa){
                CantidadCamisas = CantidadCamisas + prenda.getCantidad();
            } else if (prenda instanceof RegistroPantalon) {
                CantidadPantalones = CantidadPantalones + prenda.getCantidad();
            } else if (prenda instanceof RegistroEdredon) {
                CantidadEdredones = CantidadEdredones + prenda.getCantidad();
            }
        }
        if(CantidadCamisas > CantidadEdredones && CantidadCamisas > CantidadPantalones){
            System.out.println("El registro con mayor cantidad es el Registro Camisa con "+CantidadCamisas+" camisas");
        } else if (CantidadPantalones > CantidadCamisas && CantidadPantalones > CantidadEdredones) {
            System.out.println("El registro con mayor cantidad es el Registro Pantalon con "+CantidadPantalones+" pantalones");
        } else if (CantidadEdredones > CantidadCamisas && CantidadEdredones > CantidadPantalones) {
            System.out.println("El registro con mayor cantidad es el Registro Edredon con "+CantidadEdredones+" edredones");
        }else{
            System.out.println("no fue posible encontrar un registro con mayor cantidad.");
        }
    }

}
