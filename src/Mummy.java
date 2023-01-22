public class Mummy extends Monster {



    public Mummy(String name, int attackPower, int health) {
        super(name, attackPower, health);

    }
    public Mummy() {
        this.name = "Mummy";
        this.attackPower = 30;
        this.health = 80;
        this.isDead = false;

    }
    @Override
    public void monsterAttack(Monster monster) {
        int consecutiveAttack = 0;
        int countAttacks = 0;
        Game round = new Game();

        if (consecutiveAttack == 0) {
            consecutiveAttack = round.getRoundCount();
            countAttacks++;
        } else if (round.getRoundCount() - consecutiveAttack == 2) {
            countAttacks++;
        } else {
            consecutiveAttack = 0;
            countAttacks = 0;
        }

        if (countAttacks < 3) {
            monster.health -= this.getAttackPower();
            System.out.println(this.getName() + " is attacking " + monster.getName() + " for " + this.getAttackPower() + "  points of damage!");
            monster.isDead();
        } else {
            System.out.println("GET REKT");
            //if it attacks a third time in a row it will lose some health
        }
    }
}
