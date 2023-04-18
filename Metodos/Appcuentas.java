import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Appcuentas {
    
    public static int menu() {
        Scanner lee = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("1 Ver cuentas.\n" +
        "2 Ingresar dinero.\n"+
        "3 Retirar dinero.\n" +
        "4 Agregar cuenta.\n" +
        "5 Eliminar cuenta.\n" +
        "6 Buscar cuenta.\n" +
        "7 Mostrar morosos.\n" +
        "8 Salir.");
        System.out.println("---------------------");
        int opcion = lee.nextInt();
        return opcion;
    }

    public static void funciones(int opcion) {
        String[] nombres = new String[100];
        int[] saldo = new int[100];
        Arrays.fill(saldo, 0);
        boolean existen =comprobacion(nombres);
        switch (opcion){
            case 1:
                vercuentas(existen, nombres, saldo);
            break;
            case 2:
                ingresar(existen);
            break;
            case 3:
                retirar(existen);
            break;
            case 4:
                Agregar(existen);
            break;
            case 5:
                Eliminar(existen);
            break;
            case 6:
                buscar(existen);
            break;
            case 7:
                morosos(existen);
            break;
            default:
            System.out.println("Gracias por usar nuestros servicios");
        }
    }
    
    public static void Mostrar(String[] nombres, int[] saldo) {
        int contador = 0;
        while(nombres[contador].equals("null")){
            System.out.println(contador + ". " + nombres[contador] + " Saldo " + saldo[contador] + "€");
            contador++;
        }
    }

    public static boolean comprobacion(String[] n){
        Boolean resultado=false;
        int contador=0;
        int total=0;
        while(contador <= 100){
            if(n[contador].equals(null)){
                total++;
            }
            contador++;
        }
        if(total==100)  {
            resultado=true;
        }
        return resultado;
    }

    public static void vercuentas(boolean existe, String[] nombres, int[] saldo) {
       int contador = 0;
        if(existe){
            System.out.println("No existen cuentas");
       }else{
        Mostrar(nombres, saldo);
       }
    }

    public static void ingresar(boolean existe,String[] nombres, int[] saldo){
        Mostrar(nombres, saldo);

    }

    public static void retirar(boolean existe) {
        
    }

    public static void Agregar(boolean existe) {
        
    }

    public static void Eliminar(boolean existe) {
        
    }

    private static void buscar(boolean existe) {
        
    }

    public static void morosos(boolean existe) {
        
    }

    public static void main(String[] args) {
        int opcion;
        do{ 
            opcion = menu();
            funciones(menu());
        }while(opcion!=8);
    }


}
