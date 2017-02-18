
public class j{
	public static void main(String[] args){ 
		
		Deck Josh = new Deck();
		
		  Card a = new Card(3, 12);
		    System.out.println(a.cardtoString());

		  System.out.println(a.getSuit());
		    System.out.println(a.getValue());

		    System.out.println(a.getValueAsString());
		    System.out.println(a.getSuitAsString());
		    Josh.shuffle();
		    Josh.dealCard();
		    Josh.cardsLeft();
		    System.out.println(Josh.cardsLeft());
		    System.out.println(Josh.isEmpty());
		 System.out.print(Josh.toString());
		    
	}
	}





