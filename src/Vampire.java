public class Vampire extends Monster {
    public Vampire(String name, int attackPower, int health) {
        super(name, attackPower, health);
        this.specialPower = 1; //small chance of recovering health

    }
}
