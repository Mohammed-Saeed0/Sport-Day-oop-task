package sportDay;

abstract class Game {
    // private variable to store information about the game
    protected String gameName;

    // Parameterized constructor to initialize game object
    public Game(String gameName) {
        this.gameName = gameName;
    }

    // setter and getter
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    // Abstract method to calculate points for the game when the team win
    abstract public int win();
    // Abstract method to calculate points for the game when the team lose
    abstract public int lose();
}