public class Vampire extends Monster {
    public Vampire(String name, int attackPower, int health) {
        super(name, attackPower, health);

    }
    public Vampire () {
        this.name = "Vampire";
        this.attackPower = 20;
        this.health = 100;
    }

    @Override
    public void monsterAttack(Monster monster) {
        monster.health -= this.getAttackPower();
        System.out.println(this.getName() + " is attacking " + monster.getName() + " for " + this.getAttackPower() + "  points of damage!");
        monster.isDead();

        //small chance of recovering health
        /*int healthBoost = Utilities.generateGuessingNumber(1,10);
        if(healthBoost == 10) {
            System.out.println("Health Boost!!!");
            this.health+= 20;
        }*/
    }
}
