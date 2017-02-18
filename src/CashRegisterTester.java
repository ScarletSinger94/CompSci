
/*
* <h1>A Standard Cash Register<h1>
* The cash register program implements an application that
* stimulate a cash register that can calculate different tax
* for food and non-food items and give change back to users.
* <p>
* @Author: Yaxuan Zhu
* @Version: 1.0
*/
import java.util.Scanner;

public class CashRegisterTester {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		CashRegister register = new CashRegister();
		      
		       String enter2;
			do{
		    	   System.out.println("Is this a food item? y/n");
		      
		    	   String enter1= input.next();
		      
		    	   if(enter1.equals("y")){
		    		 
					System.out.println("The price of the food item is? ");
					double price= input.nextDouble();
		    		 register.Food(price);//add food item to register and calculate tax
		    		 
		    	   }else if( enter1.equals("n")){
		    		   System.out.println("The price of the non-food item is?: ");
		    		   double price= input.nextDouble();
		    		   register.NonFood(price);
		    		   
		    	   }else return;
		    	   
		    	   System.out.println("Do you have more items to buy? y/n");
		    	   enter2 = input.next();
		    	   }while(enter2.equals("y")); // loop process first then test the condition
		      
		      System.out.println("SubTotal: " + register.SubTotal());
		      
		      System.out.println("Your payment amount: ");
		      double cash = input.nextDouble();
		      System.out.println("Payment received: " + register.Payment(cash));
		      
		    
		      System.out.println("Your Change is: " + register.givechange(cash));

	}

	
}
