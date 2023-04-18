import java.util.Scanner;
public class ej7 {
    public static double perimetroRectangulo(double ancho, double alto){
        return  (ancho*2) + (alto*2);
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho*alto;
    }
    
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduzca el ancho y el alto de un rectangulo en cm");
        int ancho = lee.nextInt();
        int alto = lee.nextInt();
        System.out.println("Perimetro");
        System.out.println(perimetroRectangulo(ancho, alto)+"cm");
        System.out.println("Area");
        System.out.println(areaRectangulo(ancho, alto)+ " cm2");
    }
}
