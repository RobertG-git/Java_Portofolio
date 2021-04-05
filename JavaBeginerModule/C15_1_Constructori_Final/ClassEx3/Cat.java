package C15_1_Constructori_Final.ClassEx3;

public class Cat {
    private String kind;
    private int weight;
    private int agility;

    public Cat(int weight) {
        this.weight = weight;
    }

    public Cat(int weight, int agility) {
        this(weight);
        this.agility = agility;
    }

    public Cat(int weight, int agility, String kind) {
        this(weight, agility);
        this.kind = kind;
    }

    public void displayCatInfo() {
        System.out.println("Name of cat is: " + kind + " , weight is " + weight + " and agility level is " + agility + ".");
    }
}
