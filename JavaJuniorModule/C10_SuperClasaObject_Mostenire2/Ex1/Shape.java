package src.C10_SuperClasaObject_Mostenire2.Ex1;

public class Shape {

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

    public double getSize() {
        return (int) -1;
    }

    @Override
    public String toString() {
        return "made of " + this.material + ", contains the text: " + "\"" + this.text + "\".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Shape objShape = (Shape) obj;
        if (this.text.equals(objShape.text)
                && this.material.equals(objShape.material)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.text == null) ? 0 : this.text.hashCode());
        result = prime * result + ((this.material == null) ? 0 : this.material.hashCode());
        return result;
    }
}
