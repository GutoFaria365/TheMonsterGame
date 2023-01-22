public class Mummy extends Monster {
   public static int countAttacks = 0;
   public static int consecutiveAttack = 0;
   public static int consecutiveAttack2 = 0;
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
        if (this.consecutiveAttack == 0) {
            this.consecutiveAttack = Game.roundCount;
            this.countAttacks += 1;
            System.out.println(this.countAttacks + "round1a" + this.consecutiveAttack + Game.roundCount);
        } else if (Game.roundCount - consecutiveAttack == 1) {
            this.consecutiveAttack = Game.roundCount;
            this.countAttacks += 1;
            System.out.println(this.countAttacks + "round2a" + this.consecutiveAttack + Game.roundCount);
        } else if (Game.roundCount - consecutiveAttack > 1) {
            this.consecutiveAttack = 0;
            this.countAttacks = 0;
            System.out.println(this.countAttacks + "round3a" + this.consecutiveAttack + Game.roundCount);
        } else {
            System.out.println(this.countAttacks + "round4a" + this.consecutiveAttack2 + Game.roundCount);
            if (this.consecutiveAttack2 == 0) {
                this.consecutiveAttack2 = Game.roundCount;
                this.countAttacks += 1;
                System.out.println(this.countAttacks + "round1a" + this.consecutiveAttack2 + Game.roundCount);
            } else if (Game.roundCount - consecutiveAttack2 == 1) {
                this.consecutiveAttack2 = Game.roundCount;
                this.countAttacks += 1;
                System.out.println(this.countAttacks + "round2a" + this.consecutiveAttack2 + Game.roundCount);
            } else if (Game.roundCount - consecutiveAttack2 > 1) {
                this.consecutiveAttack2 = 0;
                this.countAttacks = 0;
                System.out.println(this.countAttacks + "round3a" + this.consecutiveAttack2 + Game.roundCount);
            } else;

        }
        if (this.countAttacks < 4) {
            monster.health -= this.getAttackPower();
            System.out.println(this.getName() + this.hashCode() + " is attacking " + monster.getName() + " for " + this.getAttackPower() + "  points of damage!");
            monster.isDead();
        } else {
            System.out.println(this.getName() + this.hashCode()  + " attacked itself in it's own confusion");
            System.out.println(this.getName() + this.hashCode()  + " has " + this.health + " health remaining.");
            this.health -= this.getAttackPower();
            this.countAttacks = 0;
            //if it attacks a third time in a row it will lose some health
        }
    }
}
