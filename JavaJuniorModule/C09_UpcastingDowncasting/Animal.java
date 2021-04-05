package src.C9_UpcastingDowncasting;

public class Animal {
    // The class has 4 fields
    private boolean carnivore;
    private int weight;
    private int size;
    private String species;

    // The class has 1 constructor:
    public Animal(boolean carnivore, int weight, int size, String species) {
        this.carnivore = carnivore;
        this.weight = weight;
        this.size = size;
        this.species = species;
    }

    // The class has 3 methods
    public void eat(int unitsOfFood) {
        System.out.println("The animal eats " + unitsOfFood + " units of food.");
    }

    public void move(int distance) {
        System.out.println("The animal moves " + distance + " meters.");
    }

    @Override
    public String toString() {
       return "The animal is a " + this.species + "; has a size of "
                + this.size + "; weighs " + this.weight + " and is "
                + (this.carnivore ? "" : "not ") + "a carnivore.";
    }

    public final void printSpecies() {
        System.out.println("The scientific species is: " + this.species);
    }
}
