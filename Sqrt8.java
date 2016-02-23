package jayJay;
import java.util.Scanner;

public class Sqrt8 {
	
	public static void main(String[] args){
		
		double S = 0; 
		String word1;
		String word2 = "friend";
		double x = 0;//moved from above into main, which then allowed it to be used without making it static
		double maxIterations = 0;//moved from above into main, which then allowed it to be used without making it static

		System.out.println("Speak, 'friend', and enter.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

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
			
			SqrtLabel8 foo = new SqrtLabel8();
			foo.create(args);//calls GUI 
			
			SqrtLabel8 foo2 = new SqrtLabel8();
			x = foo2.getAnswer(S, x, maxIterations);						

			System.out.println("\nSqrt8 Class: main:");
			System.out.println("Close! Your answer comes to " + x);		
			
			SqrtLabel8b foo5 = new SqrtLabel8b();
			foo5.createOutput(args);
			
			Sqrt8Oranges foo15 = new Sqrt8Oranges();
			foo15.outputToFile(args);
		}
		else
			System.out.println("Thou art not worthy yet. Come back another day.");
	}
}
