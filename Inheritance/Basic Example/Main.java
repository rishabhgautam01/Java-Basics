package InheritancePractise;


class B extends A{
	
	int getMul()
	{
		return num1 * num2;
	}
	
} 
 class A {
	 int num1;
	public int num2; // Propertises
	
	// Behaviour
	 int getSum()
	{
		return num1 + num2;
	}

}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to create object?
		// Syntax is this
//		A obj = new A();    // () constructors
//		obj.num1 = 10;
//		obj.num2 = 20;
//		int sum  = obj.getSum();
//		System.out.println(sum);
		
		
		
		B mulObj = new B();
		mulObj.num1 = 10;
		mulObj.num2 = 3;
		System.out.println("Multiplication is " + mulObj.getMul());
		System.out.println("Summation is " + mulObj.getSum());
	}

}
