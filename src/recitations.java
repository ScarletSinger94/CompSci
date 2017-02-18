public class recitations{
	public static void main(String[] args){
	int choice = 0;
	int count = 0;
	double[] gradebook = new double[50];
	while (choice != 5){
		System.out.println("Menu");
		System.out.println("1. change grade");
		System.out.println("2. add grade");
		System.out.println("3. average");
		System.out.println("4. print grades");
		System.out.println("5. exit");
		choice = IO.readInt();
		if (choice == 1){
			System.out.println("which assignment?");
			int an = IO.readInt();
			System.out.println("What grade");
			double grade = IO.readDouble();
			if (an > 0 && an <= count)
				gradebook[an-1] = grade;
			else{
				System.out.println("not valid assignment");
			}
			
		}else if (choice == 2){
			System.out.println("What grade");
			double grade = IO.readDouble();
			if(count < gradebook.length){
			gradebook[count] = grade;
			count++;
			
		
	}else if (choice == 3){
		
	}else if (choice == 4){
		for(int i=0; i<count; i++){
			System.out.println ("Assignment "+(i+1) +
		}
	}
	
	}
	else if(choice == 5){
		System.out.println("Goodbye");
	}	
		}
	public static void printGradebook(double[] gb){
		
	}
	
	}	
	}
