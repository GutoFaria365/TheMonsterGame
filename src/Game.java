public class Game {
    public void GameStart (Player p1, Player p2) {
        if (p1.getNumberOfMonsters() == p2.getNumberOfMonsters()) {
            System.out.println("Welcome " + p1.getPlayerName() + " and " + p2.getPlayerName());
            System.out.println("The game will start with " + p1.getNumberOfMonsters() + " monsters!!!");

        } else {
            System.out.println("The number of monsters selected doesn't match, select the same value for bot players!!");

        }
    }
}
