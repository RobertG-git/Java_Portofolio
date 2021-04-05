package src.C8_Mostenire.ClassEx1;

public class Main {

    public static void main(String[] args) {
        Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10, "monkey",4,2);

        aTerrestrialAnimal.eat(5);
        aTerrestrialAnimal.fight();
        aTerrestrialAnimal.description();

        System.out.println();
        aTerrestrialAnimal.move(10);
    }
}
