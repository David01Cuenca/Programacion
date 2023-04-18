import java.util.Scanner;

public class conecta4 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[][] tablero = new int[6][7];
        int juego = 0;
        int fila;
        int columna;
        int valorinc = 0;
        int lleno = 0;
        int encima = 0;
        while (juego == 0) {
            // Turno del usuario | Falta: saber como hacer que el usuario ponga una ficha
            // encima de otra ficha si es que hay una

            // Muestra el tablero
            System.out.println(
                    "      " + "0" + "   " + "1" + "   " + "2" + "   " + "3" + "   " + "4" + "   " + "5" + "   " + "6");
            System.out.println(
                    "      " + "v" + "   " + "v" + "   " + "v" + "   " + "v" + "   " + "v" + "   " + "v" + "   " + "v");
            for (fila = 0; fila < 6; fila++) {

                System.out.print((fila) + " ->" + "| ");
                for (columna = 0; columna < 7; columna++) {
                    System.out.print(tablero[fila][columna] + " | ");
                }
                System.out.println();
            }
            // Pide al usuario y comprueba si a puesto una posición correcta
            System.out.print("Introduzca el número de la columna en la que quiere colocar la ficha: ");
            int fichausuario = lee.nextInt();
            if (fichausuario >= 0 && fichausuario <= 6) {
                fila = 0;
                while (fila < 6 || lleno == 1) {
                    if (tablero[fila][fichausuario] != 0) {
                        encima = fila - 1;
                        if (encima == -1) {
                            lleno = 1;
                        } else if (fila == 5) {
                            tablero[encima][fichausuario] = 1;
                        } else {
                            tablero[fila][fichausuario] = 1;
                        }
                        fila++;
                    }
                }
            } else {
                while (valorinc == 0) {
                    System.out.print("El número introducido no es correcto, vuelva a introducirlo: ");
                    fichausuario = lee.nextInt();
                    if (fichausuario >= 0 && fichausuario <= 6) {
                        fila = 0;
                        while (fila < 6 || lleno == 1) {
                            if (tablero[fila][fichausuario] != 0) {
                                encima = fila - 1;
                                tablero[encima][fichausuario] = 1;
                            } else if (fila == 5) {
                                tablero[fila][fichausuario] = 1;
                            }
                            fila++;
                        }
                        valorinc = 1;
                    }
                }
            }

            // Turno CPU | Falta: Hacer que el programa elija una columna, que compruebe que
            // no este lleno y si esta lleno que elija otra columna
            /*
             * while (lleno == 1) {
             * for (fila = 0; fila < 6; fila++) {
             * for (columna = 0; columna < 7; columna++) {
             * if(tablero[fila][columna] != 0){
             * int CPU = (int) (Math.random() * (6 - 0 + 1) + 0);
             * tablero[0][CPU] = 2;
             * lleno=0;
             * }
             * }
             * }
             * 
             * }
             */
            // Comprobación de si la columna esta al completo
            /*
             * for (fila = 0; fila < 6; fila++) {
             * for (columna = 0; columna < 7; columna++) {
             * 
             * }
             * }
             */
            if (fichausuario == 13) {
                juego = 1;
            }
        }

    }
}
