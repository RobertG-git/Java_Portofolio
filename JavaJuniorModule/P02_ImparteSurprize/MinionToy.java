package src.P2_ImparteSurprize;

import java.util.Objects;

public class MinionToy implements ISurprise {

    // fields
    private final String symbolicMinion;
    private static int minionIndex = -1;
    private static final String[] Minions = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};


    // constructor
    public MinionToy(String symbolicMinion) {
        this.symbolicMinion = symbolicMinion;
    }

    // method
    public static MinionToy generate() {
        minionIndex++;
        if (minionIndex > 5) {
            minionIndex = 0;
        }
        return new MinionToy(Minions[minionIndex]);
    }

    @Override
    public void enjoy() {
        System.out.println("Your surprise contains a " + this.symbolicMinion + " minion.");
    }

    @Override
    public String toString() {
        return "Your surprise contains a " + this.symbolicMinion + " minion.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MinionToy)) return false;
        MinionToy minionToy = (MinionToy) o;
        return Objects.equals(symbolicMinion, minionToy.symbolicMinion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbolicMinion);
    }
}
