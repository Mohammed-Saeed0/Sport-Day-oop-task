package sportDay;

class IndividualSportGame extends Game { // inheritance
    // Constructor that match the constructor in the super or parent
    public IndividualSportGame(String gameName) {
        super(gameName);
    }

    // method to calculate the score when the individual win
    public int win() {
        return 20;
    }

    // method to calculate the score when the individual lose
    public int lose() {
        return 0;
    }
}