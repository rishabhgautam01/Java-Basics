public class AssignmentOperators {

	public static void main(String[] args) {
		
		// 1) =
		int A = 10;
		int B = 20;
		int C = A + B;  // Assign the value to C
		System.out.println(C);
		
		// 2) +=  , -= , *=, /= 
		// y = 10
		// y =20
			// 1.  y = y + 10
			// 2.  y += 10	 --> y+ 10 -->y
		int y = 5;
		y += 8; //13
		System.out.println(y);  //13
		
		y -= 3;   // 10
		System.out.println(y);
		
		y *= 5;
		System.out.println(y);  // 50
		
		y /= 5;
		System.out.println(y);   // 10

	}

}
