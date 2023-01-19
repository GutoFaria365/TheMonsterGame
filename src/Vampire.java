public class Vampire extends Monster {
    public Vampire(String name, int attackPower, int health) {
        super(name, attackPower, health);
        this.specialPower = 1; //small chance of recovering health
    }
    public Vampire () {
        this.name = "Vampire";
        this.attackPower = 20;
        this.health = 100;
        this.specialPower = 1;
    }
}
