package model;

public class Card {
private int suit;
private int value;
private SuitName suitName;
private  ValueName valueName;
private boolean isFace;


public Card(SuitName suitName, ValueName valueName){
    this.suitName=suitName;

    this.valueName=valueName;
    this.suit=suitName.getSuit();
    this.value=valueName.getValue();
    if (value>10 && value<14)
        isFace=true;
}

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SuitName getSuitName() {
        return suitName;
    }

    public void setSuitName(SuitName suitName) {
        this.suitName = suitName;
    }

    public ValueName getValueName() {
        return valueName;
    }

    public void setValueName(ValueName valueName) {
        this.valueName = valueName;
    }

    public boolean isFace(){
    return isFace;
    }

    public int compareTo(Card other){
    if (this.suit== other.getSuit() && this.value == other.getValue())
        return 0;
    else if(this.suit != other.getSuit())
        return other.getSuit() - this.suit;
    else
        return other.getValue()-this.value;
    }


    public boolean equal(Object other){
        if (!(other instanceof Card)) return false;

        Card c=(Card ) other;
        if (this.suit== c.getSuit() && this.value == c.getValue())
            return true;

        return false;

    }


}
