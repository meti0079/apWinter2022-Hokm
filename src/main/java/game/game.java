package game;

import model.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class game {

    Deck deck;
    int turn;
    public game(){
        turn=0;
        Player player= new Human() ;
        Player player1= new Bot();
        Team team= new Team(player,player1);
        shuffle();
        Random random= new Random();
        int hakem=random.nextInt(4);
        player.setHakem(true);

    }

    public void shuffle(){
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(deck.getDeck());
        }
    }


    private void run(){
        while (true){
            if (turn==0){
                if (hakem == human ){
                   SuitName suitName= Mapper.getHokmeFromePlayer();
                }

                if (teampont==7){

                    shuffle();

                }

            }

        }
    }



}
