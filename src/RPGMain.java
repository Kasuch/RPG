public class RPGMain {

    public static void main(String[] args) {
        PlayerCreator player = new PlayerCreator("Mighty John", CharacterClass.WARRIOR);
        System.out.println(player);
        Dice dice = new Dice();
        System.out.println(dice.roll(4));
    }
}
