package a4;

public class main {
    

    public static void main(String[] args) {
        Articulo a = new Articulo();
        a.nombre = "Pijama";
        a.precio = 10.0;
        a.iva = 0.21;
        a.cuantosquedas = 10;

        System.out.println(a.nombre + " " + a.precio + " " + a.iva + " " );
    }
}
