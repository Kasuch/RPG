import java.util.Random;

public class Enemy {

    private final String name;
    private final int health;
    private final int minDamage;
    private final int maxDamage;
    private final int experienceGiven;
    private final static Random random = new Random();


    public Enemy(String name, int health, int minDamage, int maxDamage, int experienceGiven) {
        this.name = name;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.experienceGiven = experienceGiven;
    }

    public static Enemy randomEnemyEncounter() {
        int enemyGenerated;
        enemyGenerated = random.nextInt(6);

        if (enemyGenerated == 0) {
            return new Enemy("Rat", 20, 1, 3, 10);
        } else if (enemyGenerated == 1) {
            return new Enemy("Zombie", 40, 1, 5, 50);
        } else if (enemyGenerated == 2) {
            return new Enemy("Skeleton", 50, 3, 10, 100);
        } else if (enemyGenerated == 3) {
            return new Enemy("Golem", 100, 10, 20, 200);
        } else if (enemyGenerated == 4) {
            return new Enemy("Wolf", 50, 2, 5, 50);
        } else {
            return new Enemy("Lizard", 30, 2, 5, 50);
        }
    }
}
