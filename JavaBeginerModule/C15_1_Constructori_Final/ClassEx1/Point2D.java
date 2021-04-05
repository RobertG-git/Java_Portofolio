package C15_1_Constructori_Final.ClassEx1;

public class Point2D {

    private double ox;
    private double oy;

    // Constructor with 3 parameters
    public Point2D(double ox, double oy) {
        this.ox = ox;
        this.oy = oy;
    }

    // Another constructor, with 1 parameter
    public Point2D(double uniqueCoordinate) {
        this.ox = uniqueCoordinate;
        this.oy = uniqueCoordinate;
    }

    public void displayCoordinates() {
        System.out.println("OX: " + this.ox + "\nOY: " + this.oy);
    }

}
