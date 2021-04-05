package src.C20_JavaGenerics.ClassEx2;

public class AquariumManager {

    public static void main(String[] args) {
        Shark shark = new Shark("Jow");
        Tuna tuna = new Tuna("Waty");
        Dolphin dolphin = new Dolphin("Dora");

        // notice the diamond
        Aquarium<Shark> sharkAquarium = new Aquarium<>("Ferocious beasts");
        sharkAquarium.addFish(shark);
        sharkAquarium.addFish(new Shark("Ferorino"));
        sharkAquarium.addFish(new Shark("Dangerino"));

        // Next two lines trigger compile error, nice!
//        sharkAquarium.addFish(tuna);
//        sharkAquarium.addFish(dolphin);

        // notice the diamond
        Aquarium<Dolphin> dolphinAquarium = new Aquarium<>("Swim with dolphins");
        dolphinAquarium.addFish(dolphin);
        dolphinAquarium.addFish(new Dolphin("Laughy"));
        dolphinAquarium.addFish(new Dolphin("Ginger"));

        System.out.println(sharkAquarium.numberOfFishes());


        // Compile time error for trying to create
        // an aquarium with an incompatible inner type. Nice!
//        Aquarium<Integer> aq3 = new Aquarium<>("An aquarium with numberrs");
//        Aquarium<String> aq4 = new Aquarium<>("An aquarium with letters??");

        // No exception thrown because compiler detects first the bug!
//        aq3.addFish(3);
//        aq4.addFish("String");
    }
}
