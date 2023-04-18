package a2;

import java.util.Scanner;

public class main {

    

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        Persona a = new Persona();
        Persona b = new Persona();
        System.out.println("Introduzca el número de DNI");
        a.DNI = lee.nextInt();
        System.out.println("Introduzca el nombre");
        a.nombre = lee.next();
        System.out.println("Introduzca el apellido");
        a.apellidos = lee.next();
        System.out.println("Introduzca la edad");
        a.edad = lee.nextInt();
        System.out.println("Introduzca el número de DNI de la segunda persona");
        b.DNI = lee.nextInt();
        System.out.println("Introduzca el nombre de la segunda persona");
        b.nombre = lee.next();
        System.out.println("Introduzca el apellido de la segunda persona");
        b.apellidos = lee.next();
        System.out.println("Introduzca la edad de la segunda persona");
        b.edad = lee.nextInt();
        System.out.println("Primera persona" + a.DNI + " " + a.nombre + " " + a.apellidos + " " + a.edad);
        System.out.println("Primera persona" + b.DNI + " " + b.nombre + " " + b.apellidos + " " + b.edad);

    }
}
