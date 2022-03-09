/*
Define available character classes and their base attributes
 */

public enum CharacterClass {
    WARRIOR(30, 20, 10, 20, 1),
    WIZARD(10, 20, 30, 20, 2),
    ASSASSIN(20, 30, 10,20, 3);

    private int strength;
    private int dexterity;
    private int intelligence;
    private int vitality;
    private int selection;

    CharacterClass(int strength, int dexterity, int intelligence, int vitality, int selection) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.selection = selection;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public static CharacterClass getCharacterClass(int selection) {
        for (CharacterClass element : values()) {
            if (selection == element.selection) {
                return element;
            }
        }
        return null;
    }
}
