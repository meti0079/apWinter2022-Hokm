package model;

public enum SuitName {

    Heart  (0),
    Diamond (1),
    Spade  (2),
    Club (3)
    ;

    private final int value;
     SuitName(int val){
        this.value=val;
    }

    public int getSuit(){
         return this.value;
    }



}
