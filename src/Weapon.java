public enum Weapon {
    SWORD(20, 10, 20),
    AXE(30, 10, 30),
    DAGGER(10, 25, 15),
    STAFF(10, 15, 10),
    BOW(20, 30, 20);

    private int requiredStrength;
    private int requiredDexterity;
    private int baseDamage;

    Weapon(int requiredStrength, int requiredDexterity, int baseDamage) {
        this.requiredStrength = requiredStrength;
        this.requiredDexterity = requiredDexterity;
        this.baseDamage = baseDamage;
    }

    public int getRequiredStrength() {
        return requiredStrength;
    }

    public void setRequiredStrength(int requiredStrength) {
        this.requiredStrength = requiredStrength;
    }

    public int getRequiredDexterity() {
        return requiredDexterity;
    }

    public void setRequiredDexterity(int requiredDexterity) {
        this.requiredDexterity = requiredDexterity;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
