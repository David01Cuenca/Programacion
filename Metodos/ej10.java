import java.util.Scanner;
public class ej10 {
    
    public static boolean di(int d) {
        if(d <= 30 && d >=1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean me(int m){
        if(m <= 12 && m >=1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean an(int a){
        if(a > 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca la fecha que quiera");
        int dia = lee.nextInt();
        int mes = lee.nextInt();
        int ano = lee.nextInt();
        boolean res1 = di(dia);
        boolean res2 = me(mes);
        boolean res3 = an(ano);

        if(res1==true && res2==true && res3==true){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha es incorrecta");
        }
        
    }
}
