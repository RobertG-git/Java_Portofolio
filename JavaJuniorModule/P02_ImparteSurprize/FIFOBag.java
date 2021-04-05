package src.P2_ImparteSurprize;

public class FIFOBag extends AbstractBag{

    @Override
    public ISurprise takeOut() {
        if (!super.getBag().isEmpty()) {
            ISurprise surprise = super.getBag().get(0);
            super.getBag().remove(0);
            return surprise;
        }
        return null;
    }
}
