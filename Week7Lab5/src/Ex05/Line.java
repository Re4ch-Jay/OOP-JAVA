package Week7Lab5.src.Ex05;

public class Line {

    private Point p1 = new Point();
    private Point p2 = new Point();

    public Line() {

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void getCoordinates() {
        System.out.println("Coordinates");
        System.out.println("P1(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("P2(" + p2.getX() + "," + p2.getY() + ")");
    }

}
