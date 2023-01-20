public class Vampire extends Monster {
    public Vampire(String name, int attackPower, int health) {
        super(name, attackPower, health);
        //small chance of recovering health
    }
    public Vampire () {
        this.name = "Vampire";
        this.attackPower = 20;
        this.health = 100;
    }

    @Override
    public void monsterAttack(Monster monster) {
        monster.health -= this.getAttackPower();
        System.out.println(this.getName() + " attacked the monster " + monster.getName());

        int healthBoost = Utilities.generateGuessingNumber(1,10);

        if( healthBoost==10){
            System.out.println("Health Boost!!!");
            this.health+= 20;
        }

    }
}
