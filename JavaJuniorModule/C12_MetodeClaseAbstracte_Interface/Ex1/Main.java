package src.C12_MetodeClaseAbstracte_Interface.Ex1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Triangle rgTriangle = new Triangle("I reflect light", "glass",23,11 );
        Rectangle rgRectangle = new Rectangle("Yellow rectangle", "steel",10,50 );

        // getSize() test
        System.out.println(rgTriangle.getSize());
        System.out.println(rgRectangle.getSize() + "\n");

        // toString() test
        System.out.println(rgTriangle.toString());
        System.out.println(rgRectangle.toString() + "\n");

        // equals(Object) test
        Triangle rgSameTriangle = new Triangle("I reflect light", "glass",23,11 );
        Rectangle rgSameRectangle = new Rectangle("Yellow rectangle", "steel",10,50 );

        Triangle rgNotSameTriangle = new Triangle("I reflect light", "glass",22,11 );
        Rectangle rgNotSameRectangle = new Rectangle("Yellow ", "steel",10,50 );

        System.out.println(rgTriangle.equals(rgSameTriangle) + " " + rgTriangle.equals(rgNotSameTriangle));
        System.out.println(rgRectangle.equals(rgSameRectangle) + " " + rgRectangle.equals(rgNotSameRectangle) + "\n");

        // hashCode() test
        System.out.println(rgTriangle.hashCode() + " " + rgSameTriangle.hashCode() + " " +rgNotSameTriangle.hashCode());
        System.out.println(rgRectangle.hashCode() + " " + rgSameRectangle.hashCode() + " " +rgNotSameRectangle.hashCode() +"\n");

        // upcasting test
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rgTriangle);
        shapes.add(rgNotSameTriangle);
        shapes.add(rgRectangle);
        shapes.add(rgNotSameRectangle);

        for(Shape s :  shapes) {
            System.out.println(s.toString());
        }
        System.out.println();

        for(Shape s :  shapes) {
            System.out.println(s.getSize());
        }
        System.out.println();

        // downcast test
        for(Shape s : shapes) {
            if(s instanceof Triangle) {
                ((Triangle) s).displayShapeHeight();
            } else if(s instanceof Rectangle) {
                    ((Rectangle) s).displayShapeHeight();
            }
        }
    }
}
