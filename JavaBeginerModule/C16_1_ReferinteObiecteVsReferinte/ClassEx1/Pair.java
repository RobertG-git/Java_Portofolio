package C16_1_ReferinteObiecteVsReferinte.ClassEx1;

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



}
