package src.P2_ImparteSurprize;

import java.util.Objects;
import java.util.Random;

public class FortuneCookie implements ISurprise{

    // field
    private final String symbolicMessage;
    private static final String[] saying = {Constants.SAYING1,Constants.SAYING2,Constants.SAYING3, Constants.SAYING4,
            Constants.SAYING5, Constants.SAYING6, Constants.SAYING7, Constants.SAYING8, Constants.SAYING9,
            Constants.SAYING10,Constants.SAYING11,Constants.SAYING12, Constants.SAYING13, Constants.SAYING14,
            Constants.SAYING15, Constants.SAYING16, Constants.SAYING17, Constants.SAYING18, Constants.SAYING19,
            Constants.SAYING20};
    private static final Random random = new Random();

    // constructor
    public FortuneCookie(String symbolicMessage) {
        this.symbolicMessage = symbolicMessage;
    }

    // method

    public static FortuneCookie generate() {

        int sayingIndex = random.nextInt(19);
        return new FortuneCookie(saying[sayingIndex]);

    }

    @Override
    public  void enjoy() {
        System.out.println(generate());
    }

    @Override
    public String toString() {
        return this.symbolicMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FortuneCookie)) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(symbolicMessage, that.symbolicMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbolicMessage);
    }
}
