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


 
public class SqrtLabel {
 
	static Scanner sc = new Scanner(System.in);
	public static String text1;//auto-generated from Sqrt5
	public static String text2b;
	
public static void main (String [] args) {
	Display display = new Display ();
	Shell shell = new Shell(display);
 
	Label label = new Label(shell, SWT.BORDER);
	label.setSize(100,30);
	label.setLocation(50, 50);
	label.setText("Number");
	Text text = new Text (shell, SWT.BORDER);
	//text.setLayoutData (new RowData (50, SWT.DEFAULT));
	text.setSize(100,20);
	text.setLocation(160, 50);
	
	Label label2 = new Label(shell, SWT.BORDER);
	label2.setSize(100, 30);
	label2.setLocation(50, 80);
	label2.setText("Guess");
	Text text2 = new Text (shell, SWT.BORDER);
	//text.setLayoutData (new RowData (50, SWT.DEFAULT));
	text2.setSize(100,20);
	text2.setLocation(160, 80);
	
	Label label3 = new Label(shell, SWT.BORDER);
	label3.setSize(100, 30);
	label3.setLocation(40, 110);
	label3.setText("Percent Error");
	Text text3 = new Text (shell, SWT.BORDER);
	//text.setLayoutData (new RowData (50, SWT.DEFAULT));
	text3.setSize(100,20);
	text3.setLocation(160, 110);
	
	Label label4 = new Label(shell, SWT.BORDER);
	label4.setSize(100, 30);
	label4.setLocation(40, 140);
	label4.setText("Tolerance");
	
	Label label5 = new Label(shell, SWT.BORDER);
	label5.setSize(100, 130);
	label5.setLocation(40, 170);
	label5.setText("Actual Answer");
	
	Label label6 = new Label(shell, SWT.BORDER);
	label6.setSize(100,30);
	label6.setLocation(40, 200);
	label6.setText("Your Answer");
	
	Label label7 = new Label(shell, SWT.BORDER);
	label7.setSize(100, 30);
	label7.setLocation(40, 230);
	label7.setText("Iterations Done");
	
	//Button okay = new Button (shell, SWT.PUSH);
	//okay.setText ("Guess:");
    Button button = new Button(shell, SWT.PUSH);
    button.setSize(70, 30);//width, height
	button.setLocation(310, 230);
	button.setText("Okay");
	button.addSelectionListener(new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			System.out.println("Okily-Dokily");
			Text chosen = text;
			passText(chosen);
		}

		private void passText(Text chosen) {
			System.out.println(chosen.getText());
			
		}
		});
	
	text1 = text.getText();
	text2b = text2.getText();

	//System.out.println(text1);
	/*String aString = text1;
	    double aDouble = Double.parseDouble(aString);
	    System.out.println(aDouble);
	*/
	Label shadow_sep_h = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_OUT | SWT.HORIZONTAL);
	shadow_sep_h.setBounds(30,30,100,30);//start from left, start from top, horizontal travel, start from top
	
	Label shadow_sep_v = new Label(shell, SWT.SEPARATOR | SWT.SHADOW_IN | SWT.VERTICAL);
	shadow_sep_v.setBounds(30,43,5,200);
	
	shell.setDefaultButton (button);
	shell.setSize(400,300);
	shell.setLayout (new RowLayout ());
	
    shell.addShellListener(new ShellListener() {

	public void shellClosed(ShellEvent e) {
        if(text != null && !text.isDisposed())
            text.setText(text.getText());
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
	Sqrt5.main(args);

}
}
