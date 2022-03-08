import java.util.Scanner;

public class RPGMain {

    public static void main(String[] args) {
        PlayerCreator player = new PlayerCreator("Mighty John", CharacterClass.WARRIOR);
        System.out.println(player);
    }
}
