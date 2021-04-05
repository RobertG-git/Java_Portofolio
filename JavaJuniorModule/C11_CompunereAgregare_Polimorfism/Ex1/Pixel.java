package src.C11_CompunereAgregare_Polimorfism.Ex1;

import java.util.Objects;

public class Pixel {

    // fields
    private String color;

    // constructor
    public Pixel() {
        this("#FFFFFF");
    }

    public Pixel(String color) {
        this.color = color;
    }

    // methods
    public void setPixel(String color) {
        System.out.println("class Pixel: " + color + " color was sett.");
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pixel)) return false;
        Pixel pixel = (Pixel) o;
        return Objects.equals(color, pixel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
