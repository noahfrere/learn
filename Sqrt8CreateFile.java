package jayJay;

//import java.io.*;
//import java.lang.*;
import java.util.*;

//creates file to store results of program, called Sqrt8 results.txt
//which can be found in the META-INF folder

public class Sqrt8CreateFile {
	
	SqrtLabel8 foo10 = new SqrtLabel8();
	String guess = foo10.text2b;//static can be outside of method, but note below: static cannot be in method - from now on don't use static unless necessary
	 //as it makes every instance of the variable take on the new value. Very rarely used. 
	SqrtLabel8 foo11 = new SqrtLabel8();
	String tolerance = foo11.text3b;
	SqrtLabel8 foo12 = new SqrtLabel8();
	String maxIterations = foo12.text4b;
	SqrtLabel8b foo7 = new SqrtLabel8b();
	double answer = foo7.answer2;
	
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("Sqrt8 results.txt");
		}
		catch(Exception e){
			System.out.println("You have an error.");
		}
	}
	
	public void addRecords(){
		
		SqrtLabel8 foo8 = new SqrtLabel8();
		String S = foo8.text1b;//this cannot be static (see above)

		x.format("S = %6s \n", S);
		x.format("Guess = %s \n", guess);
		x.format("Tolerance = %s \n", tolerance);
		x.format("Max Iterations = %s \n", maxIterations);	
		x.format("Answer = %s", answer);
	}
	
	public void closeFile(){
		x.close();
	}
}
