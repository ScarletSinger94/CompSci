import java.util.ArrayList;

public class bj{

	public static void main(String[] args){
		  double money;      
          int bet;           
          int betb;
          System.out.println("Welcome to Blackjack by Josh R");
          Deck theDeck = new Deck(4,true);
          System.out.println ("How Many Players?");
         
          ArrayList<Player> players = new ArrayList<Player>();
          int numOfPlayers;

          System.out.println("How many players are in this game?");
          numOfPlayers = IO.readInt();


          for(int i = 0; i < numOfPlayers; i++)
          {
              System.out.print("What is Player " + (i + 1) + " name?");
              String name = IO.readString();
              Player plr = new Player(name);
              players.add(plr);
               
          }
          System.out.println();
         
        
          
       
          while (true) {
        	  for(int i=0; i < players.size(); i++){
        		  plr.emptyhand();
        		  
        	  
        	  System.out.println("Welcome ");
              System.out.println();
        	  System.out.println(  " has "  + " dollars " );
              do {
            	  System.out.println("How many dollars do you want to bet? Remember you can't bet more than you have! ");
            	  System.out.println(" ");
            	  System.out.println( + "?");
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


        one.emptyHand();
        two.emptyHand();
        dealer.emptyHand();
		one.addCard(theDeck.deal());
		two.addCard(theDeck.deal());
		dealer.addCard(theDeck.deal());
		one.addCard(theDeck.deal());
		two.addCard(theDeck.deal());
		dealer.addCard(theDeck.deal());
		
		
		System.out.println("The cards have been Dealt");
		if(one.getHandSum() == 21 && dealer.getHandSum()!= one.getHandSum()){
			System.out.println(a + " YOU GOT BLACKJACK!");
			money= money + 1.5 * bet;
		}
		if(two.getHandSum() == 21 && dealer.getHandSum()!= two.getHandSum()){
			System.out.println( b + " YOU GOT BLACKJACK!");
			moneyb =moneyb + 1.5*betb;
		}	
	
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
		while (!oneDone || !dealerDone || !twoDone){
			if(!oneDone){
				
				System.out.println(a +", Hit or Stay? (Enter H or S); ");
				ans1 = IO.readString();
				System.out.println();
				if(ans1.compareToIgnoreCase("H") ==0){
					oneDone = !one.addCard(theDeck.deal());
					one.printHand(true);
					System.out.println(one.getHandSum());
				}else{
					oneDone = true;
					System.out.println();
				}
			}
			if(!twoDone){
				
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
				}
			}
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
			System.out.println();
		}
		one.printHand(true);
		System.out.println(one.getHandSum());
		two.printHand(true);
		System.out.println(two.getHandSum());
		dealer.printHand(true);
		System.out.println(dealer.getHandSum());
		if(dealer.getHandSum() >21)
			System.out.println("Dealer Busts");
		
 
	if (dealer.getHandSum() == one.getHandSum() ){
		System.out.println("Dealer Push's " + a);
		money -= bet;
		
	}else
		if( one.getHandSum() <= 21 && dealer.getHandSum() < one.getHandSum() ){
			System.out.println(" You win :) " + a);
			money += bet;
		}else
			if(one.getHandSum() >21){
				money -= bet;
				System.out.println(a + " Busts");
				}else
					if ( dealer.getHandSum() <=21 && dealer.getHandSum() > one.getHandSum()){
						money = money - bet;
						System.out.println("Dealer Wins " + a);
					}
					
	if(two.getHandSum() >21 && dealer.getHandSum() >21){
		System.out.println("You lose, " + b );
		moneyb -= betb;
	}else
	if ( two.getHandSum() <= 21 && two.getHandSum() > dealer.getHandSum() ){
		System.out.println("You beat the house, " + b );
		moneyb += betb;
          }else
      		if (two.getHandSum() == dealer.getHandSum()){
      			System.out.println("You and the Dealer Push, " +b);
      			moneyb -= betb;
      		}else
      			if(two.getHandSum() >21){
      				System.out.println("You busted " +b);
      				moneyb -= betb;
		}else
				if (dealer.getHandSum() <= 21 && dealer.getHandSum() > two.getHandSum()){
					System.out.println("Dealer Wins this round " + b);
					moneyb -= betb;
				}else
			if(dealer.getHandSum() <= 21 && dealer.getHandSum() > two.getHandSum()){
			System.out.println("You beat the dealer " + b);
			moneyb += betb;
	
      
			}
          }
	}
	}


/*     int money;          // Amount of money 
int bet;            // Amount user bets per round
boolean userWins;   // Did user win the game?

System.out.println("Welcome to the game of blackjack.");
System.out.println();

money = 100;  // User starts with $100.

while (true) {
	  System.out.println("You have " + money + " dollars.");
    do {
  	  System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
  	  System.out.println("? ");
       bet = IO.readInt();
       if (bet < 0 || bet > money)
      	 System.out.println("Your answer must be between 0 and " + money + '.');
    } while (bet < 0 || bet > money);
    if (bet == 0)
       break;
    userWins = playBlackjack();
    if (userWins)
       money = money + bet;
    else
       money = money - bet;
    System.out.println();
    if (money == 0) {
  	  System.out.println("Looks like you've are out of money!");
       break;
    }
}

System.out.println();
System.out.println("You leave with $" + money + '.');

} 
*/

          
		
	
	

	


         
	

	









