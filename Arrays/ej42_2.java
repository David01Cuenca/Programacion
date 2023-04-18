public class ej42_2 {
    public static void main (String[] args){
        int[][] tab = new int[10][10];
        int fila, columna, tabla=1, multiplicacion=1;
        for(columna = 0; columna < 10; columna++){
            for(fila=0; fila < 10; fila++){
                tab[columna][fila] = tabla*multiplicacion;
                System.out.print(tabla + " x " + multiplicacion + " = " + tab[columna][fila] + "    ");
                multiplicacion++;
            }
            System.out.println();
            tabla++;
            multiplicacion=1;
        }
    }
}
