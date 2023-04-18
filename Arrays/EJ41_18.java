import java.util.Arrays;

public class EJ41_18 {
    public static void main(String[] args) {
        int[] tab = new int[30];
        for (int con = 0; con < 30; con++) {
            tab[con] = (int) (Math.random() * (9 - 1 + 1) + 1);
        }
        Arrays.sort(tab);
        for (int con = 0; con < 30; con++) {
            System.out.println(tab[con]);
        }
    }
}
