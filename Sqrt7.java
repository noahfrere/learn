package jayJay;
import java.util.Scanner;

public class Sqrt7 {

	public static double maxIterations;
	public static double x;

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		double S = 0; 
		String word1;
		String word2 = "friend";
		
		System.out.println("Speak, 'friend', and enter.");
		word1 = sc.next();
		
		if (word1.equals(word2))
		{
			System.out.println("Enter!\nWelcome to the Square Root function via Newton.\n"
					+ "This program will calculate the square root of any number using Newton's "
					+ "method, \nusing as many iterations as necessary to give you an answer "
					+ "based on the tolerance you specify.\n"
					+ "After you press enter, a window will pop up. Enter the number you want "
					+ "the square root of,\nyour best guess for the answer, the tolerance you "
					+ "desire, and the maximum number of iterations you want run.\n");
			
			SqrtLabel7.create(args);//calls GUI 
			x = SqrtLabel7.getAnswer(S, x, maxIterations);			

			System.out.println("\nSqrt7 Class: main:");
			System.out.println("Close! Your answer comes to " + x);		
		}
		
		else
			System.out.println("Thou art not worthy yet. Come back another day.");
		
	}
}
