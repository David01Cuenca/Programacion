public class ej41_14 {
    public static void main(String[] args) {
        int[] tab = new int[55];
        int numero = 1, posicion = 0;

        for (posicion = 0 ; posicion < 55;) {
            for (int conb = 0; conb < numero; conb++) {
                tab[posicion] = numero;
                posicion++;
            }
            numero++;
        }
        
        for(int con= 0; con<55; con++){
            System.out.println(tab[con]);
        }
    }

}
