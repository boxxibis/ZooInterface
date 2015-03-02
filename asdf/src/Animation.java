import java.applet.*;
import java.awt.*;
import java.util.Random;

public class Animation extends Applet implements Runnable
{
	private Image dbImage;
	private Graphics dbg;
	int xp = 10;
	int yp = 100;
	int r = 20;
	int m = 0;
	int q = 100;
	public void init() 
{ 
	setBackground (Color.black);
}

public void start() 
{
	Thread th = new Thread(this);
	th.start ();
	
}

public void stop() 
{
	
}

public void destroy() 
{
	
}

public void run () 
{ 
	Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
	int x_speed = -1;
	while (true)
	{	
	xp = xp +55;
	
	int appletsize_x = 1600;
	int appletsize_y = 600;
	
	
	
	
	if(xp > appletsize_x + 200)
	{
		 xp = -20;
		 yp = yp + 250;
	}
	
	if(yp > appletsize_y + 200)
	{
		yp = 50;
	}
	

	
	repaint();
	
	
	try
	{
		Thread.sleep (20);
		
	}
	catch (InterruptedException ex)
	{ }
	
	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	

		repaint();
		
		
		try
		{
			Thread.sleep (20);
			
		}
		catch (InterruptedException ex)
		{ }
		
	
	}
	}
	
	

	



public void paint (Graphics g) 
{
	Random rnd = new Random(1234);
	
	
	// Draw Random Lines
	Random rndInt = new Random();
	for (int a = 1; a <=100; a++)
	{
		
		int red = rndInt.nextInt(256);
		int green = rndInt.nextInt(256);
		int blue = rndInt.nextInt(256);
		g.setColor(new Color(red,green,blue));
		g.fillOval(xp - r, yp - r, 2 * r, 2 * r);
		g.fillOval(xp - r - 50, yp - r, r *2, r*2);
		g.drawOval(xp - 150, yp - 50, r * 10, r *10);
		g.fillArc(xp - 75, yp - 0, 100, q - m, 180, 180);
	}
	
	
	
	
}

public void update (Graphics g)
{
	dbImage = createImage (this.getSize().width, this.getSize().height);
	dbg = dbImage.getGraphics ();
	// initialize buffer
	if (dbImage == null)
	{}

	// clear screen in background
	dbg.setColor (getBackground ());
	dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);

	// draw elements in background
	dbg.setColor (getForeground());
	paint (dbg);

	// draw image on the screen
	g.drawImage (dbImage, 0, 0, this);
	}
	
	
	
}






	
		
