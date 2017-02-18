
public class Player {

	public String name;
	private Card[] hand = new Card[10];
	private int numCards;
	double money= 100;
	
	public Player(String name){
		this.name = name;
		this.emptyHand();
	}
	public void emptyHand(){		
			for(int c =0; c < 10; c++){
				this.hand[c] = null;
			}
			this.numCards =0;
		}
	public boolean addCard(Card aCard){
		if (this.numCards ==10){
			System.out.println("Your hand already has ten cards and you cant have another.");
		System.exit(1);
		}
		this.hand[this.numCards] = aCard;
		this.numCards++;
		return(this.getHandSum() <= 21);
	}
	public int getHandSum(){
		int handSum = 0;
		int cardNum =0;
		int numAces = 0;
		for(int j =0; j< this.numCards; j++){
			
			cardNum = this.hand[j].getValue();
			if(cardNum ==1){
				numAces++;
				handSum += 11;
			}else if (cardNum > 10){
				handSum += 10;
			}else {
				handSum += cardNum;
			}
			
			}
		while(handSum > 21 && numAces >0){
			handSum -= 10;
			numAces --;
		}
				
				return handSum;
	}
	public void printHand(boolean showFirstCard){
		
		System.out.println(this.name);
		for(int j = 0; j< this.numCards; j++){
			if(j == 0 && !showFirstCard){
				System.out.println("  [hidden]");
			}else{
				System.out.println(this.hand[j].cardtoString());
			}
		}
	}
}


