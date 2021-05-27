public class LogicalOperators {

	public static void main(String[] args) {
		
		
		// And Operator
		
		System.out.println(true && true);   // true
		System.out.println(false && true); //false
		System.out.println(3==3 && 4==4 ); //true
		System.out.println(5==1 && 4==4);  //false
		
		// Or Operator
		System.out.println(false || true); //true
		System.out.println(3==3 || 4==4 ); //true
		System.out.println(5==1 || 4==4);  //true
		
		// Notice
		// If you are using OR operator and the first expression os true then it will not check 
		// second operator
		int A =10;
		int B = 20;
		System.out.println(    ++A == 11 || false );   // if we get anyone true than excute
		System.out.println("A: " + A);

	}

}
