public class EmployeeTester{
   

public static void main(String[] args)
   {
      Employee e = new Employee("Edgar", 65000);
      Manager m = new Manager("Mary", 85000, "Engineering");
      Executive v = new Executive("Veronica", 105000, "Engineering");
      System.out.println(e);
      System.out.println(m);
      System.out.println(v);
   }
}
public class Employee { 
	    private String name; 
	    private double salary; 
	     
	    public Employee(String name, double salary) { 
		        name = this,name; 
		        salary = this.salary; 
		    } 
	public String toString() { 
			return "Employee: " + this.name + " Salary: " + this.salary; 
		}
}
public class Manager extends Employee { 
	    String department; 
	     
	    public Manager(String name, double salary, String dept) { 
		        super(name, salary); 
		        department = dept; 
		    } 
	     
	    public String getDept() { 
			        return department; 
			    } 
	public String toString() { 
				return super.toString() + "Department: " + department(); 
			}
}
public class Executive extends Manager { 
	    double bonus; 
	     
	    public Executive(String name, double salary, double bon, String dept) { 
		        super(name, salary, dept); 
		        bonus = bon; 
		    } 

	    public double getBonus() { 
			        return bonus; 
			    } 
	     public String toString() { 
				return "Executive: " + this.name + " Salary: " + this.salary + "Bonus: " +  this.bonus +"Department: " + this.dept;
			}
}


