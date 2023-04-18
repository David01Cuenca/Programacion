public class ej42_1 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        int filas, columna, numero=1;
        for(filas = 0; filas < 5; filas++){
            for(columna = 0; columna < 5; columna++){
                tab[filas][columna] = numero;
                numero+= 1;
            }
        }
        for(filas = 0; filas < 5; filas++){
            for(columna=0; columna < 5; columna++){
                System.out.print(tab[filas][columna] + " ");
            }
            System.out.println();
        }
    }
}
