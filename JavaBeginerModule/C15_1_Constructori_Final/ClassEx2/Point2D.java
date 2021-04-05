package C15_1_Constructori_Final.ClassEx2;

public class Point2D {
    private double ox;
    private double oy;
    private String name;

    // Constructors
    public Point2D(double ox, double oy, String name) {
        this.ox = ox;
        this.oy = oy;
        this.name = name;
    }

    public Point2D(double ox, double oy) {
        this(ox, ox, "UNKNOWN");
    }

    public Point2D(double uniqueCoordinate) {
        this(uniqueCoordinate, uniqueCoordinate, "UNKNOWN");
    }

    public Point2D(){
        this(-1);
    }

    public void displayCoordinates() {
        System.out.println("The point " + name + " has: \n\tOX: " +
                this.ox + "\n\tOY: " + this.oy);
    }


}
