package src.P2_ImparteSurprize;

import java.util.Objects;
import java.util.Random;

public class Candies implements ISurprise{

    // fields
    private final String symbolicCandy;
    private final int numberOfCandies;
    private static final String[] candies = {"chocolate(s)", "jelly(s)", "fruit(s)", "vanilla(s)"};
    private static final Random random = new Random();

    // constructor
    public Candies(String symbolicCandy, int numberOfCandies) {
        this.symbolicCandy = symbolicCandy;
        this.numberOfCandies = numberOfCandies;
    }

    // method
    public static Candies generate() {
        int candiesIndex = random.nextInt(3);
        int numberOfCandies = random.nextInt(10);
        return new Candies(candies[candiesIndex],numberOfCandies);
    }

    @Override
    public  void enjoy() {
        System.out.println(generate());
    }

    @Override
    public String toString() {
        return "Your surprise contains " + this.numberOfCandies + " " + this.symbolicCandy + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candies)) return false;
        Candies candies = (Candies) o;
        return this.numberOfCandies == candies.numberOfCandies &&
                Objects.equals(symbolicCandy, candies.symbolicCandy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbolicCandy, numberOfCandies);
    }
}
