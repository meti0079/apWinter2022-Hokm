package model.player;

import game.GameState;
import model.card.Card;
import model.card.SuitName;

public class Human extends Player {
    
    private Card cardToPlay;

    public Human(int id) {
        super(id);
        cardToPlay = null;
    }

    @Override
    public SuitName hokme(GameState state) {
        return null;
    }

    @Override
    public Card playCard(GameState state) {
        System.out.println("you are supposed to play right now");

        while (cardToPlay == null) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // look up polling
        Card card = cardToPlay;
        cardToPlay = null;
        return card;
    }

    public void onGuiPlayerCard(Card card) {
        this.cardToPlay = card;
        System.out.println("you just played a card");
    }
}
