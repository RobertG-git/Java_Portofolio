package src.C12_MetodeClaseAbstracte_Interface.Ex2;

import java.util.Objects;

public class Smartphone {
    // composition
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;

    // aggregation
    private Cover aCover;
    private ScreenProtector aScreenProtector;

    // direct constructor
    public Smartphone(Screen theScreen, Case theCase, Speaker theSpeaker, Microphone theMicrophone) {
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }

    // indirect constructor
    public Smartphone(int pixelNo, int width, int length, int depth, int speakerMaxVol, int microMaxVol) {
        this.theScreen = new Screen(pixelNo, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol);
        this.theMicrophone = new Microphone(microMaxVol);
    }

    public Smartphone(int pixelNo, int width, int length, int depth, int speakerMaxVol, int speakerCrtVol, int microMaxVol, int microCtrVol) {
        this.theScreen = new Screen(pixelNo, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
        this.theMicrophone = new Microphone(microMaxVol, microCtrVol);
    }

    // Methods
    public boolean setCover(Cover aCover) {
        if (this.aCover != null) {
            System.out.println("Err: A cover is already in place!");
            return false;
        }
        this.aCover = aCover;
        return true;
    }

    public Cover removeCover() {
        Cover referenceToCover = this.aCover;
        this.aCover = null;
        return referenceToCover;
    }

    public void pressPowerButton() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressPowerButton();
    }

    public void pressVolumeUp() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeUp();
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeDown();
        System.out.println("Class Smartphone: delegate to Speaker ->");
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int indexPixel,String color) {
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.setPixel(indexPixel, color);
    }

    public void colorScreen(String color) {
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.decreaseVolume();
    }

    public void muteMicrophone() {
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.muteMicrophone();
    }

    public void setSilenceMode() {
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.setSilenceMode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "theScreen=" + theScreen +
                ", theCase=" + theCase +
                ", theSpeaker=" + theSpeaker +
                ", theMicrophone=" + theMicrophone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        Smartphone that = (Smartphone) o;
        return theScreen.equals(that.theScreen) &&
                theCase.equals(that.theCase) &&
                theSpeaker.equals(that.theSpeaker) &&
                theMicrophone.equals(that.theMicrophone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theScreen, theCase, theSpeaker, theMicrophone);
    }
}
