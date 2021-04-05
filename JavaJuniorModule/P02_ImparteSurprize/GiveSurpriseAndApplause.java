package src.P2_ImparteSurprize;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
