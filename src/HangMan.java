/**
 * Created by teigenleonard on 6/26/17.
 */

// This class will use instances of the prompter and game classes.
public class HangMan {

    public static void main(String[] args) {
        Game game = new Game ("abundant");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();

        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("Yes!");
        } else {
            System.out.println("Hmmmm, nice try but guess again.");
        }
        prompter.displayProgress();
    }
}
