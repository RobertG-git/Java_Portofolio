package src.P2_ImparteSurprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{

    public GiveSurpriseAndHug(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
