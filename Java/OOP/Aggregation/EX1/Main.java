import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

class Team {
    private  List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void removePlayer(Player player){
        players.remove(player);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        Player player1 = new Player("John Doe", 25);
        Player player2 = new Player("Jane Smith", 30);
        team.addPlayer(player1);
        team.addPlayer(player2);

        for (Player player : team.getPlayers()) {
            System.out.println("Team has player: " + player.getName());
        }

        // Players exist independently of the team
        team.removePlayer(player1);
        System.out.println("After removing player1, team size: " + team.getPlayers().size());

        // Player still exists independently
        System.out.println("Independent Player: " + player1.getName());
    }
}