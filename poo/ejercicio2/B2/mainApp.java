package B2;
//David Joseph Cuenca
public class mainApp {
    
    public static void main(String[] args) {
        
        Persona a = new Persona("12345678A", "Rafael", "Nadal", 69);
        Persona b = new Persona("87654321B", "Lionel", "Serrano", 14);
        String persona1 = (a.Dni + " " + a.nombre + " " + a.apellidos + " " + a.edad);
        String persona2 = (b.Dni + " " + b.nombre + " " + b.apellidos + " " + b.edad);

        if(a.edad < 18){
            persona1 += " Es menor de edad";
        }else {
            persona1 += " Es mayor de edad";
        }

        if(a.edad < 18){
            persona2 += " Es menor de edad";
        }else {
            persona2 += " Es mayor de edad";
        }
        System.out.println(persona1);
        System.out.println(persona2);
    }

}
