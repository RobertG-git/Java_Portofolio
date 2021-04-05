package src.C11_CompunereAgregare_Polimorfism.Ex1;

import java.util.Objects;

public class Speaker {

    // fields
    private int maxVolume;
    private int crtVolume;

    // constructors
    public Speaker(int maxVolume) {
        this(maxVolume,maxVolume/4);
    }

    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    // methods
    public boolean increaseVolume() {
        if (this.crtVolume < this.maxVolume) {
            crtVolume++;
            System.out.println("class Speaker: Volume increased.");
            return true;
        }
        System.out.println("class Speaker: Volume is already at maxVolume.");
        return false;
    }

    public boolean decreaseVolume() {
        if (crtVolume > 0) {
            crtVolume--;
            System.out.println("class Speaker: Volume decreased.");
            return true;
        }
        System.out.println("class Speaker: Volume is already at minimum.");
        return false;
    }

    public void setSilenceMode() {
        System.out.println("class Speaker: Current volume is set to 0.");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "maxVolume=" + maxVolume +
                ", crtVolume=" + crtVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speaker)) return false;
        Speaker speaker = (Speaker) o;
        return maxVolume == speaker.maxVolume &&
                crtVolume == speaker.crtVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume, crtVolume);
    }
}
