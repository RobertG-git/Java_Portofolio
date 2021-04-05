package src.C11_CompunereAgregare_Polimorfism.Ex1;

import java.util.Objects;

public final class Dimensions {

    // fields

    private final int width;
    private final int length;
    private final int depth;

    // constructor

    public Dimensions(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    // methods

    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", length=" + length +
                ", depth=" + depth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimensions)) return false;
        Dimensions that = (Dimensions) o;
        return width == that.width &&
                length == that.length &&
                depth == that.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, depth);
    }
}
