import java.util.Scanner;
public class TwoSmallest {

    public static void main(String [] args){
 
        double terminator = 10;

        double min = Double.POSITIVE_INFINITY; 
        double max = 0; 

        System.out.println("Enter a number"); 

         
        Scanner in = new Scanner(System.in);
        for (int x= 0; x <= terminator; x++){
        	double num = in.nextDouble();
        	{
            if (num < min) 
            {  System.out.println("That's Smaller");
                min = num; 
            } 
            else if (num > max) 
            { System.out.println("That's Bigger");
                max = num; 
            } 
            else{System.out.println("No luck");
            }
            
      
	      
	    }
     System.out.println("Min is " + min);
     System.out.println("max is " + max);
	}
        System.out.println("Final Min is " + min);
        System.out.println("Final Max is " + max);
    }
    
}

