package model;

import java.util.ArrayList;

public  abstract class  Player {

    private Team team;
    private boolean isHuman;
    private ArrayList<Card> hand;
    private String name;
    private boolean isHakem;
    private int index;

    public Player (){
        hand=new ArrayList<>();
    }




    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHakem() {
        return isHakem;
    }

    public void setHakem(boolean hakem) {
        isHakem = hakem;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public  abstract  SuitName hokme();
    public  abstract  void playCard();






}
