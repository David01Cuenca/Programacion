import java.util.Scanner;

public class ej42_4 {
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        int[][] tab = new int[4][5];
        int fila, columna, minima, maxima, suma = 0, con=0;

        int min = 0;

        System.out.println("Introduzca las notas de los alumnos");

        for (fila = 0; fila < 4; fila++) {
            System.out.println("-------------");
            System.out.println("Alumno " + (fila + 1)); 
            for (columna = 0; columna < 5; columna++) {
                
                System.out.print("Asignatura " + (columna + 1) + ": ");
                int nota = lee.nextInt();
                tab[fila][columna] = nota;
            
            }
        }
        // Bucle para la nota minima
        System.out.println("---------------");
        for (fila = 0; fila < 4; fila++) {
            minima = tab[fila][0];
            for (columna = 0; columna < 5; columna++) {
                
                if (tab[fila][columna] <= minima) {
                    
                    minima = tab[fila][columna];
                }
            }
            System.out.println("Nota minima del alumno " + (fila+1) + ": " + minima);
        }
        // Bucle para la nota maxima
        System.out.println("---------------");
        for (fila = 0; fila < 4; fila++) {
            maxima = tab[fila][0];
            for (columna = 0; columna < 5; columna++) {
                
                if (tab[fila][columna] >= maxima) {
                    
                    maxima = tab[fila][columna];
                }
            }
            System.out.println("Nota maxima del alumno " + (fila+1) + ": " + maxima);
        }
        // Bucle para la nota media
        System.out.println("---------------");
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                
                suma += tab[fila][columna];
            }
            double media = (double)(suma)/5;
            System.out.println("Nota media del Alumno " + (fila + 1) + ": " + media + " ");
            suma=0;
        }
    }
}
