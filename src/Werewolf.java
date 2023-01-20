public class Werewolf extends Monster {
    public Werewolf(String name, int attackPower, int health) {
        super(name, attackPower, health);
        //no special
    }
    public Werewolf() {
        this.name = "Werewolf";
        this.attackPower = 20;
        this.health = 120;
    }

    @Override
    public void monsterAttack(Monster monster) {
        monster.health -= this.getAttackPower();
        System.out.println(this.getName() + " is attacking " + monster.getName() + " for " + this.getAttackPower() + "  points of damage!");
        monster.isDead();
    }
}
