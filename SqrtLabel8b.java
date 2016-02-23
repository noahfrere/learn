package jayJay;

import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SqrtLabel8b {

	public double answer2 = 0;
	
	Scanner sc = new Scanner(System.in);
	public String text1b;
	
	SqrtLabel8 foo4 = new SqrtLabel8();
	String aString = foo4.text1b;//convert string from GUI to double
	double aDouble = Double.parseDouble(aString);
	double S = aDouble;
	
	SqrtLabel8 foo4b = new SqrtLabel8();
	String bString = foo4b.text2b;//convert string from GUI to double
	double bDouble = Double.parseDouble(bString);
	double x = bDouble;
	
	SqrtLabel8 foo4c = new SqrtLabel8();
	String cString = foo4c.text3b;//convert string from GUI to double
    double cDouble = Double.parseDouble(cString);
	double tolerance = cDouble;
	
	SqrtLabel8 foo4d = new SqrtLabel8();
	String dString = foo4d.text4b;//convert string from GUI to double
    double dDouble = Double.parseDouble(dString);
	double maxIterations = dDouble;

	
public void createOutput(String [] args) {
	
	Display display = new Display ();
	Shell shell = new Shell(display);	
	
		System.out.println("\nSqrtLabel8b Class: CreateOutput Method: printing text:");
		System.out.println("S = " + S);
		System.out.println("guess = " + x);
		System.out.println("Tolerance = " + tolerance);
		System.out.println("Max Iterations = " + maxIterations);
		
	Label label2 = new Label(shell, SWT.BORDER);
	label2.setSize(330, 30);//(width, height)
	label2.setLocation(10, 10);//(over, down)
	
	Label label3 = new Label(shell, SWT.BORDER);
	label3.setSize(330, 30);//(width, height)
	label3.setLocation(10, 30);//(over, down)		
	
	Label label4 = new Label(shell, SWT.BORDER);
	label4.setSize(330, 30);//(width, height)
	label4.setLocation(10, 50);//(over, down)

	Label label5 = new Label(shell, SWT.BORDER);
	label5.setSize(330, 30);//(width, height)
	label5.setLocation(10, 70);//(over, down)
	
	Label label6 = new Label(shell, SWT.BORDER);
	label6.setSize(330, 30);
	label6.setLocation(10, 90); 
	
	SqrtLabel8 foo4 = new SqrtLabel8();
	double answer = foo4.getAnswer(S, x, maxIterations);	
	
	answer2 = answer;//referenced in class SqrtCreateFile
	
	label2.setText("You wanted the square root of  " + S);
	label3.setText("You guessed  " + x);
	label4.setText("Tolerance: " + tolerance);
	label5.setText("Maximum Iterations: " + maxIterations);
	label6.setText("Computed Answer is " + answer);

	Button button = new Button(shell, SWT.PUSH);
    button.setSize(70, 30);//width, height
	button.setLocation(180, 120);
	button.setText("Okay");
	
	button.addSelectionListener(new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			System.out.println("\nOkily-Dokily again");
			Text chosen1 = null;
			passText(chosen1);
		}

		public void passText(Text chosen1) {
			System.out.println("\nSqrtLabel8b Class: passText Method: printing double:");
			System.out.println("Answer = " + answer);
			
			shell.close();
		}
		});
	
	shell.setDefaultButton (button);
	shell.setSize(300,200);
	shell.setLayout (new RowLayout ());
	
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
	} 
}