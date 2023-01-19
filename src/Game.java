public class Game {
    public void gameStart (Player p1, Player p2) {
        if (p1.getNumberOfMonsters() == p2.getNumberOfMonsters()) {
            System.out.println("Welcome " + p1.getPlayerName() + " and " + p2.getPlayerName());
            System.out.println("The game will start with " + p1.getNumberOfMonsters() + " monsters!!!");
            randomMonster(p1);
            randomMonster(p2);

        } else {
            System.out.println("The number of monsters selected doesn't match, select the same value for both players!!");
            return;

        }
    }
    public void randomMonster(Player player) {
        for (int i = 0; i < player.getNumberOfMonsters(); i++) {
            switch (Monster.generateGuessingNumber()) {
                case 1:
                    player.monsters[i] = new Werewolf();
                    break;
                case 2:
                    player.monsters[i] = new Vampire();
                    break;
                case 3:
                    player.monsters[i] = new Mummy();
                    break;
            }
        }
    }
}
