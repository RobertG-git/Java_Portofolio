package src.C10_SuperClasaObject_Mostenire2.Ex1;

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
    public void displayTriangleHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return (double) (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + this.height + ", base is: " + this.base + ", made of " + super.getMaterial() +
                ", contains the text: \"" + super.getText() + "\".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Triangle objTriangle = (Triangle) obj;
        if (super.equals(objTriangle) &&
                this.base == objTriangle.base &&
                this.height == objTriangle.height) {
            return true;
        }

        return false;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + this.base;
        result = prime * result + this.height;
        return result;
    }
}
