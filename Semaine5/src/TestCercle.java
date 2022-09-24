public class TestCercle {

    public static void main(String[] args) {
        Point centre = new Point(5.0,2.0);
        CerclePlace c1 = new CerclePlace (3.0,centre);
        CerclePlace c2 = c1;
        c1.setRayon(10.0);
        System.out.println("Rayon de c2 : " + c2.getRayon()) ;
    }
}
