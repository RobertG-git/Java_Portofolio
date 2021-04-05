package src.C15_TipuriDeClase.ClaseInterne.ClassEx1;

public class ShapeWorkspace {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3]; // an array of shapes
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();

        for (IShape shape : shapes) {
            shape.printShapeName();
        }
    }
}
