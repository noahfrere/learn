package jayJay;

public class Sqrt8Calc {
	
	SqrtLabel8 foo6a = new SqrtLabel8();
	public String aString = foo6a.text1b;//convert string from GUI to double
	public double aDouble = Double.parseDouble(aString);
	public double S = aDouble;
	
	SqrtLabel8 foo6b = new SqrtLabel8();
	public String bString = foo6b.text2b;//convert string from GUI to double
	public double bDouble = Double.parseDouble(bString);
	public double x = bDouble;
	
	SqrtLabel8 foo6c = new SqrtLabel8();
	String cString = foo6c.text3b;//convert string from GUI to double
    double cDouble = Double.parseDouble(cString);
	double tolerance = cDouble;
	
	SqrtLabel8 foo6d = new SqrtLabel8();
	String dString = foo6d.text4b;//convert string from GUI to double
    double dDouble = Double.parseDouble(dString);
	double maxIterations = dDouble;
	
	public double get(double S, double x, double maxIterations){
		
		int i = 0;
		
		System.out.println("\nSqrt8Calc Class:");
		System.out.println("S is " + S);
		System.out.println("x is " + x);
		System.out.println("Tolerance is " + tolerance);
		System.out.println("Max Iterations is " + maxIterations);
		
		while ((Math.abs(x*x-S) >= tolerance) && (i < maxIterations)){ 
				x = x - ((x*x) - S)/(2*x);
				i++;
				System.out.println("Iteration #" + i);
			} 
		
		System.out.println("x is " + x);	
		return x;
	} 
}
