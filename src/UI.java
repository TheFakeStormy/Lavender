import java.util.Scanner;

public class UI {
    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        double count = 0;
        boolean menu = true;
        do{
            System.out.println("Seleccionar una opcion");
            System.out.println("[1] Agregar una prenda");
            System.out.println("[2] Reporte de consola");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Ingresar la cantidad de la prenda");
                    int cantidad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Seleccionar el tipo de prenda:");
                    System.out.println("[1] Camisa");
                    System.out.println("[2] Pantalon");
                    System.out.println("[3] Ebredon");
                    int select = teclado.nextInt();
                    String tipo = null;
                    Prenda prenda = null;
                    switch (select){
                        case 1:
                            tipo = "Camisa";
                            prenda = new Camisa(tipo, cantidad);
                            Lavanderia.prendas.add(prenda);
                            break;
                        case 2:
                            tipo = "Pantalon";
                            prenda = new Pantalon(tipo, cantidad);
                            Lavanderia.prendas.add(prenda);
                            break;
                        case 3:
                            tipo = "Ebredon";
                            prenda = new Ebredon(tipo, cantidad);
                            Lavanderia.prendas.add(prenda);
                            break;
                    }
                    break;
                case 2:
                    for(Prenda p : Lavanderia.prendas){
                        System.out.println(p.tipo+" | "+p.cantidad+" | "+p.CalcularCosto());
                        count = count + p.CalcularCosto();
                    }
                    System.out.println("total recaudado en el dia: "+count);
                    break;
                default:
                    break;
            }
        }while(menu == true);


    }
}
