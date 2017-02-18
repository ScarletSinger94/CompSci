
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

public class CashRegister {
	// initialize variables
	double total = 0.0;
	double foodtax = 0.035;
	double nonfoodtax = 0.07;
	double subtotal = 0.00;
	double food,nonfood;
	
	
	public CashRegister(){
		
	}

	public void Food(double price) {
		food += price*(1+foodtax); // calculate the total food price
	}

	public void NonFood(double price) {
		nonfood += price*(1+nonfoodtax); // calculate the total nonfood price
	}
	
	public String SubTotal() {
		total = Math.round((food +nonfood) * 100.0) / 100.0; //// calculate total price with tax
		return String.valueOf(total);
	}
	
	public String Payment(double receive){
		return String.valueOf(receive);
	}
	public String givechange(double payment){
		double change = payment-total;
		change = change*100.0/100.0;
		double ChangeTimes100 = change*100;
		int NumberofDollars = (int)(ChangeTimes100/100);
		double ChangeinQuarters = ChangeTimes100%100;
		int NumberofQuarters = (int)(ChangeinQuarters/25);
		double ChangeinDimes = ChangeinQuarters%25;
		int NumberofDimes = (int)(ChangeinDimes/10);
		double ChangeinNickels = ChangeinDimes%10;
		int NumberofNickels = (int) (ChangeinNickels/5);
		double ChangeinPenny = ChangeinNickels%5;
		int NumberofPennys = (int) (ChangeinPenny/1);
		// get dollars and coins
		System.out.println ("Your change is: $" + Math.round((payment-food -nonfood) * 100.0) / 100.0);
		//Round the change to hundredth decimal
		

			
		return
		NumberofDollars + "Dollars," 
		+ NumberofQuarters + "Quarters," + NumberofDimes + "Dimes," 
				+ NumberofNickels + "Nickels,"+ NumberofPennys + "Pennys." ;
		
	}

	
	
	
	
}