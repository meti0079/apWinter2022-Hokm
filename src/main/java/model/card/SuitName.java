package model.card;

public enum SuitName {

    HEART (0),
    DIAMOND (1),
    SPADE  (2),
    CLUB (3)
    ;

    private final int value;
    SuitName(int val){
        this.value=val;
    }

    public int getSuit(){
         return this.value;
    }
    public static SuitName getSuitName(int value){
         if (value==0){
             return HEART;
         }

//         return  ;
         return null;
    }


}
