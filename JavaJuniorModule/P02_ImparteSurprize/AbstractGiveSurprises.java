package src.P2_ImparteSurprize;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    // fields
    private final IBag bag;
    private final int waitTime;

    // constructor
    public AbstractGiveSurprises(String bagType, int waitTime) {
        this.bag = new BagFactory().makeBag(bagType);
        this.waitTime = waitTime;
    }

    // method
    public void put(ISurprise newSurprise) {
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.bag.put(surprises);
    }

    public void give() {
        System.out.println(this.bag.takeOut());
        giveWithPassion();
    }

    public void giveAll() {
        while (!this.bag.isEmpty()) {
            try {
                TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.give();
        }
    }

    public boolean isEmpty() {
        return this.bag.size() == 0;
    }

    protected abstract void giveWithPassion();

    @Override
    public String toString() {
        return "AbstractGiveSurprises{" +
                "bag=" + bag +
                ", waitTime=" + waitTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractGiveSurprises)) return false;
        AbstractGiveSurprises that = (AbstractGiveSurprises) o;
        return waitTime == that.waitTime &&
                Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag, waitTime);
    }
}
