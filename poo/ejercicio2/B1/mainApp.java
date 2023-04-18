package B1;
//David Joseph Cuenca Quiroga
public class mainApp {
    public static void main(String[] args) {
        punto a = new punto(10,5);
        punto b = new punto(4, 3);
        punto c = new punto(-5, 20);

        System.out.println(a.x + "," + a.y);
        System.out.println(b.x + "," +b.y);
        System.out.println(c.x + "," + c.y);

        a.x -= 12;
        a.y += 2;

        b.x /= 3;
        b.y *= 5;

        c.x = 4;
        c.y = 20;

        System.out.println(a.x + "," + a.y);
        System.out.println(b.x + "," +b.y);
        System.out.println(c.x + "," + c.y);
    }
}
