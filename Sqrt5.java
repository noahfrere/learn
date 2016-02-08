package jayJay;
import java.util.Scanner;

public class Sqrt5 {
	
	public static double desiredPercentError = 0;
	public static double real;
	public static double tolerance;
	static double x = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		double S, percentError2 = 0;
		double difference;
		String word1;
		String word2 = "friend";
		int iter = 1;//if this is set to zero, the program doesn't work. Why?????????????? 
		double a = 0;

		
		System.out.println("Speak, 'friend', and enter.");
		word1 = sc.next();
		
		if (word1.equals(word2))
		{
			System.out.println("Enter!\nWelcome to the Square Root function via Newton.\n"
					+ "This program will calculate the square root of any number using Newton's "
					+ "method, \nusing as many iterations as necessary to give you an answer based"
					+ " on the tolerance (percent error) you specify.\n"
					+ "Enter the number you want the square root of:");
			
			SqrtLabel.main(args);//calls GUI 
			//S = sc.nextDouble();
			String aString = SqrtLabel.text1;//convert string from GUI to double
		    double aDouble = Double.parseDouble(aString);
			S = aDouble;
			System.out.println(aDouble);
			
			x = guess(a);
			System.out.println(x);
			/*public final double guess(double guessx){
			
			System.out.println("Now enter your best guess for the answer:");
			//x = sc.nextDouble();
			String aString2 = SqrtLabel.text2b;//convert string from GUI to double
		    double aDouble2 = Double.parseDouble(aString2);
			x = aDouble2;
			System.out.println(aDouble2);//Why is this not printing???????????It's printing the first text.
			//Because the SqrtLabel code hasn't been given instructions to move onto the next step...
			}
			*/
			System.out.println("What percent error is acceptable?\n"
					+ "Enter a number between 0 and 99: ");
			desiredPercentError = sc.nextDouble();
			
			real = Math.sqrt(S); //actual value of the square root of S
			System.out.println("The actual square root of " + S + " is " + real);
			tolerance = real*desiredPercentError / 100;
			System.out.println("The maximum deviation from this program's output of your chosen values, "
					+ "to the actual square root of "+ S + " ,is " + tolerance);

			x = Sqrt5Calc.get(S, x, iter);			
			
			difference = x - real;
			System.out.println("The difference between this program's answer and the actual "
					+ "square root of " + S + ", is " + difference);
			
			percentError2 = difference/real * 100;
			System.out.printf("The percent error is %.2f percent, which is "
					+ "well within the error of " + desiredPercentError+ 
					" you specified.%n", percentError2);
		}
		
		else
			System.out.println("Thou art not worthy yet. Come back another day.");
		
		System.out.println("Close! Your answer comes to " + x);		

	}
	public static double guess(double guessx){
		
		//System.out.println("Now enter your best guess for the answer:");
		//x = sc.nextDouble();
		String aString2 = SqrtLabel.text2b;//convert string from GUI to double
	    double aDouble2 = Double.parseDouble(aString2);
		x = aDouble2;
		//System.out.println(aDouble2);//Why is this not printing???????????It's printing the first text.
		//Because the SqrtLabel code hasn't been given instructions to move onto the next step...
		return x;
		}
}
