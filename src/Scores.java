
public class Scores{
		public static void main(String []args){ 
			double max=0.0; 
			double min=10.0; 
			double numScore; 
			double sum=0;  
				System.out.println("Enter the Number of Judges on your Panel");
		int NumJudges = IO.readInt(); 
		if (NumJudges < 3 ){ //
			IO.outputStringAnswer("You Need At Least three Judges. Try again"); 
			NumJudges = IO.readInt();
		
		} 

		for (int x=0;x<NumJudges;x++) 
		{ 
			System.out.println("Enter your score:"); 
			numScore = IO.readDouble(); 
			
		if (numScore > 10 || numScore < 0){  
			IO.outputStringAnswer("You Need Scores between 0 and 10. Try again"); 
			NumJudges = IO.readInt();
				continue;
		} 


		if (numScore < min){
			min = numScore; 
		} 
		if (numScore > max){ 
			max = numScore; 
		} 

			sum=sum+numScore;
		} 
			sum=(sum-min-max)/(NumJudges-2); 
			IO.outputDoubleAnswer(sum); 
		} 
}

