package InheritancePractise;


class Vehicle
{  
  void run(){System.out.println("Vehicle is running");}  
}  

class Bike extends Vehicle
{      
  
	@Override
	void run()
	{
		System.out.println("Bike is running ");
	}
	
}  

class Honda extends Bike{
	
	
	@Override 
	
	
	void run()
	{
		System.out.println("honda bike is running ");
	}
	
}

public class OverridingPrac2 {

	public static void main(String[] args) {
		
		
		   
		Honda obj = new Honda();  
		  obj.run();    
		  
		  
		  // super is a keyword
//		  int super = 0;    
//		  System.out.println(super);
			
		  
		  // Terminologies
		  // Parent class:  super class
		  // Child class : subclass
		 
	}

}
