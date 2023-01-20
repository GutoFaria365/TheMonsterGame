public class Mummy extends Monster {

    public Mummy(String name, int attackPower, int health) {
        super(name, attackPower, health);
        //if it attacks a third time in a row it will lose some health
    }
    public Mummy() {
        this.name = "Mummy";
        this.attackPower = 30;
        this.health = 80;

    }

    @Override
    public void monsterAttack(Monster monster) {
        monster.health -= this.getAttackPower();
        System.out.println(this.getName() + " is attacking " + monster.getName() + " for " + this.getAttackPower() + "  points of damage!");
        monster.isDead();

        //if it attacks a third time in a row it will lose some health
    }
}
