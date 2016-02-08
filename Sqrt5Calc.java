package jayJay;

public class Sqrt5Calc {
	
	static double desiredPercentError = Sqrt5.desiredPercentError;
	static double real = Sqrt5.real;

	
	public static double get(double S, double x, int iter){
		
		double tolerance = Sqrt5.tolerance;

		System.out.println("Tolerance is " + tolerance);
		
			for (int i = 0; i < 100; i++)
			{
				x = x - ((x*x) - S)/(2*x);
				System.out.println("Iteration #" + (i+1));
				if ((x - real) < tolerance) break;
			}
			
		return x;
	}
}
