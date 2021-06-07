
class Operation{
	
	int sqaure(int n)
	{
		return n * n;
	}
	
	int cube(int n)
	{
		return n * n *n;
		
	}
}


class Circle{
	
	Operation op;
	double pi = 3.14;
	
	double area(int radius)
	{
		op = new Operation();
		int radius_square = op.sqaure(radius);
		
		return pi * radius_square;
		
		
	}
	
}

public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle();
		double area_c1 = c1.area(2);
		System.out.println("Area is  " + area_c1);
	}

}
