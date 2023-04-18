import java.util.Arrays;
public class ej41_16 {
    public static void main(String[] args) {
        int[] tab = new int[55];
        int posicion, numero=1, suigiente=1;
        for(posicion = 0; numero <= 10;){
            Arrays.fill(tab,posicion,suigiente, numero);
            numero++;
            posicion = suigiente;
            suigiente += numero;
        }
        for(int con = 0; con < 55; con++){
            System.out.println(tab[con]);
        }
    }
}
