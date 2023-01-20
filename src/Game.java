public class Game {
    private Player playerOne;
    private Player playerTwo;

    public Game() {
        this.playerOne = new Player("Tiago", 5);
        this.playerTwo = new Player("Beatriz", 5);
    }

    public void gameStart () {
        if (this.playerOne.getNumberOfMonsters() == this.playerTwo.getNumberOfMonsters()) {
            System.out.println("Welcome " + this.playerOne.getPlayerName() + " and " + this.playerTwo.getPlayerName() + "!");
            System.out.println("The game will start with " + this.playerOne.getNumberOfMonsters() + " monsters!!!");
            randomMonster(this.playerOne);
            randomMonster(this.playerTwo);
            whoGoesFirst(this.playerOne, this.playerTwo);
            actualGame();
        } else {
            System.out.println("The number of monsters selected doesn't match, select the same value for both players!!");
            return;
        }
    }
    public void randomMonster(Player player) {
        for (int i = 0; i < player.getNumberOfMonsters(); i++) {
            switch (Utilities.generateGuessingNumber()) {
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

    public Player firstPlayer;
    public Player secondPlayer;
    public void whoGoesFirst (Player p1, Player p2) {
        switch(Utilities.generateGuessingNumber(1, 2)) {
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
        while (firstPlayer.monsters != null && secondPlayer.monsters != null) {
            System.out.println(firstPlayer.getPlayerName() + "'s turn!");
            firstPlayer.monsters[Utilities.generateGuessingNumber(0, firstPlayer.getNumberOfMonsters()) - 1].monsterAttack(secondPlayer.monsters[Utilities.generateGuessingNumber(0, secondPlayer.getNumberOfMonsters()) - 1]);
            System.out.println(secondPlayer.getPlayerName() + "'s turn!");
            secondPlayer.monsters[Utilities.generateGuessingNumber(0, secondPlayer.getNumberOfMonsters()) - 1].monsterAttack(firstPlayer.monsters[Utilities.generateGuessingNumber(0, firstPlayer.getNumberOfMonsters()) - 1]);

        }
    }
}
