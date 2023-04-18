import java.util.Scanner;

public class ej42_3 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Tamaño de las filas: ");
        int tamfila = lee.nextInt();

        System.out.print("Tamaño de las columnas: ");
        int tamcolm = lee.nextInt();

        int[][] tab = new int[tamfila][tamcolm];
        
        System.out.print("Introduzca el valor que quiera: ");


        for(int fila = 0; fila < tamfila; fila++){
            
            for(int columna = 0; columna < tamcolm; columna++){
                
                int valor = lee.nextInt();
                tab[fila][columna] = valor;

            }

        }
        for(int fila = 0; fila < tamfila; fila++){

            for(int columna = 0; columna < tamcolm; columna++){
                System.out.print(tab[fila][columna] + " ");
            }
        }
        System.out.println();
    }
}
