/*
Define available character classes and their base attributes
 */

public enum CharacterClass {
    WARRIOR(30, 20, 10, 20),
    WIZARD(10, 20, 30, 20),
    ASSASSIN(20, 30, 10,20);

    private int strength;
    private int dexterity;
    private int intelligence;
    private int vitality;

    CharacterClass(int strength, int dexterity, int intelligence, int vitality) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
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
}
