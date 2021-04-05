package src.C12_MetodeClaseAbstracte_Interface.Ex2;

public class TestDevices {

    public static void main(String[] args) {

        // to create a smartphone, we will first create it's components
        // Obs: just like in real life
        Cover aCover = new Cover();

        Screen aPhoneScreen = new Screen(5, 10, 15, 2);
        Case aPhoneCase = new Case();
        Speaker aPhoneSpeaker = new Speaker(100, 50);
        Microphone aPhoneMicrophone = new Microphone(100, 50);
        Smartphone smartphone = new Smartphone(aPhoneScreen, aPhoneCase, aPhoneSpeaker, aPhoneMicrophone);

        // testing smartphone
            // setCover & remove cover
        System.out.println(smartphone.setCover(aCover));
        System.out.println(smartphone.setCover(aCover));
        System.out.println(smartphone.removeCover() + " \n");

            // pressPower/Volume buttons
        smartphone.pressPowerButton();
        smartphone.pressVolumeUp();
        smartphone.pressVolumeDown();
        System.out.println();

            // setPixel
        smartphone.setPixel(0,"blue");
        System.out.println();
        smartphone.colorScreen("red");
        System.out.println();

            // increase/decrease/mute/silence Microphone volume
        smartphone.increaseMicrophoneVolume();
        smartphone.decreaseMicrophoneVolume();
        smartphone.muteMicrophone();
        smartphone.setSilenceMode();

        // toString/Equals/hasCode test
        System.out.println(smartphone.toString());
        System.out.println(smartphone.hashCode());
        System.out.println(smartphone.equals(aCover));


    }
}
