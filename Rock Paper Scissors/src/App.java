import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int aiChoice = random.nextInt(3) + 1;

        System.out.print("Rock 1:, Paper: 2, Scissors: 3: ");
        int humanChoice = scanner.nextInt();

        GameBrain gameBrain = new GameBrain(aiChoice, humanChoice);

        System.out.println("Ai choose: " + gameBrain.getAiChoice());
        System.out.println("You choose: " + gameBrain.getHumanChoice());
        System.out.println(gameBrain.checkWinner());

    }
}
