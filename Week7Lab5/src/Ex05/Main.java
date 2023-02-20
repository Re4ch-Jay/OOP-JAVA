package Week7Lab5.src.Ex05;

public class Main {

    public static void main(String[] args) {
        Line line1 = new Line();
        Point p1 = new Point(0, 1);
        line1.setP1(p1);
        line1.getCoordinates();

        Line line2 = new Line();
        Point p2 = new Point(4, 3);
        line2.setP1(p2);
        line2.getCoordinates();
    }

}
