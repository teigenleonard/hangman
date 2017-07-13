/**
 * Created by teigenleonard on 7/11/17.
 */
// This class maintains the game logic
public class Game {
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
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
