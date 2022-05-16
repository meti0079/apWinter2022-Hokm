package model;

import java.util.ArrayList;

import model.card.Card;
import model.card.CardValueName;
import model.card.SuitName;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){

        deck= new ArrayList<>();

        for (SuitName suitName:SuitName.values()) {
            for (CardValueName valueName :CardValueName.values()) {
                deck.add(new Card(suitName,valueName));
            }
        }
    }

    public ArrayList getDeck(){
        return deck;
    }







}
