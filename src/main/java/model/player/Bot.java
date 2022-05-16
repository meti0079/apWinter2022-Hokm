package model.player;

import game.Game;
import game.GameState;
import model.card.Card;
import model.card.SuitName;

import java.util.ArrayList;

public class Bot extends Player{

    GameState gameState = GameState.getInstance();

    public Bot(int id) {
        super(id);
    }
    
    @Override
    public SuitName hokme(GameState state) {
        ArrayList<Card> hand=getHand();
        int []h=new int[4];

        for (int i = 0; i < 5; i++) {
            h[hand.get(i).getSuit()]++;
        }
        int max=0;
        for (int i = 0; i < 4; i++) {
            if (max<h[i]) max=i;
            if (max==h[i]){
               max=findHokm(max,i,hand);
            }
        }


        return  SuitName.getSuitName(max);
    }

    private int findHokm(int max,int i,ArrayList<Card> hand){
        int s1=0;
        int s2=0;
        for (Card card:hand) {
            if (card.getSuit()==max){
                s1+=card.getValue();
            }else if (card.getSuit()==i){
                s2+=card.getValue();
            }
        }
        if (s1<s2){
            max=i;
        }
        return max;
    }

    @Override
    public Card playCard(GameState state) {
        System.out.println("bot is supposed to play a card");
        return getHand().remove(0);
    }
}
