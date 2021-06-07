

class AB{
	int num1;
	int num2;
	
	AB(){
		
	}
	AB(int i, int j)
	{
		num1 = i;
		num2 = j;
	}
	
	int sum(int i , int j, int k)
	{
		return i + j + k;
	}
	
	int sum(int h, float m )
	{
		System.out.println("Type promotion");
		return h +(int) m;
	}
	
	int mul(int i, int j)
	{
		return i * j;
	}
}


public class OverloadingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AB obj = new AB();
		
		int sum = obj.sum(10, 20);
		
		System.out.println(sum);
//		System.out.println(sum2);
		
		// Method Overloading
		// same function name
		// different argument list [in terms of number of parameters or different types of parameters]
	}

}

