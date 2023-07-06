class Mage implements Character {
    private int attackPower;
    private int defense;
    private int magicPower;

    public Mage(int attackPower, int defense, int magicPower) {
        this.attackPower = attackPower;
        this.defense = defense;
        this.magicPower = magicPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public int getMagicPower() {
        return magicPower;
    }
}
