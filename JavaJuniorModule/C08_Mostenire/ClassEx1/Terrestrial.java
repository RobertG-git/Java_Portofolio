package src.C8_Mostenire.ClassEx1;

public class Terrestrial extends Animal {
    //Fields
    private int legs;
    private int eyes;

    //Constructors
    public Terrestrial(boolean carnivore, int weight, int size, String species) {
        super(carnivore, weight, size, species);
    }

    public Terrestrial(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
        super(carnivore, weight, size, species);
        this.legs = legs;
        this.eyes = eyes;
    }

    //Methods
    public void fight() {
        System.out.println("The terrestrial animal is now fighting!!");
    }

    @Override
    public void move(int distance) {
        System.out.println("This is a terrestrial species.");
        super.move(distance);
    }

    @Override
    public void description() {
        System.out.println("The terrestrial animal has: " + this.legs + " legs and " + this.eyes + " eyes.");
        super.description();
    }



}
