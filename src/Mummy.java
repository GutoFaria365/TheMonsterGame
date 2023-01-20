public class Mummy extends Monster {

    public Mummy(String name, int attackPower, int health) {
        super(name, attackPower, health);
        this.specialPower = 2; //if it attacks a third time in a row it will lose some health
    }
    public Mummy() {
        this.name = "Mummy";
        this.attackPower = 30;
        this.health = 80;
        this.specialPower = 2;

    }

    @Override
    public void monsterAttack(Monster monster) {
        monster.health -= this.getAttackPower();
        System.out.println(this.getName() + " attacked the monster " + monster.getName() + " for " + this.getAttackPower() + " damage");
        if(monster.health <=0){
            System.out.println("Monster" + monster.getName() + " has been killed");
            monster = null;
        }
        System.out.println(monster.getName() + " health is: " + monster.health);


    }
}
