import java.util.Scanner;

public class RPGMain {

    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        CharacterClass[] characterClasses = CharacterClass.values();
        int selectedClass;
        System.out.println("Welcome to awesome text RPG adventure!");
        System.out.println("What is your name?");
        String playerName = textScanner.nextLine();

        do {
            System.out.println("Select your class:");
            for (int i = 0; i < characterClasses.length; i++) {
                System.out.println("[" + (i + 1) + "] " + characterClasses[i]);
            }
            selectedClass = intScanner.nextInt();
        } while (selectedClass < 1 || selectedClass > characterClasses.length);


        PlayerCreator player = new PlayerCreator(playerName, CharacterClass.getCharacterClass(selectedClass));
        System.out.println(player);
//        Dice dice = new Dice();
//        System.out.println(dice.roll(4));
    }
}
