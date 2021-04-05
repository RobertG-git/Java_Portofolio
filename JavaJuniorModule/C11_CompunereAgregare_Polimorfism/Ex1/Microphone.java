package src.C11_CompunereAgregare_Polimorfism.Ex1;

import java.util.Objects;

public class Microphone {
    // fields
    private int maxVolume;
    private int crtVolume;

    // constructors
    public Microphone(int maxVolume) {
        this(maxVolume,maxVolume/4);
    }

    public Microphone(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    // methods
    public boolean increaseVolume() {
        if (this.crtVolume < this.maxVolume) {
            crtVolume++;
            System.out.println("class Microphone: Volume increased.");
            return true;
        }
        System.out.println("class Microphone: Volume is already at maxVolume.");
        return false;
    }

    public boolean decreaseVolume() {
        if (crtVolume > 0) {
            crtVolume--;
            System.out.println("class Microphone: Volume decreased.");
            return true;
        }
        System.out.println("class Microphone: Volume is already at minimum.");
        return false;
    }

    public void muteMicrophone() {
        System.out.println("class Microphone: Volume was set to 0.");
        this.crtVolume = 0;
    }

    @Override
    public String toString() {
        return "Microphone{" +
                "maxVolume=" + maxVolume +
                ", crtVolume=" + crtVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Microphone)) return false;
        Microphone that = (Microphone) o;
        return maxVolume == that.maxVolume &&
                crtVolume == that.crtVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume, crtVolume);
    }
}
