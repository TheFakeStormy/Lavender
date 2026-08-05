import java.util.Scanner;

public class UI {
    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        int item1 = 0;
        double count = 0;
        boolean menu = true, lock = false, lock2 = false;
        do{
            do{
                try{
                    lock2 = false;
                    System.out.println("Seleccionar una opcion");
                    System.out.println("[1] Agregar una prenda");
                    System.out.println("[2] Reporte de consola");
                    System.out.println("[3] Salir");
                    opc = teclado.nextInt();
                }catch(Exception e){
                    System.out.println("opcion no valida, intentelo de nuevo");
                    lock2 = true;
                    teclado.nextLine();
                }

            }while(lock2 == true);

            teclado.nextLine();
            switch (opc){
                case 1:
                    do{
                        lock = false;
                        try{
                            System.out.println("Ingresar la cantidad de la prenda");
                            item1 = teclado.nextInt();
                        }catch(Exception e){
                            System.out.println("valor no valido, intente de nuevo.");
                            lock = true;
                            teclado.nextLine();
                        }
                    }while(lock == true);

                    int cantidad = item1;
                    teclado.nextLine();
                    do{
                        lock = false;
                        try{
                            System.out.println("Seleccionar el tipo de prenda:");
                            System.out.println("[1] Camisa");
                            System.out.println("[2] Pantalon");
                            System.out.println("[3] Edredon");
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
                                    tipo = "Edredon";
                                    prenda = new Edredon(tipo, cantidad);
                                    Lavanderia.prendas.add(prenda);
                                    break;
                            }
                        }catch(Exception e){
                            System.out.println("Seleccion no valida, intente de nuevo");
                            lock = true;
                            teclado.nextLine();
                        }
                    }while(lock == true);

                    break;
                case 2:
                    for(Prenda p : Lavanderia.prendas){
                        System.out.println(p.tipo+" | "+p.cantidad+" | "+p.CalcularCosto());
                        count = count + p.CalcularCosto();
                    }
                    System.out.println("total recaudado en el dia: "+count);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    menu = false;
                    break;
            }
        }while(menu == true);


    }
}
