package game.playerturn;

import java.util.Iterator;
import java.util.List;

import model.player.Player;

public class PlayerIterator implements Iterator<Player> {

    private int turn;
    private int startPlayer;
    private final List<Player> players;

    public PlayerIterator(int startPlayer, List<Player> players) {
        turn = 0;
        this.startPlayer = startPlayer;
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        return turn < 4;
    }

    @Override
    public Player next() {
        return players.get((startPlayer + turn++) % 4);
    }
}
