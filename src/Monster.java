public abstract class Monster {
    public String name;
    public int attackPower;
    public int health;

    public Monster(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }
    public Monster() {

    }
    public String getName() {
        return name;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public int attack() {
        return attackPower;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public abstract void monsterAttack(Monster monster);
}
