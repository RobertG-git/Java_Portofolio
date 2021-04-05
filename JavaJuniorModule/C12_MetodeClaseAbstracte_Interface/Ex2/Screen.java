package src.C12_MetodeClaseAbstracte_Interface.Ex2;

import java.util.ArrayList;
import java.util.Objects;

public class Screen {

    // fields
    private ArrayList<Pixel> pixels = new ArrayList<>();

    private final int width;
    private final int length;
    private final int depth;

    // constructor
    public Screen(int pixelNo, int width, int length, int depth) {
        for (int i = 0; i < pixelNo; i++) {
            this.pixels.add(new Pixel());
        }
        this.width = width;
        this.length = length;
        this.depth = depth;
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
                ", width=" + width +
                ", length=" + length +
                ", depth=" + depth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Screen)) return false;
        Screen screen = (Screen) o;
        return width == screen.width &&
                length == screen.length &&
                depth == screen.depth &&
                Objects.equals(pixels, screen.pixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixels, width, length, depth);
    }
}
