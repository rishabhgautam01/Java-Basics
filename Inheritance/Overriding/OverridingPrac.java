package InheritancePractise;


class Parent{
	String firstName  ;
	String lastName  ;
	String fullName ;
	
	
	Parent(String fn, String ln){
		firstName = fn;
		lastName = ln;
		System.out.println("parent constructor called ");
		
	}
	void message() {
		System.out.println("Hello, good morning");
	}
	
	void message(String name)
	{
		System.out.println("Hello , " + name);
	}
	
	void myName()
	{
		System.out.println(   fullName);
	}
	
}

class Child extends Parent{
	
	String firstName;
	String fullName;
	String lastName;
	
	Child(String firstName, String lastName)
	{
		
		super("John", "macky");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setFullName()
	{
		// fullName = firstname + lastname
		fullName = this.firstName + lastName;
		
	}
	
	void printParentName()
	{
			super.myName();
	}
  
	@Override 
	void message() {
		System.out.println("Good Morning !! ");
	}
	
	@Override
	void myName()
	{
		System.out.println(firstName + lastName);
	}
	
	
}

public class OverridingPrac {

	public static void main(String[] args) {
		Child ch1 = new Child("unisa ", "asinu");
		ch1.myName();
		ch1.printParentName();
		;
	}

}
