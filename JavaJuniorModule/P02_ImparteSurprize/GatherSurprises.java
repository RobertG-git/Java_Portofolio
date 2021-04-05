package src.P2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static final Random random = new Random();

    // constructor
    private GatherSurprises() {

    }

    // method
    public static ArrayList<ISurprise> gather(int n) {

        ArrayList<ISurprise> randomSurprises = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int randomValue = random.nextInt(3);
            if (randomValue == 0) {
                randomSurprises.add(FortuneCookie.generate());
            } else if (randomValue == 1) {
                randomSurprises.add(Candies.generate());
            } else {
                randomSurprises.add(MinionToy.generate());
            }
        }
        return randomSurprises;
    }

    public static ISurprise gather() {
        int randomValue = random.nextInt(3);
        ISurprise randomSurprise;

        if (randomValue == 0) {
            randomSurprise = FortuneCookie.generate();
        } else if (randomValue == 1) {
            randomSurprise = Candies.generate();
        } else {
            randomSurprise = MinionToy.generate();
        }
        return randomSurprise;
    }
}
