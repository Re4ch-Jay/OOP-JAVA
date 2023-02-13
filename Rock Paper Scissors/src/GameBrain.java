class GameBrain {

    private int rock = 1;
    private int paper = 2;
    private int scissors = 3;
    private int aiChoice, humanChoice;

    GameBrain() {

    }

    GameBrain(int aiChoice, int humanChoice) {
        this.aiChoice = aiChoice;
        this.humanChoice = humanChoice;
    }

    int getAiChoice() {
        if (this.aiChoice == 1) {
            return rock;
        } else if (this.aiChoice == 2) {
            return paper;
        } else {
            return scissors;
        }
    }

    int getHumanChoice() {
        return this.humanChoice;
    }

    String checkWinner() {
        getAiChoice();
        getHumanChoice();

        if (getAiChoice() == rock && getHumanChoice() == rock) {
            return "It is a tie";
        } else if (getAiChoice() == rock && getHumanChoice() == paper) {
            return "You are a winner";
        } else if (getAiChoice() == rock && getHumanChoice() == scissors) {
            return "Ai is a winner";
        } else if (getAiChoice() == paper && getHumanChoice() == rock) {
            return "Ai is a winner";
        } else if (getAiChoice() == paper && getHumanChoice() == paper) {
            return "It is a tie";
        } else if (getAiChoice() == paper && getHumanChoice() == scissors) {
            return "You are a winner";
        } else if (getAiChoice() == scissors && getHumanChoice() == rock) {
            return "You are a winner";
        } else if (getAiChoice() == scissors && getHumanChoice() == paper) {
            return "Ai is a winner";
        } else if (getAiChoice() == scissors && getHumanChoice() == scissors) {
            return "It is a tie";
        } else {
            return "";
        }
    }

}