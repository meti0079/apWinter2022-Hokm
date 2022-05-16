package game;

import model.*;
import model.card.Card;
import model.player.Bot;
import model.player.Human;
import model.player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import game.playerturn.PlayerIterable;
import gui.controller.GameController;

public class Game {
    private GameController controller;

    private final List<Player> players;
    private final Human humanPlayer;

    private Deck deck;
    private int turn;
    private GameState gameState;
    
    public Game(){
        players = new GamePlayerInitiator().initPlayers();
        controller = new GameController(this);
        humanPlayer = (Human) players.get(0);

        // turn=0;
        // Player player = new Human() ;
        // Player player1 = new Bot();
        // Team team = new Team(player,player1);
        // shuffle();
        // Random random= new Random();
        // int hakem = random.nextInt(4);
        // player.setHakem(true);
    }

    private PlayerIterable getPlayersToPlay(int startPlayer) {
        return new PlayerIterable(startPlayer, players);
    }

    public void shuffle(){
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(deck.getDeck());
        }
    }

    public void run() {
        int round = 0;
        int startPlayer = 0;

        while (round < 5) {
            for (Player p: getPlayersToPlay(startPlayer)) {
                Card cardToPlay = p.playCard(gameState);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            startPlayer++;
            System.out.println();

            round++;
        }

        // if (hakem == human){
        //    SuitName suitName= Mapper.getHokmeFromePlayer();
        // }
    
        // if (teampoint==7){
    
        //     shuffle();
    
        // }
    }

    public boolean isPlayable(Card card, Player player) {
        // check: if player has turn
        // check: card in hand player
        if (gameState.getPlayed().stream().anyMatch(c -> c.equal(card)))
            return false;
        
        return true;
    }

    public boolean onGuiPlayCard(Card card) {
        humanPlayer.onGuiPlayerCard(card);
        return isPlayable(card, humanPlayer);
    }

    public GameState getState() {
        return gameState;
    }
    
    public GameController getController() {
        return controller;
    }
}
