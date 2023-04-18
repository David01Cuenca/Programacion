import java.util.Arrays;
import java.util.Scanner;

public class Bankapp {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        String[] cuentas = new String[100];
        double[] saldo = new double[100];
        String nombre;
        double cantidad;
        int saldovacio = 100, posicioncuenta = 0, lleno = 0,con, mal=0;

        System.out.println("-------------------");
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Agregar cuenta");
        System.out.println("5. Eliminar cuenta");
        System.out.println("6. Buscar cuenta");
        System.out.println("7. Mostrar morosos");
        System.out.println("8. Salir");

        Arrays.fill(cuentas, "vacio");

        int orden = lee.nextInt();
        //Empieza el bucle mientras el usuario ponga un numero entre 1 y 7
        while (orden >= 1 && orden <= 7) {
            System.out.println("-------------------");
            
            //La opcion uno muestra las cuentas que hay en el programa
            if (orden == 1) {
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    for (con = 0; con < lleno; con++) {
                        System.out.println(con + ". " + cuentas[con] + " Saldo: " + saldo[con] + "€");
                    }
                }
            }
            //La opcion 2 del programa pregunta al usuario el nombre de la cuenta a la que quiere ingresar y la cantidad, si el nombre no es correcto, el programa le dira al usaurio que no exsiste la cuenta
            if (orden == 2) {
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    System.out.println("Introduzca el nombre de la cuenta");
                    nombre = lee.next();
                    for (con = 0; con < lleno; con++) {
                        if (cuentas[con].equalsIgnoreCase(nombre)) {
                            System.out.println("Introduzca la cantidad a ingresar");
                            cantidad = lee.nextDouble();
                            saldo[con] = saldo[con] + cantidad;
                            mal = 1;
                        }
                    }
                    if(mal == 0){
                        System.out.println("La cuenta no existe");
                    }
                }
            }
            //Pide al usuario el nombre de la cuenta a la que quiere retirar el dinero y si el usuario pone un nombre que no esta en el programa mostrara un mensaje diciendo que no existe la cuenta
            if (orden == 3) {
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    System.out.println("Introduzca el nombre de la cuenta");
                    nombre = lee.next();
                    for (con = 0; con < lleno; con++) {
                        if (cuentas[con].equalsIgnoreCase(nombre)) {
                            System.out.println("Introduzca la cantidad a retirar");
                            cantidad = lee.nextDouble();
                            saldo[con] = saldo[con] - cantidad;
                            mal = 1;
                        }
                    }
                    if(mal == 0){
                        System.out.println("La cuenta no existe");
                    }
                }
            }
            //La opcion cuatro comprueba si hay espacio en el programa para añadir una cuenta, si hay espacio le pedira el nombre y el saldo de la cuenta al usuario
            if (orden == 4) {
                if (saldovacio == 0) {
                    System.out.println("No hay mas espacio para agregar cuentas");
                } else {
                    System.out.println("Introduzca el nombre de la cuenta");
                    nombre = lee.next();
                    cuentas[lleno] = nombre;
                    System.out.println("Introduzca la cantidad de dinero que tiene la cuenta");
                    cantidad = lee.nextDouble();
                    saldo[lleno] = cantidad;
                    lleno++;
                }
            }
            //La opcion 5 pedira el nombre de la cuenta que quiere eliminar, y el programa sobreescribira el nombre de la cuenta por "vacio" y a 0 el saldo, asi el programa considerara el espacio como vacio
            if (orden == 5){
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    System.out.println("Introduzca el nombre de la cuenta");
                    nombre = lee.next();
                    for (con = 0; con < lleno; con++) {
                        if (cuentas[con].equalsIgnoreCase(nombre)) {
                            cuentas[con] = "vacio";
                            saldo[con] = 0;
                            mal = 1;
                            System.out.println("Cuenta borrado con exito!");
                        }
                    }
                    if(mal == 0){
                        System.out.println("La cuenta no existe");
                    }
                }
            }
            //La opcion 6 pide al usuario un nombre y el programa buscara en el nombre de las cuentas si concide con el introducido
            if (orden == 6){
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    System.out.println("Introduzca el nombre de la cuenta");
                    nombre = lee.next();
                    for (con = 0; con < lleno; con++) {
                            if (cuentas[con].toUpperCase().indexOf(nombre.toUpperCase()) != -1) {
                            System.out.println(con + ". " + cuentas[con] + " Saldo: " + saldo[con] + "€");
                            mal = 1;
                        }
                    }
                    if(mal == 0){
                        System.out.println("La cuenta no existe");
                    }
                }
            }
            //La opcion 7 muestra todas las cuentas que tengan como saldo menos que cero, y los mostrara por pantalla como morosos
            if (orden == 7){
                if (saldovacio == 100) {
                    System.out.println("No hay cuentas");
                } else {
                    for (con = 0; con < lleno; con++) {
                        if (saldo[con] < 0) {
                            System.out.println(con + ". " + cuentas[con] + " Saldo: " + saldo[con] + "€");
                            mal = 1;
                        }
                    }
                    if(mal == 0){
                        System.out.println("No hay morosos");
                    }
                }
            }
            System.out.println("-------------------");
            // comprobacion de si hay cuentas de banco
            saldovacio = 0;
            lleno = 0;
            mal=0;
            for (con = 0; con < 100; con++) {
                if (cuentas[con].equalsIgnoreCase("vacio")) {
                    saldovacio++;
                } else {
                    lleno++;
                }
            }


            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Agregar cuenta");
            System.out.println("5. Eliminar cuenta");
            System.out.println("6. Buscar cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");

            orden = lee.nextInt();
        }
        System.out.println("Gracias por usar nuestros servicios");
    }
}
