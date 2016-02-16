package jayJay;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import java.util.Scanner;


 
public class SqrtLabel7 {
 
	//public static final String Sqrt6Calc = null;
	static Scanner sc = new Scanner(System.in);
	public static String text1b;//auto-generated from Sqrt5
	public static String text2b;
	public static String text3b;
	public static String text4b;
	public static double x;
	public static double S;
	public static double tolerance;
	public static double maxIterations;
	public static double aDouble;
	public static Object passText;
	//public static Object Sqrt6Calc;
	
public static void create(String [] args) {
	Display display = new Display ();
	Shell shell = new Shell(display);
 
	Label label1 = new Label(shell, SWT.BORDER);
	label1.setSize(100,30);
	label1.setLocation(50, 50);
	label1.setText("Number");
	Text text1 = new Text (shell, SWT.BORDER);
	text1.setSize(100,20);
	text1.setLocation(160, 50);
	
	Label label2 = new Label(shell, SWT.BORDER);
	label2.setSize(100, 30);
	label2.setLocation(50, 80);
	label2.setText("Guess");
	Text text2 = new Text (shell, SWT.BORDER);
	text2.setSize(100,20);
	text2.setLocation(160, 80);
	
	Label label3 = new Label(shell, SWT.BORDER);
	label3.setSize(100, 30);
	label3.setLocation(40, 110);
	label3.setText("Tolerance");
	Text text3 = new Text (shell, SWT.BORDER);
	text3.setSize(100,20);
	text3.setLocation(160, 110);
	
	Label label4 = new Label(shell, SWT.BORDER);
	label4.setSize(100, 30);
	label4.setLocation(40, 140);
	label4.setText("Max Iterations");
	Text text4 = new Text (shell, SWT.BORDER);
	text4.setSize(100,20);
	text4.setLocation(160, 140);
	
    Button button = new Button(shell, SWT.PUSH);
    button.setSize(70, 30);//width, height
	button.setLocation(310, 230);
	button.setText("Okay");
	button.addSelectionListener(new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			System.out.println("Okily-Dokily");
			Text chosen1 = null;
			passText(chosen1);
			/*Text chosen2 = text2;
			passText(chosen2);
			Text chosen3 = text3;
			passText(chosen3);
			Text chosen4 = text4;
			passText(chosen4); */
		}

		public void passText(Text chosen1) {
			text1b = text1.getText();
			text2b = text2.getText();
			text3b = text3.getText();
			text4b = text4.getText();
			System.out.println("\nSqrtLabel7 Class: printing text:");
			System.out.println("S = " + text1b);
			System.out.println("x = " + text2b);
			System.out.println("Tolerance = " + text3b);
			System.out.println("Max Iterations = " + text4b);
			/*
			System.out.println("\nSqrtLabel7 Class: printing doubles converted from strings:");

			String aString = text1b;//convert string from GUI to double
		    double aDouble = Double.parseDouble(aString);
			double S = aDouble;
			System.out.println("Test: S = " + text1b + " -->" + S);

			
			String bString = SqrtLabel7.text2b;//convert string from GUI to double
		    double bDouble = Double.parseDouble(bString);
			double x = bDouble;
			System.out.println("Test: x = " + text2b + " -->" + x);

			String cString = SqrtLabel7.text3b;//convert string from GUI to double
		    double cDouble = Double.parseDouble(cString);
			double tolerance = cDouble;
			System.out.println("Test: Tolerance = " + text3b + " -->" + tolerance);

			String dString = SqrtLabel7.text4b;//convert string from GUI to double
		    double dDouble = Double.parseDouble(dString);
			double maxIterations = dDouble;
			System.out.println("Test: Max Iterations = " + text4b + " -->" + maxIterations);
			*/
		
			
			Sqrt7Calc.get(S, x, maxIterations);
			shell.close();
			//Sqrt5.main(args); //don't need this as Sqrt5.main automatically continues
		}
		});
	
	
	
	Label shadow_sep_h = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_OUT | SWT.HORIZONTAL);
	shadow_sep_h.setBounds(30,30,100,30);//start from left, start from top, horizontal travel, start from top
	
	Label shadow_sep_v = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_IN | SWT.VERTICAL);
	shadow_sep_v.setBounds(30,43,5,200);
	
	shell.setDefaultButton (button);
	shell.setSize(400,300);
	shell.setLayout (new RowLayout ());
	
    shell.addShellListener(new ShellListener() {

	public void shellClosed(ShellEvent e) {
        if(text1 != null && !text1.isDisposed())
            text1.setText(text1.getText());
    }

	@Override
	public void shellActivated(ShellEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shellDeactivated(ShellEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shellDeiconified(ShellEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shellIconified(ShellEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    });
	
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}

public static double getAnswer(double S, double x, double maxIterations) {
	System.out.println("\nSqrtLabel7 Class: getAnswer method: printing doubles converted from strings:");

	String aString = text1b;//convert string from GUI to double
    double aDouble = Double.parseDouble(aString);
	 S = aDouble;
	System.out.println("Test: S = " + text1b + " -->" + S);

	String bString = SqrtLabel7.text2b;//convert string from GUI to double
    double bDouble = Double.parseDouble(bString);
	 x = bDouble;
	System.out.println("Test: x = " + text2b + " -->" + x);

	String cString = SqrtLabel7.text3b;//convert string from GUI to double
    double cDouble = Double.parseDouble(cString);
	double tolerance = cDouble;
	System.out.println("Test: Tolerance = " + text3b + " -->" + tolerance);

	String dString = SqrtLabel7.text4b;//convert string from GUI to double
    double dDouble = Double.parseDouble(dString);
	 maxIterations = dDouble;
	System.out.println("Test: Max Iterations = " + text4b + " -->" + maxIterations);
	Sqrt7Calc.get(S, x, maxIterations);

	System.out.println("\nSqrtLabel Class: getAnswer method: \n S = " + S + "\n x = "
			+ x + "\n maxIterations = " + maxIterations);
			
	return Sqrt7Calc.get(S, x, maxIterations);
	}
}
