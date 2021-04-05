package P1_ConcepteOOP;

public class Main {

    public static void main(String[] args) {

        System.out.println("Program started! " + "\n");

        // Player 1 & 2
        PlayerStatus playerRg = new PlayerStatus();
        playerRg.initPlayer("Robert",5, 20000);
        PlayerStatus playerAna = new PlayerStatus();
        playerAna.initPlayer("Ana",5, 20000);

        // State after 'findArtifact'
        playerRg.findArtifact(6);
        playerAna.findArtifact(7);

        System.out.println("Lives for playerRG is: " + playerRg.getLives() + ".");
        System.out.println("Health for playerRG is: " +  playerRg.getHealth() + ".");
        System.out.println("Score for playerRG is: " + playerRg.getScore() + "." + "\n");

        System.out.println("Lives for playerAna is: " + playerAna.getLives() + ".");
        System.out.println("Health for playerAna is: " +  playerAna.getHealth() + ".");
        System.out.println("Score for playerAna is: " + playerAna.getScore() + "." + "\n");

        // game name set/get
        PlayerStatus.setGameName("Counter Strike");
        System.out.println("Current 'gameName' is: " + PlayerStatus.getGameName() + ".");
        System.out.println("playerRg 'gameName' is: " + playerRg.getGameName() + ".");
        System.out.println("playerAna 'gameName' is: " + playerAna.getGameName() + "." + "\n");

        playerAna.setGameName("Ana Game");
        System.out.println("Current 'gameName' is: " + PlayerStatus.getGameName() + ".");
        System.out.println("playerRg 'gameName' is: " + playerRg.getGameName() + ".");
        System.out.println("playerAna 'gameName' is: " + playerAna.getGameName() + "." + "\n");

        // position change
        playerRg.movePlayerTo(2.2 , 2);
        playerAna.movePlayerTo(3.5 , 2000);
        System.out.println("PositionX & PositionY for playerRG is: " + playerRg.getPositionX() + " / " + playerRg.getPositionY() + ".");
        System.out.println("PositionX & PositionY for playerAna is: " + playerAna.getPositionX() + " / " + playerAna.getPositionY() + "." + "\n");

        // weaponInHand set for players
        System.out.println("WeaponRG successfully changed: " + playerRg.setWeaponInHand("kalashnikov") + ".");
        System.out.println("WeaponAna successfully changed: " + playerAna.setWeaponInHand("knife") + ".");
        System.out.println("playerRG 'weaponInHand' is: " + playerRg.getWeaponInHand() + ".");
        System.out.println("playerAna 'weaponInHand' is: " + playerAna.getWeaponInHand() + "." + "\n");

        // possibility to win
        System.out.println("shouldAttackOpponent: " + playerRg.shouldAttackOpponent(playerAna) + ".");

    }

}
