package sportDay;

// sportDay.TeamSportGame class extending sportDay.Game
class TeamSportGame extends Game { // inheritance

    // Constructor that match the constructor in the super or parent
    public TeamSportGame(String gameName) {
        super(gameName);
    }

    // method to calculate the score when the team win
    public int win() {
        return 50;
    }

    // method to calculate the score when the team lose
    public int lose() {
        return 0;
    }
}