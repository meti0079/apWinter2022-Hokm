package gui.controller;

import game.Game;
import game.GameState;
import model.card.Card;

public class GameController {
    private final Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public GameState getState() {
        return game.getState();  
    }

    public boolean play(Card card) {
        return game.onGuiPlayCard(card);
    }
}
