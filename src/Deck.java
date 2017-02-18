import java.util.Random;



public class Deck {
public Deck() {
	this(1,false);
}

    public Card[] myCards;   
    public int cardsUsed; 
    private int numcards;
    public Deck(int numDecks, boolean shuffle) {
    	this.numcards = numDecks * 52;
       this.myCards = new Card[numcards];
       int cardcount = 0; 
       for(int d=0; d < numDecks; d++){
       for ( int suit = 0; suit < 4; suit++ ) {
          for ( int value = 1; value <= 13; value++ ) {
             this.myCards[cardcount] = new Card(suit, value);
             cardcount++;
          }
       }
     
    }
    if (shuffle) {
    	this.shuffle();
    }
    }
    public void shuffle(){
    Random rng = new Random();
    Card temp;
    int r;
    for(int i = 0; i< this.numcards; i++){
    	r = rng.nextInt(this.numcards);
    	temp = this.myCards[i];
    	this.myCards[i] = this.myCards[r];
    	this.myCards[r]= temp;
    }
    }
    
    public Card deal() {
         Card top = this.myCards[0];
         for(int j =1; j< this.numcards; j++){
        	 this.myCards[j-1] = this.myCards[j];
         }
         this.myCards[this.numcards-1] = null;
         this.numcards --;
         return top;
     }
        public void printDeck(int numToPrint){
        	   for(int j =0; j< numToPrint; j++){
        		   System.out.println (this.myCards[j].getValue());
        	   }//changed from string pull
        }
    public int cardsLeft() {
        return 52 - cardsUsed;
    }
    public boolean isEmpty(){
    	if (cardsUsed == this.numcards)
    	return true;
    	else return false;
    }
      
    
    
}
