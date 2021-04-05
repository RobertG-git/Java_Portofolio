package src.C12_MetodeClaseAbstracte_Interface.Ex1;

import java.util.Objects;

public class Triangle extends Shape {

    // object state
    private int base;
    private int height;

    // constructor
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    // methods
    public void displayShapeHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return (double) (this.base * this.height) / 2;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return base == triangle.base &&
                height == triangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }
}
