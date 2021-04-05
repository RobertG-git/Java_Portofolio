package src.C12_MetodeClaseAbstracte_Interface.Ex1;

import java.util.Objects;

public abstract class Shape {

    // object state
    private String text;
    private String material;

    // constructor
    public Shape() {
        this.text = "";
        this.material = "";
    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    // getter & setter

    public String getText() {
        return text;
    }

    public String getMaterial() {
        return material;
    }


    // methods

    public abstract void displayShapeHeight();

    public abstract double getSize();

    @Override
    public String toString() {
        return "Shape{" +
                "text='" + text + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return Objects.equals(text, shape.text) &&
                Objects.equals(material, shape.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }
}
