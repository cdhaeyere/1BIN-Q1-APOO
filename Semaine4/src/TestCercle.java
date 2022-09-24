/*
    @Author : Corentin D'haeyere
 */
public class TestCercle {

    public static void main(String[] args) {
        Point point = new Point(4, 2.5);
        CerclePlace cercle1 = new CerclePlace(4, point);
        CerclePlace cercle2 = new CerclePlace(12.5, point);
        System.out.println(cercle1);
        System.out.println(cercle2);
        cercle2.getCentre().setX(8);
        System.out.println(cercle1);
        System.out.println(cercle2);
    }
}
