package app;

public class Almacen {

    private Bebida estanteria[][];

    //Con este contructor le indicamos que le vamos a pasar un tamaño a nuestra matriz
    public Almacen(int filas, int columnas) {
        estanteria = new Bebida[filas][columnas];
    }

    //Con este contructor le decimos que nuestra matriz tiene un tamaño por defecto de 5 * 5
    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    //Creamos el método para agregar bebida
    public void agregarBebida(Bebida bebida) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebida;
                    encontrado = true; // salgo del bucle
                }
            }
        }
        if (encontrado) {
            System.out.println("\nBebida añadida");
        } else {
            System.out.println("\nNo se ha podido añadir la bebida");
        }
    }

    //Creamos el metodo para calcular el precio de las bebidas
    public double calcularPrecioBebidas() {
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }

    //Creamos el metodo para mostrar las bebidas
    public void mostrarBebidas() {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println("\nFila : " + i + " - Columna : " + j + "\nBebida : " + estanteria[i][j].toString());
                }
            }
        }
    }

    //Creamos el metodo para eliminar una bebida
    public void eliminarBebida(int id) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null; //Elimino el valor
                        encontrado = true; // salimos del bucle
                    }
                }
            }
        }
        if(encontrado){
            System.out.println("");
            System.out.println("Bebida eliminada");
        }else{
            System.out.println("");
            System.out.println("No se ha podido eliminar la bebida");
        }
    }
}
