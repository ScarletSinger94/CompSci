
public class methods {
		public static int multiply(int a, int b){
			int product = 0;
			int count = 0;
			
		while (count<b){
			count++;
			product =  a + product;
		}
		return product;
			
		}
		public static void main(String[] args){
		System.out.println("Please Enter Two digits you would like to multiply");
			int c = multiply(IO.readInt(),IO.readInt());
			System.out.println(c);
		}
		
		public static boolean isprime(int num){
			for(int i =2; i< num; i++);
				int i = 0;
				if(num % i ==0){
					return false;
			}
				else{;}
				return false;
		}
}

