package src.C11_CompunereAgregare_Polimorfism.Ex1;

import java.util.ArrayList;
import java.util.Objects;

public class Screen {

    // fields
    private ArrayList<Pixel> pixels;
    private Dimensions dimensions;

    // constructor
    public Screen(int pixelNo, int width, int length, int depth) {
        this.pixels = new ArrayList<>();
        for (int i = 0; i < pixelNo; i++) {
            this.pixels.add(new Pixel());
        }
        this.dimensions = new Dimensions(width,length,depth);
    }

    // Methods
    public void setPixel(int indexPixel, String color) {
        System.out.println("class Screen: delegate to Pixel -> ");
        this.pixels.get(indexPixel).setPixel(color);
    }

    public void colorScreen(String color) {
        for (Pixel pixel : this.pixels) {
            pixel.setPixel(color);
        }
    }

    @Override
    public String toString() {
        return "Screen{" +
                "pixels=" + pixels +
                ", dimensions=" + dimensions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Screen)) return false;
        Screen screen = (Screen) o;
        return Objects.equals(pixels, screen.pixels) &&
                Objects.equals(dimensions, screen.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixels, dimensions);
    }
}
