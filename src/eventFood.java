import java.util.Scanner;

public class eventFood {
	
	public static int counter = 1;
	public static int bkFoodCostSum = 0;
	public static int bkBeverageCostSum = 0;
	public static int lFoodCostSum = 0;
	public static int lBeverageCostSum = 0;
	public static int dinnerFoodCostSum = 0;
	public static int dinnerBeverageCostSum = 0;
	public static int dinnerDessertCostSum = 0;
	public static int numPeople = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Food Planner. Your one stop shop that provides you with all meal information for your special event.");
		
		System.out.println("\nWhat type of event are you hosting?");
		String eventType = in.nextLine();
		
		System.out.println("How many people do you expect to attend your "+eventType+"?");
		numPeople = inputValidation();

		System.out.println("How many days will your "+eventType+" span?");
		int numDays = inputValidation();
		
		while(counter<=numDays){	
			breakfastFood();			
			breakfastBeverage();
			lunchFood();
			lunchBeverage();
			dinnerFood();
			dinnerBeverage();
			dinnerDessert();
					
			counter++;			
		}
		
		eventCostCalculations();	
	}
	
	public static void breakfastFood() {
		Scanner in = new Scanner(System.in);
		
		String[] bkFood = {"eggs","pancakes","waffles","cereal","oatmeal","fruit"};
		int[] bkFoodCost = {6,5,5,4,3,4};
		String correct = "no";
		
		do{
		System.out.println("\nWhat food would you like to serve for Breakfast on Day " +counter+" ?");
		System.out.println("The food options for breakfast are: eggs, pancakes, waffles, cereal, oatmeal and fruit.");
		String bkFoodUserInput = in.next();
		
			for(int i =0; i<bkFood.length; i++){
				if(bkFoodUserInput.equalsIgnoreCase(bkFood[i])){
					System.out.print("\nThat's a good choice. I think that's an excellent meal for the start of the day. \n");
					correct = "yes";
					bkFoodCostSum += bkFoodCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void breakfastBeverage(){
		Scanner in = new Scanner(System.in);
		
		String[] bkBeverage = {"coffee","tea","oj","milk","water"};
		int[] bkBeverageCost = {2,2,3,2,1};
		String correct = "no";
		
		do{
		System.out.println("\nWhat beverages would you like to serve for Breakfast on Day " +counter+" ?");		
		System.out.println("The beverage options for breakfast are: coffee, tea, oj, milk and water.");
		String bkBeverageUserInput = in.next();

			for(int i =0; i<bkBeverage.length; i++){
				if(bkBeverageUserInput.equalsIgnoreCase(bkBeverage[i])){
					System.out.print("\nThat's a great choice, I would have picked the same thing.\n");
					correct = "yes";
					bkBeverageCostSum += bkBeverageCost[i];
				}
			}
		}while(correct.equals("no"));
	}
	
	public static void lunchFood(){
		Scanner in = new Scanner(System.in);
		
		String[] lFOptions = {"salads","pizza","sandwiches","soup","cheeseburgers"};
		int[] lFoodCost = {12,8,11,6,11};
		String correct = "no";
		
		do{
		System.out.println("\nWhat food would you like to serve for Lunch on Day " +counter+" ?");
		System.out.println("The food options for lunch are: salads, pizza, sandwiches, soup and cheeseburgers.");
		String lunchUserInput = in.next();
		
			for(int i =0; i<lFOptions.length; i++){
				if(lunchUserInput.equalsIgnoreCase(lFOptions[i])){
					System.out.print("\nThat's an excellent choice.\n");
					correct = "yes";
					lFoodCostSum += lFoodCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void lunchBeverage(){
		Scanner in = new Scanner(System.in);
		
		String[] lBeverage = {"water","soda","juice","coffee","tea"};
		int[] lBeverageCost = {1,3,3,2,2};
		String correct = "no";
		
		do{
		System.out.println("\nWhat beverages would you like to serve for Lunch on Day " +counter+" ?");
		System.out.println("The beverage options for lunch are: water, soda, juice, coffee, and tea.");
		String lunchBeverageUserInput = in.next();
		
			for(int i =0; i<lBeverage.length; i++){
				if(lunchBeverageUserInput.equalsIgnoreCase(lBeverage[i])){
					System.out.print("\nFantastic! That goes perfectly with your lunch meal.\n");
					correct = "yes";
					lBeverageCostSum += lBeverageCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void dinnerFood(){
		Scanner in = new Scanner(System.in);
		
		String[] dinnerFoodOptions = {"steak","chicken","pork","fish","vegetarian"};
		int[] dinnerFoodCost = {21,17,16,23,19};
		String correct = "no";
		
		do{
		System.out.println("\nWhat food would you like to serve for Dinner on Day " +counter+" ?");
		System.out.println("The food options for dinner are: steak, chicken, pork, fish, vegetarian.");
		String lunchUserInput = in.next();
		
			for(int i =0; i<dinnerFoodOptions.length; i++){
				if(lunchUserInput.equalsIgnoreCase(dinnerFoodOptions[i])){
					System.out.print("\nGreat pick, that dish is excellent!\n");
					correct = "yes";
					dinnerFoodCostSum += dinnerFoodCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void dinnerBeverage(){
		Scanner in = new Scanner(System.in);
		
		String[] dinnerBeverage = {"beer","wine","mix","soda","water"};
		int[] dinnerBeverageCost = {8,12,14,3,1};
		String correct = "no";
		
		do{
		System.out.println("\nWhat beverages would you like to serve for Dinner on Day " +counter+" ?");
		System.out.println("The beverage options for dinner are: beer, wine, mix, soda and water.");
		String lunchBeverageUserInput = in.next();
		
			for(int i =0; i<dinnerBeverage.length; i++){
				if(lunchBeverageUserInput.equalsIgnoreCase(dinnerBeverage[i])){
					System.out.print("\nThat's a good choice, we'll be sure to make sure it's nice and cold.\n");
					correct = "yes";
					dinnerBeverageCostSum += dinnerBeverageCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void dinnerDessert(){
		Scanner in = new Scanner(System.in);
		
		String[] dinnerDessert = {"cake","chocolate","fruit","pastries"};
		int[] dinnerDessertCost = {5,4,4,9,2};
		String correct = "no";
		
		do{
		System.out.println("\nWhat dessert would you like to serve for Dinner on Day " +counter+" ?");
		System.out.println("The dessert options for after dinner are: cake, chocolate, fruit and pastries.");
		String lunchBeverageUserInput = in.next();
		
			for(int i =0; i<dinnerDessert.length; i++){
				if(lunchBeverageUserInput.equalsIgnoreCase(dinnerDessert[i])){
					System.out.print("\nThat's a great choice.\n");
					correct = "yes";
					dinnerDessertCostSum += dinnerDessertCost[i];
				}
			}	
		}while(correct.equals("no"));
	}
	
	public static void eventCostCalculations(){	
		int finalBreakfastFoodTotal = bkFoodCostSum * numPeople;
		int finalBreakfastBeverageTotal = bkBeverageCostSum * numPeople;
		int totalBreakfastCost = finalBreakfastFoodTotal + finalBreakfastBeverageTotal;
		
		
		int finalLunchFoodTotal =  lFoodCostSum * numPeople;
		int finalLunchBeverageTotal = lBeverageCostSum * numPeople;
		int totalLunchCost = finalLunchFoodTotal + finalLunchBeverageTotal;
		
		int finalDinnerFoodTotal =  dinnerFoodCostSum * numPeople;
		int finalDinnerBeverageTotal =  dinnerBeverageCostSum * numPeople;
		int finalDinnerDessertTotal =  dinnerDessertCostSum * numPeople;
		int totalDinnerCost = finalDinnerFoodTotal + finalDinnerBeverageTotal + finalDinnerDessertTotal;
		
		int overallMealCost = totalBreakfastCost + totalLunchCost + totalDinnerCost;
		
		System.out.println("\nGreat, you've now picked the entire food menu for your event!");
		System.out.println("Here is a breakdown of what you can expect to pay for all of your meal costs.");
		
		System.out.println("\nBreakfast Food Costs Per Person = $"+bkFoodCostSum         +"          Total Breakfast Meal Costs for "+numPeople + " guests = $"+finalBreakfastFoodTotal);
		System.out.println("Breakfast Beverage Costs Per Person = $"+bkBeverageCostSum +"      Total Breakfast Beverage Costs for "+numPeople + " guests = $"+finalBreakfastBeverageTotal);
		System.out.println("Your Total Breakfast costs are $"+totalBreakfastCost);
		
		System.out.println("\nLunch Food Costs Per Person = $"+lFoodCostSum         +"             Total Lunch Meal Costs for "+numPeople + " guests = $"+finalLunchFoodTotal);
		System.out.println("Lunch Beverage Costs Per Person = $"+lBeverageCostSum +"          Total Lunch Beverage Costs for "+numPeople + " guests = $"+finalLunchBeverageTotal);
		System.out.println("Your Total Lunch costs are $"+totalLunchCost);
		
		System.out.println("\nDinner Food Costs Per Person = $"+dinnerFoodCostSum         +"            Total Dinner Meal Costs for "+numPeople + " guests = $"+finalDinnerFoodTotal);
		System.out.println("Dinner Beverage Costs Per Person = $"+dinnerBeverageCostSum +"         Total Dinner Beverage Costs for "+numPeople + " guests = $"+finalDinnerBeverageTotal);
		System.out.println("Dinner Dessert Costs Per Person = $"+dinnerDessertCostSum +"          Total Dinner Dessert Costs for "+numPeople + " guests = $"+finalDinnerDessertTotal);
		System.out.println("Your Total Dinner costs are $"+totalDinnerCost);
		
		System.out.println("\nYour all inclusive total is $"+overallMealCost);
	}
	
	//Checks to make sure user is entering only an integer
	private static int inputValidation() {
		int enteredNumber = 0;
		Scanner in = new Scanner(System.in);
		boolean numberError = false;

		do{ 
			try{
				String enteredString = in.next(); //read the number from the keyboard
				enteredNumber = Integer.parseInt(enteredString.trim()); // then cast as integer
				numberError = false; //if parseInt doesnt work, then this will never be sent to false
			}
			catch(Exception e) { //by convention we use the letter e to catch exceptions
				System.out.println("The value you provided is invalid" + e + ". \nPlease enter an integer:"); //error message for user
				numberError = true; 
			}

		} while (numberError == true); //while user doesn't enter a integer, this will keep looping
		return enteredNumber; //will send this number back to where the method was called from
	}
}