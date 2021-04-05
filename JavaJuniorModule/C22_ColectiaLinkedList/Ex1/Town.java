package src.C22_ColectiaLinkedList.Ex1;

import java.util.Objects;

public class Town implements Comparable<Town> {
    private final int kilometer;
    private final String townName;

    public Town(String townName, int kilometer) {
        this.kilometer = kilometer;
        this.townName = townName;
    }

    public int getKilometer() {
        return kilometer;
    }

    public String getTownName() {
        return townName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town)) return false;
        Town town = (Town) o;
        return kilometer == town.kilometer;
    }


    @Override
    public String toString() {
        return townName + " " + kilometer + "\n";

    }

    @Override
    public int compareTo(Town o) {
        return Integer.compare(this.kilometer, o.kilometer);
    }
}
