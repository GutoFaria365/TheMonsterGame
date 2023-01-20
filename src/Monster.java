public abstract class Monster {
    public String name;
    public int attackPower;
    public int health;
    private boolean isDead;
    public Monster(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
        this.isDead = false;
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

    public boolean isDead(){
        if(this.health <= 0) {
            this.isDead = true;
            System.out.println(this.getName() + " has been slain!!!");
        } else
            System.out.println(this.getName() + " has " + this.health + " health remaining.");
        return false;
    }
}
