package game.playerturn;

import java.util.Iterator;
import java.util.List;

import model.player.Player;

public class PlayerIterable implements Iterable<Player> {

    private final int startPlayer;
    private final List<Player> players;

    public PlayerIterable(int startPlayer, List<Player> players) {
        this.startPlayer = startPlayer;
        this.players = players;
    }

    @Override
    public Iterator<Player> iterator() {
        return new PlayerIterator(startPlayer, players);
    }
}
