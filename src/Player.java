public class Player {
    private String name;
    private int numberOfMonsters;
    private Monster[] monsters = new Monster[numberOfMonsters];



    public Player(String name, int numberOfMonsters) {
        this.name = name;
        this.numberOfMonsters = numberOfMonsters;
        this.monsters = new Monster[numberOfMonsters];
    }


}
