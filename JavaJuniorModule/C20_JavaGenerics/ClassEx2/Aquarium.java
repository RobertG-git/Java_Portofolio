package src.C20_JavaGenerics.ClassEx2;

import java.util.ArrayList;

// 1 adding generic type
public class Aquarium<E extends AquaticAnimal> {

    private String description;
    private ArrayList<E> fishes = new ArrayList<>(); // notice the diamond
                                                                // <> notation! (starting Java 8)

    public Aquarium(String description) {
        this.description = description;
    }

    // 3. adding a new fish... of the same type E as the aquarium
    public boolean addFish(E fish) {
        if(fishes.contains(fish)) {
            // 2.1 No need to force casting -> code is much cleaner and
            //     will not throw exceptions for incompatible objects
            //     (because they will be fixed at compile time)
            System.out.println("Error: Fish " + fish.getName() + " is already in aquarium.");
            return false;
        }

        fishes.add(fish);
        // 3.2. Fixing the error implies a forced casting
        System.out.println("Fish " + fish.getName() + " added in aquarium.");
        return true;
    }

    // 4. removing fish of type E
    public E removeFish() {
        return fishes.remove(fishes.size() - 1);
    }

    public int numberOfFishes() {
        return fishes.size();
    }

    public boolean isEmpty() {
        return fishes.isEmpty();
    }

    public void mergeAquarium(Aquarium<E> other) {
        while(!other.isEmpty()) {
            this.addFish(other.removeFish());
        }
    }
}
