import java.awt.Color;
import java.awt.Label;

/*1 août 2016
MovingNumber
pier*/


public class ThreadNumber extends Label implements Runnable
{	
	private static final long serialVersionUID = 1L;
	
	private int m_lx;					//coordonnées en x
	private int m_ly;					//coordonnées en y
	private int m_dort;					//temps de sommeil 
	private boolean versBas = true ;	//sens de déplacement 
	
	public ThreadNumber(String lab, int lx, int ly, Color c, int dodo)
	{
		super (lab); 
		m_lx=lx;
		m_ly=ly;
		m_dort=dodo;
		
		setSize(10,10);					//taille du label	
		setBackground(c);
		setLocation(lx,ly);
	}
	
	public void dort(long time)
	{
		try 
		{
			Thread.sleep(time);
		}
		catch(InterruptedException ue )
		{
			System.out.println(ue.getMessage());
		}
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			if(versBas)
			{
				if(m_ly<400)
				{
					m_ly++;
				setLocation(m_lx,m_ly);
				}
				else
				{
				versBas=false;
				}
			}
			else
			{
				if(m_ly>30)
				{
				m_ly--;
				setLocation(m_lx,m_ly);
				}
				else
				{
				versBas=true;
				}
			}
			dort(m_dort);
		
		}
	
	}
}
