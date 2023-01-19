public abstract class Monster {
    private String name;
    private String type;
    private int attackPower;
    private int health;

    public Monster(String name, String type, int attackPower, int health) {
        this.name = name;
        this.type = type;
        this.attackPower = attackPower;
        this.health = health;
    }
}
