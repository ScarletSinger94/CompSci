public class BlackJack {

	public static void main(String[] args){
		  double money;      
		  double moneyb;
          int bet;           
          int betb;
          System.out.println("Welcome to Blackjack by Josh R");
          Deck theDeck = new Deck(4,true);
	         System.out.println("Whats your name?");
	         //creates two players and a dealer and starts players with 100 chips//
	         String a = IO.readString();
	  		Player one = new Player(a);
	  		System.out.println("and yours?");
	  		 String b = IO.readString();	
	  		Player two = new Player(b);
	  		Player dealer = new Player("Dealer");
          System.out.println();
          money = 100;  
          moneyb = 100;
          
       
          while (true) {
        	  //this loop prompts the user to enter a bet and if they are inadequate in funds, the terminal breaks//
        	  System.out.println("Welcome " + a + " and " + b);
              System.out.println();
        	  System.out.println(a + " has " + money + " dollars and " + b + " has " + moneyb + " dollars" );
              do {
            	  System.out.println("How many dollars do you want to bet? Remember you can't bet more than you have! ");
            	  System.out.println(" ");
            	  System.out.println(a + "?");
                 bet = IO.readInt();
                 System.out.println(b + "?");
                 betb = IO.readInt();
                 if (bet < 0 || betb<0 || bet > money)
                	 System.out.println("Your answer must be between 0 and " + money + '.');
              } while (bet < 0 || betb < 0 || bet > money || betb > moneyb);
              if (money <= 0) {
             	  System.out.println("Looks like you're are out of money!");
                  break;
              }
                  if (moneyb <= 0) {
                 	  System.out.println("Looks like you're are out of money!");
                      break;
                  
               }
//fill each hand with two cards
        one.emptyHand();
        two.emptyHand();
        dealer.emptyHand();
		one.addCard(theDeck.deal());
		two.addCard(theDeck.deal());
		dealer.addCard(theDeck.deal());
		one.addCard(theDeck.deal());
		two.addCard(theDeck.deal());
		dealer.addCard(theDeck.deal());
		
		//auto win if black jack is recieved
		System.out.println("The cards have been Dealt");
		if(one.getHandSum() == 21){
			System.out.println(a + " YOU GOT BLACKJACK!");
		money= money + 1.5 * bet;
			if(two.getHandSum() == 21)
				System.out.println( b + " YOU GOT BLACKJACK!");
			moneyb =moneyb +betb;
			}
	
	//shows the players hands to them
		one.printHand(true);
		System.out.println(one.getHandSum());
		two.printHand(true);
		System.out.println(two.getHandSum());
		dealer.printHand(false);
		
		
		boolean oneDone = false;
		boolean dealerDone = false;
		boolean twoDone = false;
		String ans1;
		String ans2;
		while (!oneDone || !twoDone){
			if(!oneDone){
		//loops respective of the player, reads input and either adds a card or ends players turn//		
				System.out.println(a +", Hit or Stay? (Enter H or S); ");
				ans1 = IO.readString();
				System.out.println();
				if(ans1.compareToIgnoreCase("H") ==0){
					oneDone = !one.addCard(theDeck.deal());
					one.printHand(true);
					System.out.println(one.getHandSum());
					if(one.getHandSum()<21)	;
					
							
				}else{
					//this allows them to double their bet before staying or after hitting
					System.out.println(a + ", Do you want to double down?");
					String c;
					c = IO.readString();
					oneDone = true;
					System.out.println();
					if(c == "yes");
					bet = bet*2;
					if (c == "no");
					continue;
				}
			}
			if(!twoDone){
				//this allows them to double their bet before staying or after hitting
				System.out.println(b + ", Hit or Stay? (Enter H or S); ");
				ans2 = IO.readString();
				System.out.println();
				if(ans2.compareToIgnoreCase("H") ==0){
					twoDone = !two.addCard(theDeck.deal());
					two.printHand(true);
					System.out.println(two.getHandSum());
					
						
				}else{
					twoDone = true;
					System.out.println();
					System.out.println(b + ", Do you want to double down?");
					String d;
					d = IO.readString();
					if(a == "yes");
						betb = betb*2;
						if (d == "no");
					continue;
				
					
						
				}
			}
		}
		while(!dealerDone){
			if(!dealerDone){
				if(dealer.getHandSum() <17){
					System.out.println("The dealer hits");
					dealerDone = !dealer.addCard(theDeck.deal());
					dealer.printHand(false);
				}else{
					System.out.println("The dealer stays" );
					dealerDone = true;
				}
			}
		}
			System.out.println();
		
		//print all the hands again, this time the dealer included
		one.printHand(true);
		System.out.println(one.getHandSum());
		two.printHand(true);
		System.out.println(two.getHandSum());
		dealer.printHand(true);
		System.out.println(dealer.getHandSum());
		if(dealer.getHandSum() >21)
			System.out.println("Dealer Busts");
		
 //case for pushing a hand//
	if (dealer.getHandSum() == one.getHandSum() ){
		System.out.println("Dealer Push's " + a);
		
		
	}else
		//below are all cases, give their logical conditions, and the subtraction or addition as necessary//
		if( one.getHandSum() <= 21 && dealer.getHandSum() < one.getHandSum() ){
			System.out.println(" You win :) " + a);
			money = money + bet;
		}else
			if(one.getHandSum() >21){
				money = money-bet;
				System.out.println(a + " Busts");
				}else
					if ( dealer.getHandSum() <=21 && dealer.getHandSum() > one.getHandSum()){
						money = money - bet;
						System.out.println("Dealer Wins " + a);
					}
					
	if(two.getHandSum() >21 && dealer.getHandSum() >21){
		System.out.println("You lose, " + b );
	moneyb = moneyb - betb;
	}else
	if ( two.getHandSum() <= 21 && two.getHandSum() > dealer.getHandSum() ){
		System.out.println("You beat the house, " + b );
		moneyb = moneyb + betb;
          }else
      		if (two.getHandSum() == dealer.getHandSum()){
      			System.out.println("You and the Dealer Push, " +b);
      			
      		}else
      			if(two.getHandSum() >21){
      				System.out.println("You busted " +b);
      				moneyb = moneyb - betb;
		}else
				if (dealer.getHandSum() <= 21 && dealer.getHandSum() > two.getHandSum()){
					System.out.println("Dealer Wins this round " + b);
					moneyb = moneyb - betb;
				}else
			if(dealer.getHandSum() >21 && two.getHandSum() <= 21){
			System.out.println("You beat the dealer " + b);
			moneyb = moneyb + betb;
	}
      
			}
          }
}

          
		
	
	

	


         
	

	








