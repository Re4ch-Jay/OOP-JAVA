class GameBrain {

    final private int rock = 1;
    final private int paper = 2;
    final private int scissors = 3;
    final private int aiChoice, humanChoice;

    /**
     * @param aiChoice
     * @param humanChoice
     */
    GameBrain(int aiChoice, int humanChoice) {
        this.aiChoice = aiChoice;
        this.humanChoice = humanChoice;
    }

    /**
     * @return
     */
    int getAiChoice() {
        if (this.aiChoice == 1) {
            return rock;
        } else if (this.aiChoice == 2) {
            return paper;
        } else {
            return scissors;
        }
    }

    /**
     * @return
     */
    int getHumanChoice() {
        return this.humanChoice;
    }

    /**
     * @return
     */
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

    public int getRock() {
        return rock;
    }

    public int getPaper() {
        return paper;
    }

    public int getScissors() {
        return scissors;
    }

}