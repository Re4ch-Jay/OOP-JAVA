package Week7Lab5.src.Ex05;

public class Line extends Point {

    private int x, y;

    private Point p1 = new Point(x, y);
    private Point p2 = new Point(x, y);

    public Line(int x, int y, Point p1, Point p2) {
        super(x, y);
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x, int y) {
        super(x, y);
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

    @Override
    public String toString() {
        return ("Point 1: " + this.p1 + ", Point 2: " + this.p2);
    }

}
