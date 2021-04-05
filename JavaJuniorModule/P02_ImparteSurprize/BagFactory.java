package src.P2_ImparteSurprize;

public final class BagFactory implements IBagFactory{

    public BagFactory() {
    }

    @Override
    public IBag makeBag(String type) {
        if (type.equalsIgnoreCase("RANDOM")) {
            return new RandomBag();
        } else if (type.equalsIgnoreCase("FIFO")) {
            return new FIFOBag();
        } else if(type.equalsIgnoreCase("LIFO")) {
            return new LIFOBag();
        }
        return null;
    }


}
