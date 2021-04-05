package src.P2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractBag implements IBag {

    // fields
    private final ArrayList<ISurprise> bag = new ArrayList<>();

    // methods
    public ArrayList<ISurprise> getBag() {
        return bag;
    }

    @Override
    public void put(ISurprise newSurprise) {
      this.bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (bagOfSurprises.size() > 0) {
            this.bag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public abstract ISurprise takeOut();

    @Override
    public boolean isEmpty() {
        return this.bag.size() == 0;
    }

    @Override
    public  int size() {
        return this.bag.size();
    }

    @Override
    public String toString() {
        return "AbstractBag{" +
                "bag=" + bag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractBag)) return false;
        AbstractBag that = (AbstractBag) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }
}
