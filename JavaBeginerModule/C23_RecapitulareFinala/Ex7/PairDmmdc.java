package C23_RecapitulareFinala.Ex7;

public class PairDmmdc {

    //object state

    private int divisor;
    private int pow;

    //constructor;

    public PairDmmdc (int divisor, int pow){
        this.divisor = divisor;
        this.pow = pow;
    }

    //setters & getters


    public int getDivisor() {
        return divisor;
    }

    public int getPow() {
        return pow;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }
}
