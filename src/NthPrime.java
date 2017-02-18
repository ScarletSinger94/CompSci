public class NthPrime {
	 
	  public static void main(String[] args) {
	 
	    System.out.print("Enter n to compute the nth prime number: ");
	 
	    int nth = IO.readInt();
	 
	    int num, count, i;
	    num=1;
	    count=0;
	 if(nth < 0){
		 IO.reportBadInput();
		 nth = IO.readInt();
	 }
	    while (count < nth){
	      num=num+1;
	      for (i = 2; i <= num; i++){
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }
	    IO.outputIntAnswer(num);
	  }
	}
