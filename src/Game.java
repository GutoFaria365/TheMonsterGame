public class Game {
    public void gameStart (Player p1, Player p2) {
        if (p1.getNumberOfMonsters() == p2.getNumberOfMonsters()) {
            System.out.println("Welcome " + p1.getPlayerName() + " and " + p2.getPlayerName() + "!");
            System.out.println("The game will start with " + p1.getNumberOfMonsters() + " monsters!!!");
            randomMonster(p1);
            randomMonster(p2);
            whoGoesFirst(p1, p2);


        } else {
            System.out.println("The number of monsters selected doesn't match, select the same value for both players!!");
            return;
        }
    }
    public void randomMonster(Player player) {
        for (int i = 0; i < player.getNumberOfMonsters(); i++) {
            switch (generateGuessingNumber()) {
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
    public static int generateGuessingNumber(){
        return (int) (Math.random() * (3) + 1);
    }
    public static int generateGuessingNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public Player firstPlayer;
    public Player secondPlayer;
    public void whoGoesFirst (Player p1, Player p2) {
        switch(generateGuessingNumber(1, 2)) {
            case 1:
                firstPlayer = p1;
                secondPlayer = p2;
                break;
            case 2:
                firstPlayer = p2;
                secondPlayer = p1;
                break;
        }
    }
    public void actualGame() {
        while (firstPlayer.monsters != null) {
            firstPlayer.monsters[generateGuessingNumber(0, firstPlayer.getNumberOfMonsters()) - 1].monsterAttack();
        }
    }
}
