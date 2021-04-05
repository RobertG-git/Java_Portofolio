package P2_POO_OptimizareaPerformantei;

public class LazyNumberDetails {

    //Object state
    private int number;
    private int previousIsPrimeNumber;
    private int previousIsPerfectNumber;
    private int previousIsMagicNumber;
    private boolean previousValueOfIsPrime ;
    private boolean previousValueOfIsPerfect ;
    private boolean previousValueOfIsMagic;

    // Constructor
    public LazyNumberDetails(int number) {
        this.number = number;
    }

    // Setter & getter
    public void updateNumber(int number) {
        this.number = number;
    }
    public void setPreviousIsPrimeNumber(int previousIsPrimeNumber) {
        this.previousIsPrimeNumber = previousIsPrimeNumber;
    }
    public void setPreviousIsPerfectNumber(int previousIsPerfectNumber) {
        this.previousIsPerfectNumber = previousIsPerfectNumber;
    }
    public void setPreviousIsMagicNumber(int previousIsMagicNumber) {
        this.previousIsMagicNumber = previousIsMagicNumber;
    }
    public void setPreviousValueOfIsPrime(boolean previousValueOfIsPrime) {
        this.previousValueOfIsPrime = previousValueOfIsPrime;
    }
    public void setPreviousValueOfIsPerfect(boolean previousValueOfIsPerfect) {
        this.previousValueOfIsPerfect = previousValueOfIsPerfect;
    }
    public void setPreviousValueOfIsMagic(boolean previousValueOfIsMagic) {
        this.previousValueOfIsMagic = previousValueOfIsMagic;
    }

    public int getNumber() {
        return number;
    }
    public int getPreviousIsPrimeNumber() {
        return previousIsPrimeNumber;
    }
    public int getPreviousIsPerfectNumber() {
        return previousIsPerfectNumber;
    }
    public int getPreviousIsMagicNumber() {
        return previousIsMagicNumber;
    }
    public boolean getPreviousValueOfIsPrime() {
        return previousValueOfIsPrime;
    }
    public boolean getPreviousValueOfIsPerfect() {
        return previousValueOfIsPerfect;
    }
    public boolean getPreviousValueOfIsMagic() {
        return previousValueOfIsMagic;
    }

    // Object behaviour
    public boolean isPrime() {
        if (getNumber() == getPreviousIsPrimeNumber()) {
            System.out.println("**cached** Is Prime");
            return getPreviousValueOfIsPrime();
        } else {
            setPreviousIsPrimeNumber(getNumber());
            boolean result = NumberService.isPrimeAlgorithm(getNumber());
            setPreviousValueOfIsPrime(result);
            return result;
        }
    }
    public boolean isPerfect() {
        if (getNumber() == getPreviousIsPerfectNumber()) {
            System.out.println("**cached** Is Perfect");
            return getPreviousValueOfIsPerfect();
        } else {
            setPreviousIsPerfectNumber(getNumber());
            boolean result = NumberService.isPerfectAlgorithm(getNumber());
            setPreviousValueOfIsPerfect(result);
            return result;
        }
    }
    public boolean isMagic() {
        if (getNumber() == getPreviousIsMagicNumber()) {
            System.out.println("**cached** Is Magic");
            return getPreviousValueOfIsMagic();
        } else {
            System.out.print("Calculated with isMagicAlgorithm ");
            setPreviousIsMagicNumber(getNumber());
            int reducingANumberBySummation = NumberService.reducingANumberBySummation(getNumber());
            boolean result = reducingANumberBySummation == 3 || reducingANumberBySummation == 7 || reducingANumberBySummation == 9;
            setPreviousValueOfIsMagic(result);
            return result;
        }
    }
}
