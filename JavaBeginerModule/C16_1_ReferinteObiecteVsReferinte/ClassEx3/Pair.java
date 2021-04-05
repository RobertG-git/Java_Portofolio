package C16_1_ReferinteObiecteVsReferinte.ClassEx3;

public class Pair {

    private int firstNo;
    private int secondNo;

    public Pair(int firstNo, int secondNo) {
        this.firstNo = firstNo;
        this.secondNo = secondNo;
    }

    public void setFirst(int firstNo) {
        this.firstNo = firstNo;
    }

    public void setSecond(int secondNo) {
        this.secondNo = secondNo;
    }

    public void print() {
        System.out.println("(" + this.firstNo + "," + this.secondNo + ")");
    }

    public int getSecondNo() {
        return secondNo;
    }

    public int getFirstNo() {
        return firstNo;
    }

}
