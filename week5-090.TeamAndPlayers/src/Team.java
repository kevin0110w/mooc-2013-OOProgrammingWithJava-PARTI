
import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> team;
    private int max;
    
    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new ArrayList<Player>();
        this.max = 16;
    }
    
    public String getName(){
        return this.teamName;
    } 
    
    public void addPlayer(Player player) {
        if (this.max > this.team.size()) {
        this.team.add(player);
        }
    }
    public void printPlayers() {
        for (Player a: this.team) {
            System.out.println(a);
        }   
    }
    
    public void setMaxSize(int maxSize) {
        this.max = maxSize;   
    }
    
    public int size() {
        return this.team.size();
    }
    
    public int goals() {
        int sum = 0;
        for (Player a: this.team) {
        sum = sum + a.goals();
    }
        return sum;
    }    
}
