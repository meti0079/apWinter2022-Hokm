package model;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){

        deck= new ArrayList<>();

        for (SuitName suitName:SuitName.values()) {
            for (ValueName valueName :ValueName.values()) {
                deck.add(new Card(suitName,valueName));
            }
        }
    }

    public ArrayList getDeck(){
        return deck;
    }







}
