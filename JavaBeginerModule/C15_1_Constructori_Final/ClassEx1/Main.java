package C15_1_Constructori_Final.ClassEx1;

public class Main {

    public static void main(String[] args) {

        System.out.println("2D: ");
        Point2D point2D = new Point2D(2.2, 2.3);
        point2D.displayCoordinates();

        System.out.println("\n2D with uniqueCoordinate: ");
        point2D = new Point2D(2.1);
        point2D.displayCoordinates();
    }
}
