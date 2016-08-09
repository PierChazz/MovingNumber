import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*1 août 2016
MovingNumber
pier*/


public class Moving extends Frame 
{
	
	private static final long serialVersionUID = 1L;
	{
	
	winClose wc = new winClose();
	addWindowListener (wc);
	setLayout (null);
	setSize(200,600);
	setVisible(true);
	}

public class winClose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
}
