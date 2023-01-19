public class Main {
    public static void main(String[] args) {
        System.out.println("Hello People!");
        System.out.println("Boas");

        Player p1 = new Player("Boda", 5);
        Player p2 = new Player("Calimero", 5);

        Game game1 = new Game();
        game1.gameStart(p1,p2);

        for (int i = 0; i < p1.getNumberOfMonsters(); i++) {
            System.out.println(p1.monsters[i].getName());
        }

    }

}