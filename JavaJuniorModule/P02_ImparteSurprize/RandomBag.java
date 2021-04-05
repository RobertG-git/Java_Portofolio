package src.P2_ImparteSurprize;

import java.util.Random;

public class RandomBag extends AbstractBag {

    private static final Random random = new Random();

    @Override
    public ISurprise takeOut() {
        if (!super.getBag().isEmpty()) {
            int randomIndex = random.nextInt(super.getBag().size());
            ISurprise surprise = super.getBag().get(randomIndex);
            super.getBag().remove(randomIndex);
            return surprise;
        }
        return null;
    }

}
