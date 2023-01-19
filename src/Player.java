public class Player {
    private String playerName;
    private int numberOfMonsters;
    private Monster[] monsters = new Monster[numberOfMonsters];



    public Player(String name, int numberOfMonsters) {
        this.playerName = name;
        this.numberOfMonsters = numberOfMonsters;
        this.monsters = new Monster[numberOfMonsters];
    }

    public int getNumberOfMonsters() {
        return numberOfMonsters;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setNumberOfMonsters(int numberOfMonsters) {
        this.numberOfMonsters = numberOfMonsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = new Monster[numberOfMonsters];
    }
}
