package C23_RecapitulareFinala.Ex6;

public class Pair {

    //object state
    public int divisor;
    public int pow;

    //constructor
    public Pair(int divisor, int pow) {
        this.divisor = divisor;
        this.pow = pow;
    }

    //setter & getter

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
