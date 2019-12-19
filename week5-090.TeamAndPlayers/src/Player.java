public class Player {
    private String name;
    private int goals;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int goals(){
        return this.goals;
    }

    @Override
    public String toString() {
        return "Player : " + name + ", goals " + goals;
    }
}
