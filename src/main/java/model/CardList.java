package model;

import java.util.ArrayList;

public class CardList {

    private ArrayList<Card> club;
    private ArrayList<Card> spade;
    private ArrayList<Card> diamond;
    private ArrayList<Card> heart;


    public  CardList(){
        club=new ArrayList<>();
        spade=new ArrayList<>();
        diamond=new ArrayList<>();
        heart=new ArrayList<>();

        for (ValueName valueName:ValueName.values()) {
            club.add(new Card(SuitName.Club,valueName));
            diamond.add(new Card(SuitName.Diamond,valueName));
            heart.add(new Card(SuitName.Heart,valueName));
            spade.add(new Card(SuitName.Spade,valueName));
        }
    }


}
