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

public class SqrtLabel8 {
 
	/*public class PassText {

		public String text1b = null;

	}*/
	
	/*public SqrtLabel8(){
		String text1b;
	}*/

	//public String text1b;//auto-generated from Sqrt5
	public String text2b;
	public String text3b;
	public String text4b;
	Text text1;
	
public void create(String [] args) {
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
		}

		
		private String passText(Text chosen1) {
			
			String text1b = text1.getText();
			text2b = text2.getText();
			text3b = text3.getText();
			text4b = text4.getText();
			System.out.println("\nSqrtLabel8.passText: printing text:");
			System.out.println("S = " + text1b);
			System.out.println("x = " + text2b);
			System.out.println("Tolerance = " + text3b);
			System.out.println("Max Iterations = " + text4b);
			
			shell.close();
			return text1b;

		}
	});
	
	
	Label shadow_sep_h = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_OUT | SWT.HORIZONTAL);
	shadow_sep_h.setBounds(30,30,100,30);//start from left, start from top, horizontal travel, start from top
	
	Label shadow_sep_v = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_IN | SWT.VERTICAL);
	shadow_sep_v.setBounds(30,43,5,200);
	
	shell.setDefaultButton (button);
	shell.setSize(400,300);
	shell.setLayout (new RowLayout ());
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}

public double getAnswer(double S, double x, double maxIterations) {
	System.out.println("\nSqrtLabel8 Class: getAnswer method: printing doubles converted from strings:");


	//System.out.println("tryyy " + text1b);
	//PassText haa = new PassText();
	//System.out.println("tryyy " + haa.text1b);

	//String text1;
	//String text1b = null;
	//String text1b = text1.getText();
	//String text1b = text1.getText();

	SqrtLabel8 faa = new SqrtLabel8();
	//String aString = faa.widgetSelected.passText();//convert string from GUI to double
	//faa.widgetSelected();
	//faa.create.button.addSelectionListener();
	faa.create.passText();
	System.out.println("print " + faa.text1b);
	double aDouble = Double.parseDouble(aString);
	S = aDouble;
	System.out.println("Test: S = " + faa.text1b + " -->" + S);

	String bString = text2b;//convert string from GUI to double
	//Note: above said "String bString = SqrtLabel8.tesxt2b;" whereas aString (above that) did not...don't know why
	//i am removing "SqrtLabel8." before "text2b" to see what happens. Ditto for cString and dString
	//results: worked fine. it was redundant
    double bDouble = Double.parseDouble(bString);
	x = bDouble;
	System.out.println("Test: x = " + text2b + " -->" + x);

	String cString = text3b;//convert string from GUI to double
    double cDouble = Double.parseDouble(cString);
	double tolerance = cDouble;
	System.out.println("Test: Tolerance = " + text3b + " -->" + tolerance);

	String dString = text4b;//convert string from GUI to double
    double dDouble = Double.parseDouble(dString);
	maxIterations = dDouble;
	System.out.println("Test: Max Iterations = " + text4b + " -->" + maxIterations);

	System.out.println("\nSqrtLabel Class: getAnswer method: \n S = " + S + "\n x = "
			+ x + "\n maxIterations = " + maxIterations);
	
	Sqrt8Calc foo3 = new Sqrt8Calc();
	return foo3.get(S, x, maxIterations);
	}

/*private String passText() {
	// TODO Auto-generated method stub
	return null;
}*/
}
