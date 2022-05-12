package model;

import java.util.ArrayList;

public class CardList {

    private ArrayList<Card> club;
    private ArrayList<Card> spade;
    private ArrayList<Card> diamond;
    private ArrayList<Card> heart;


    public CardList() {
        club = new ArrayList<>();
        spade = new ArrayList<>();
        diamond = new ArrayList<>();
        heart = new ArrayList<>();

        for (ValueName valueName : ValueName.values()) {
            club.add(new Card(SuitName.Club, valueName));
            diamond.add(new Card(SuitName.Diamond, valueName));
            heart.add(new Card(SuitName.Heart, valueName));
            spade.add(new Card(SuitName.Spade, valueName));
        }
    }

    public Card getCard(String name, int value) {
      if (name.equalsIgnoreCase("club")){
          return club.get(value-2);
      }else if (name.equalsIgnoreCase("spade")){
          return spade.get(value-2);
      }else if (name.equalsIgnoreCase("diamond")){
          return diamond.get(value-2);
      }else if (name.equalsIgnoreCase("heart")){
          return heart.get(value-2);
      }
    return null;
    }

    public Card removeCard(Card card){
        String name=card.getSuitName()+"";
        int value=card.getValue();
        if (name.equalsIgnoreCase("club")){
            return club.remove(value-2);
        }else if (name.equalsIgnoreCase("spade")){
            return spade.remove(value-2);
        }else if (name.equalsIgnoreCase("diamond")){
            return diamond.remove(value-2);
        }else if (name.equalsIgnoreCase("heart")){
            return heart.remove(value-2);
        }
     return null;
    }




}
