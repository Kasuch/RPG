public final class Utilities {
    private static Dice dice = new Dice();

    private Utilities() {
        throw new UnsupportedOperationException("This is utility class. It can't be instantiated");
    }

    public static int attack(int diceSize) {
        int damage;
        damage = dice.roll(diceSize); //todo update formula to deal damage based on player attributes and used weapon
        return damage;
    }
}
