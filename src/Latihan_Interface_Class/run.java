package Latihan_Interface_Class;

public class run {

    public static void main(String[] args) {
        Line x = new Line(5, 10, 15, 20) {
        };
        System.out.println(x.getLength());
        System.out.println(x.isGreater(x, x));
        System.out.println(x.isLess(x, x));
        System.out.println(x.isEqual(x, x));
    }
}
