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
        }
    }
    public void randomMonster(Player player) {
        for (int i = 0; i < player.getNumberOfMonsters(); i++) {
            switch (Utilities.generateGuessingNumber()) {
                case 1 -> player.monsters[i] = new Werewolf();
                case 2 -> player.monsters[i] = new Vampire();
                case 3 -> player.monsters[i] = new Mummy();
            }
        }
    }
    public Player firstPlayer;
    public Player secondPlayer;
    public void whoGoesFirst (Player p1, Player p2) {
        switch (Utilities.generateGuessingNumber(1, 2)) {
            case 1 -> {
                firstPlayer = p1;
                secondPlayer = p2;
            }
            case 2 -> {
                firstPlayer = p2;
                secondPlayer = p1;
            }
        }
    }
    public void actualGame() {
        while (firstPlayer.getMonstersAlive() != 0 && secondPlayer.getMonstersAlive() != 0) {
            System.out.println("-------------------NEW ROUND-----------------");
            System.out.println(firstPlayer.getPlayerName() + "'s turn!");

            int attackingMonster = Utilities.generateGuessingNumber(0, firstPlayer.getMonstersAlive() - 1);
            int defendingMonster = Utilities.generateGuessingNumber(0, secondPlayer.getMonstersAlive() - 1);


            firstPlayer.monsters[attackingMonster].monsterAttack(secondPlayer.monsters[defendingMonster]);
            if(secondPlayer.monsters[defendingMonster].isDead()){
                secondPlayer.setMonstersAlive(secondPlayer.getMonstersAlive()-1);

            };


            System.out.println(secondPlayer.getPlayerName() + "'s turn!");

            secondPlayer.monsters[Utilities.generateGuessingNumber(0, secondPlayer.getMonstersAlive() - 1)].monsterAttack(firstPlayer.monsters[Utilities.generateGuessingNumber(0, firstPlayer.getMonstersAlive() - 1)]);


            for (int i = 0; i < secondPlayer.getNumberOfMonsters(); i++) {
                if (secondPlayer.monsters[i].isDead()) {
                    secondPlayer.setMonstersAlive(secondPlayer.getMonstersAlive() - 1);
                }
            }


        }
    }
}
