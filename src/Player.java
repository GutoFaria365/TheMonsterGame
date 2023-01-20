public class Player {
    private String playerName;
    private int numberOfMonsters;
    private int monstersAlive;
    public Monster[] monsters;




    public Player(String name, int numberOfMonsters) {
        this.playerName = name;
        this.numberOfMonsters = numberOfMonsters;
        this.monsters = new Monster[numberOfMonsters];
        this.monstersAlive = numberOfMonsters;
    }

    public int getNumberOfMonsters() {
        return numberOfMonsters;
    }

    public int getMonstersAlive() {
        return monstersAlive;
    }

    public void setMonstersAlive(int monstersAlive) {
        this.monstersAlive = monstersAlive;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setNumberOfMonsters(int numberOfMonsters) {
        this.numberOfMonsters = numberOfMonsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = new Monster[numberOfMonsters];
    }
}
