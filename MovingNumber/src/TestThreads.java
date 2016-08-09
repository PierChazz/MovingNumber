import java.awt.Color;

/*1 août 2016
MovingNumber
pier*/


public class TestThreads
{
public static void main (String[]args)
{
	Moving m = new Moving();
	
	ThreadNumber tn1 = new ThreadNumber("1", 50,30,Color.ORANGE,100);
	ThreadNumber tn2 = new ThreadNumber("2", 70,30,Color.RED,150);
	ThreadNumber tn3 = new ThreadNumber("3", 90,30,Color.magenta,200);
	ThreadNumber tn4 = new ThreadNumber("4", 110,30,Color.cyan,110);
	ThreadNumber tn5 = new ThreadNumber("5", 130,30,Color.pink, 105);
	ThreadNumber tn6 = new ThreadNumber("6", 150,30,Color.green,230);
	ThreadNumber tn7 = new ThreadNumber("7", 170,30,Color.blue,120);
	
	m.add(tn1);
	m.add(tn2);
	m.add(tn3);
	m.add(tn4);
	m.add(tn5);
	m.add(tn6);
	m.add(tn7);
	
	new Thread(tn1).start();
	new Thread(tn2).start();
	new Thread(tn3).start();
	new Thread(tn4).start();
	new Thread(tn5).start();
	new Thread(tn6).start();
	new Thread(tn7).start();
}
}
