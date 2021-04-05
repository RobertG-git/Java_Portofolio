package P1_ConcepteOOP;

import static P1_ConcepteOOP.NumberService.*;
import static P1_ConcepteOOP.Constants.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PlayerStatus {

    // Object state
    private String nickname;
    private int score;
    private int lives;
    private int health;
    private String weaponInHand;
    private double positionX;
    private double positionY;
    private static String gameName;

    // Object behaviour

    // 1. a, b, c.

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }
    private void setLives(int lives) {
        this.lives = lives;
    }
    private void setScore(int score) {
        this.score = score;
    }

    public void initPlayer(String nickname) {
        setNickname(nickname);
    }

    public void initPlayer(String nickname, int lives) {
        setNickname(nickname);
        setLives(lives);
    }

    public void initPlayer(String nickname, int lives, int score) {
        setNickname(nickname);
        setLives(lives);
        setScore(score);
    }

    // 2. a, b, c, d.

    private void setHealth(int health) {
        this.health = health;
    }
        // public or protected for getScore/getLives/getHealth based on need - in problem design rules is not specified.
    public int getScore() {
        return score;
    }
    public int getLives() {
        return lives;
    }
    public int getHealth() {
        return health;
    }

    public void findArtifact(int artifactCode) {
        while (true) {
            if (perfectNumber(artifactCode)) {
                setScore(getScore() + 5000);
                setLives(getLives() + 1);
                setHealth(100);
                break;
            }
            if (oddNumber(artifactCode)) {
                setScore(getScore() + 1000);
                setLives(getLives() + 2);
                setHealth(getHealth() + 25);
                if (getHealth() > 100) {
                    setHealth(100);
                }
                break;
            }
            if ((!oddNumber(artifactCode)) && (sumDigitDiv3(artifactCode))) {
                setScore(getScore() - 3000);
                setHealth(getHealth() - 25);
                if (getHealth() < 0) {
                    setLives(getLives() - 1);
                    setHealth(100);
                    if (getLives() == 0) {
                        System.out.println("Game Over");
                    }
                }
                break;
            } else {
                setScore(artifactCode);
                break;
            }
        }
    }

    // 3.
    public boolean setWeaponInHand(String weaponInHand) {
        boolean weaponSuccessfullyChanged = false;
        if ((weaponInHand.equals(KNIFE)) && (getScore() >= 1000) ) {
            this.weaponInHand = KNIFE;
            setScore(getScore() - 1000);
            weaponSuccessfullyChanged = true;
        } else if ((weaponInHand.equals(SNIPER)) && (getScore() >= 10000)) {
            this.weaponInHand = SNIPER;
            setScore(getScore() - 10000);
            weaponSuccessfullyChanged = true;
        } else if ((weaponInHand.equals(KALASHNIKOV)) && (getScore() >= 20000)) {
            this.weaponInHand = KALASHNIKOV;
            setScore(getScore() - 20000);
            weaponSuccessfullyChanged = true;
        }
        return weaponSuccessfullyChanged;
    }

    // 4.
    public String getWeaponInHand() {
        return weaponInHand;
    }

    // 5.
    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionX () {
        return positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getPositionY() {
        return positionY;
    }

    // 6.
    protected static void setGameName(String GameName) {
        gameName = GameName;
    }

    protected static String getGameName() {
        return gameName;
    }

    // 7.
    public void movePlayerTo(double positionX, double positionY) {
        setPositionX(positionX);
        setPositionY(positionY);
    }

    // 8.
    public String getNickname() {
        return nickname;
    }

    // 9.
    private double distanceToOpponent(double positionXObj2, double positionYObj2) {
        return sqrt( pow((getPositionX() - positionXObj2) , 2) + pow((getPositionY() - positionYObj2) , 2) );
    }

    public boolean shouldAttackOpponent(PlayerStatus opponent) {

        boolean duelWon = false;
        if (getWeaponInHand().equals(opponent.getWeaponInHand())) {
            double winChance = ( ((3 * getHealth() + (double) getScore() /1000)/4) -
                    ((3 * opponent.getHealth() + (double) opponent.getScore() /1000)/4) );
            duelWon = winChance > 0;
        } else {
            if (distanceToOpponent(opponent.getPositionX(), opponent.getPositionY()) > 1000) {
                if (getWeaponInHand().equals(SNIPER)) {
                    duelWon = true;
                } else if ( (getWeaponInHand().equals(KALASHNIKOV)) && (opponent.getWeaponInHand().equals(KNIFE)) ) {
                    duelWon = true;
                }
            } else if (distanceToOpponent(opponent.getPositionX(), opponent.getPositionY()) <= 1000) {
                if (getWeaponInHand().equals(KALASHNIKOV)) {
                    duelWon = true;
                } else if ( (getWeaponInHand().equals(SNIPER)) && (opponent.getWeaponInHand().equals(KNIFE)) ) {
                    duelWon = true;
                }
            }
        }
        System.out.println("distanceToOpponent is: " + distanceToOpponent(opponent.getPositionX(), opponent.getPositionY()));
        return duelWon;
    }
}
