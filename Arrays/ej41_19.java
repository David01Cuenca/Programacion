import java.util.Scanner;
import java.util.Arrays;

public class ej41_19 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[] tab = new int[8];
        int con, inverso = 7;
        boolean correcto = false;
        System.out.println("Introduzca la puntuación de 8 jugadores entre 1000 y 2800");
        for (con = 0; con < 8; con++) {
            int puntuacion = lee.nextInt();
            if (puntuacion >= 1000 && puntuacion <= 2800) {
                tab[con] = puntuacion;

            } else {
                correcto = false;
                while (correcto == false) {
                    System.out.println("El número introducido es incorrecto: Intentalo de nuevo:");
                    puntuacion = lee.nextInt();
                    if (puntuacion >= 1000 && puntuacion <= 2800) {
                        correcto = true;
                    }
                }
                tab[con] = puntuacion;
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Ordenados de mayor a menor puntuación");
        
        Arrays.sort(tab);
        for (con = 0; con < 8; con++) {
            
            System.out.println(tab[inverso]);
            inverso -= 1;
        }

    }
}