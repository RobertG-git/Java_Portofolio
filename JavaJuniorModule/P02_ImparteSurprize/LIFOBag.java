package src.P2_ImparteSurprize;

public class LIFOBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (!super.getBag().isEmpty()) {
            ISurprise surprise = super.getBag().get(getBag().size() - 1);
            super.getBag().remove(getBag().size() - 1);
            return surprise;
        }
        return null;
    }

}
