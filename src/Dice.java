import java.util.Random;

public class Dice {

    public int roll(int diceSize) {
        int result;
        Random random = new Random();
        result = random.nextInt(diceSize) + 1;
        return result;
    }
}
