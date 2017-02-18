public class Card {

	public static final int SPADES   = 0;
	public static final int HEARTS   = 1;
	public static final int CLUBS    = 2;
	public static final int DIAMONDS = 3;

	public static final int ACE      = 1;
	public static final int TWO      = 2;
	public static final int THREE    = 3;
	public static final int FOUR     = 4;
	public static final int FIVE     = 5;
	public static final int SIX      = 6;
	public static final int SEVEN    = 7;
	public static final int EIGHT    = 8;
	public static final int NINE     = 9;
	public static final int TEN      = 10;
	public static final int JACK     = 11;
	public static final int QUEEN    = 12;
	public static final int KING     = 13;

	int Face;
    private int theSuit;
              
    public Card(int cardSuit, int cardFace) {
    	 this.theSuit = cardSuit;
    	 if(theSuit >= 1 && cardSuit<=13){
    		 this.theSuit = cardSuit;
    	 } else{
    			 
    		
    		 }
    		 
    	 
         this.Face = cardFace;
        return;
    	        
    	    }
    
    public int getSuit() {
    return theSuit;
}

    public int getFace() {
    return Face;
    }
    public int getValue() {
    int value = Face;
    	    return value;
    	}
    	   
    
    	public String getValueAsString() {
    	         switch ( getValue() ) {
    	         case 1:   return "1";
    	         case 2:   return "2";
    	         case 3:   return "3";
    	         case 4:   return "4";
    	         case 5:   return "5";
    	         case 6:   return "6";
    	         case 7:   return "7";
    	         case 8:   return "8";
    	         case 9:   return "9";
    	         case 10:  return "10";
    	         case 11:  return "10";
    	         case 12:  return "10";
    	         case 13:  return "10";
    	         default: return "??";
    	         }
	}
  
    public String getSuitAsString() {
        switch ( theSuit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
                 default: return "??";
        }
    }
    
    public String getFaceAsString() {
            
        switch ( Face ) {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "??";
        }
    }
    
    public String cardtoString() {
           
        return getFaceAsString() + " of " + getSuitAsString();
    } 	

}