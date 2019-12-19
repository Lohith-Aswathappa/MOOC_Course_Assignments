import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize = 16;
    //private int teamSize;
    //private int totalGoals;
    private ArrayList<Player> playerList;

    public Team(String name){
        this.name =  name;
        //this.teamSize = 0;
        this.playerList = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player playerName){
        if(playerList.size() < this.maxSize){
            playerList.add(playerName);

        }
    }

    public void printPlayers(){
        for (Player members: playerList) {
            System.out.println(members);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.playerList.size();
    }

    public int goals(){
        int totalGoals = 0;
        for ( Player goalscored : playerList) {
            totalGoals += goalscored.getGoals();
        }

        return totalGoals;
    }
}
