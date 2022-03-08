/*
Class responsible for creating new playable character
Assign attributes based on chosen character class (defined in CharacterClass class)
Calculate statistics based on attributes (mana, health)
 */

public class PlayerCreator {
    private String name;
    private CharacterClass charClass;
    private int health;
    private int mana;
    private int level;
    private int xp;

    public PlayerCreator(String name, CharacterClass charClass) {
        this.name = name;
        this.charClass = charClass;
        this.health = charClass.getVitality() * 10;
        this.mana = charClass.getIntelligence() * 10;
        this.level = 1;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "PlayerCreator{" +
                "name='" + name + '\'' +
                ", strength=" + charClass.getStrength() +
                ", dexterity=" + charClass.getDexterity() +
                ", intelligence=" + charClass.getIntelligence() +
                ", vitality=" + charClass.getVitality() +
                ", health=" + health +
                ", mana=" + mana +
                ", level=" + level +
                ", xp=" + xp +
                '}';
    }
}
