/**
 * Created by teigenleonard on 6/26/17.
 */

// This class will use instances of the prompter and game classes.
public class HangMan {

    public static void main(String[] args) {
        Game game = new Game ("abundant");
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        }
      return isHit;

    }


}
