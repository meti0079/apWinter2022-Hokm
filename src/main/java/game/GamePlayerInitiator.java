package game;

import java.util.ArrayList;
import java.util.List;

import model.player.Bot;
import model.player.Human;
import model.player.Player;

public class GamePlayerInitiator {
    public List<Player> initPlayers() {
        List<Player> players = new ArrayList<>();
        
        players.add(new Human(0));
        for (int id = 1; id < 4; ++id) {
            players.add(new Bot(id));
        }
        return players;
    }
}
