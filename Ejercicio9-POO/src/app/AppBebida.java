package app;

import java.util.Scanner;

public class AppBebida {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Bebida bebida;
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\n\tMENU DE OPCIONES");
            System.out.println("1 . Agregar bebida");
            System.out.println("2 . Eliminiar bebida");
            System.out.println("3 . Mostrar bebidas");
            System.out.println("4 . Calcular el precio de las bebidas");
            System.out.println("5 . Salir");
            System.out.print("Digite una opcion : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    double porcentajeAzucar;
                    boolean promocionAzucar;
                    double cantidadAzucar,
                     precioAzucar;
                    String marcaAzucar;

                    System.out.print("\nDigite el porcentaje del azucar : ");
                    porcentajeAzucar = teclado.nextDouble();

                    System.out.print("Digite la promocion del azucar : ");
                    promocionAzucar = teclado.nextBoolean();

                    System.out.print("Digite la cantidad de azucar : ");
                    cantidadAzucar = teclado.nextDouble();

                    System.out.print("Digite el precio del azucar : ");
                    precioAzucar = teclado.nextDouble();

                    System.out.print("Digite la marca del azucar : ");
                    marcaAzucar = teclado.next();

                    bebida = new BebidaAzucarada(cantidadAzucar, precioAzucar, marcaAzucar, porcentajeAzucar, promocionAzucar);
                    almacen.agregarBebida(bebida);
                    System.out.println("");

                    String manatial;
                    double cantidadMineral,
                     precioMineral;
                    String marcaMineral;

                    System.out.print("\nDigite la cantidad del mineral : ");
                    cantidadMineral = teclado.nextDouble();

                    System.out.print("Digite el precio del mineral : ");
                    precioMineral = teclado.nextDouble();

                    System.out.print("Digite la marca del mineral : ");
                    marcaMineral = teclado.next();

                    System.out.print("Digite el manantial del mineral : ");
                    manatial = teclado.next();

                    bebida = new AguaMineral(cantidadAzucar, precioAzucar, marcaMineral, manatial);
                    almacen.agregarBebida(bebida);
                    break;

                case 2:
                    System.out.print("\nDigite el ID de la bebida a eliminar : ");
                    int id = teclado.nextInt();

                    almacen.eliminarBebida(id);
                    break;

                case 3:
                    almacen.mostrarBebidas();
                    break;

                case 4:
                    System.out.println("\nEl precio total de las bebidas es : " + almacen.calcularPrecioBebidas());
                    break;

                case 5:
                    System.out.println("\nGracias por participar");
                    opcion = 5;
                    break;

                default:
                    System.out.println("\nOpcion no disponible , vuelva a digitar");
                    break;
            }
        } while (opcion != 5);
    }
}
