public abstract class Monster {
    private String name;
    private int attackPower;
    private int health;
    public int specialPower;

    public Monster(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public int getHealth() {
        return health;
    }
    public int getSpecialPower() {
        return specialPower;
    }
}
