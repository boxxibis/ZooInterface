//CCameron
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		//Variables
		int d = 700; //X-Value
		int f = 100; //Y-Value
		int h = 100; //X-Size
		int j = 100; //Y-Size
		
		
		//Background
		g2d.setColor(new Color(0, 51, 102));
		g2d.fillRect(0,0,2000,2000);
		//Stars
		Random rndmInt = new Random();
		
		for (int b = 1; b <=25; b++)
		{
			int q = rndmInt.nextInt(1200);
			int w = rndmInt.nextInt(1200);
			int red = (255);
			int green = (255);
			int blue =(255);
			g.setColor(new Color(red,green,blue));
			g.fillRect(q, w, 10, 10);
		}
		//Poptart
				g2d.setColor(new Color(254,202,162));
				g2d.fillRect(d, f + 75, h + 375, j + 275);
				
		
		//Poptart Black Outline
				
				g2d.setColor(Color.black);
				
				g2d.fillRect(d, f + 75, h - 75, j - 75);
				g2d.fillRect(d, f + 425, h - 75, j - 75);
				g2d.fillRect(d - 25, f + 100, h - 75, j + 250);
				g2d.fillRect(d + 25, f + 50, h + 325, j - 75);
				g2d.fillRect(d + 450, f + 75, h - 75, j - 75);
				g2d.fillRect(d + 475, f + 100, h - 75, j + 50);
				g2d.fillRect(d + 25, f + 450, h + 200, j - 75);
				
		//Poptart Topping
				g2d.setColor(new Color(255,153,255));
				
				g2d.fillRect(d + 25, f + 100, h + 325, j + 225);
				
		//Poptart (Continued)
				g2d.setColor(new Color(254,202,162));
				
				g2d.fillRect(d + 25, f + 200, h - 75, j - 50);
				g2d.fillRect(d + 25, f + 100, h - 50, j - 75);
				g2d.fillRect(d + 400, f + 100, h - 50, j - 75);
				g2d.fillRect(d + 425, f + 100, h - 75, j - 50);
				g2d.fillRect(d + 25, f + 375, h - 75, j - 50);
				g2d.fillRect(d - 25, f - 400, h - 50, j - 75);
				
		//Poptart Sprinkles
				Random rndInt = new Random();
				
				for (int b = 1; b <=12; b++)
				{
					int x = (rndInt.nextInt(375) + 750);
					int y = (rndInt.nextInt(250) + 225);
					int red = (249);
					int green = (53);
					int blue =(155);
					g.setColor(new Color(red,green,blue));
					g.fillRect(x, y, 25, 25);
				}
		
		//Head Black Outline
				g2d.setColor(Color.black);
				
				g2d.fillRect(d + 300, f + 175, h - 50, j + 175);
				g2d.fillRect(d + 275, f + 200, h - 75, j + 125);
				g2d.fillRect(d + 250, f + 300, h - 75, j); 
				g2d.fillRect(d + 350, f + 200, h - 75, j - 75);
				g2d.fillRect(d + 375, f + 225, h - 75, j - 75);
				g2d.fillRect(d + 350, f + 250, h - 50, j + 75);
				g2d.fillRect(d + 400, f + 250, h, j + 100);
				g2d.fillRect(d + 325, f + 425, h + 150, j - 50);
				g2d.fillRect(d + 500, f + 225, h - 50, j + 75);
				g2d.fillRect(d + 525, f + 200, h - 75, j - 75);
				g2d.fillRect(d + 550, f + 175, h - 50, j + 125);
				g2d.fillRect(d + 600, f + 300, h - 50, j);
				g2d.fillRect(d + 600, f + 200, h - 75, j);
				g2d.fillRect(d + 600, f + 400, h - 75, j - 75);
				g2d.fillRect(d + 575, f + 425, h - 75, j - 75);
		//Head
				g2d.setColor(Color.gray);
				
				//g2d.drawRect(1000,300,300,300);
				g2d.fillRect(d + 300, f + 200, h - 50, j + 125);
				g2d.fillRect(d + 275, f + 300, h - 75, j);
				g2d.fillRect(d + 350, f + 225, h - 75, j - 75);
				g2d.fillRect(d + 350, f + 250, h - 50, j + 75);
				g2d.fillRect(d + 400, f + 275, h, 	   j + 50);
				g2d.fillRect(d + 325, f + 425, h + 150, j - 75);
				g2d.fillRect(d + 500, f + 250, h - 50, j + 75);
				g2d.fillRect(d + 525, f + 225, h - 75, j - 75);
				g2d.fillRect(d + 550, f + 200, h - 50, j + 125);
				g2d.fillRect(d + 600, f + 300, h - 75, j);
				
		//Cheek Blush
				g2d.setColor(Color.pink);
				
				g2d.fillRect(d + 300, f + 350, h - 50, j - 50);
				g2d.fillRect(d + 575, f + 350, h - 50, j - 50);
				
		//Eyes
				g2d.setColor(Color.black);
				
				g2d.fillRect(d + 350, f + 300, h - 50, j - 50);
				g2d.fillRect(d + 525, f + 300, h - 50, j - 50);
				
				g2d.setColor(Color.white);
				
				g2d.fillRect(d + 350, f + 300, h - 75, j - 75);  /*Inner white*/ 
				g2d.fillRect(d + 525, f + 300, h - 75, j - 75);  /*Inner white*/ 
				
		//Nose
				g2d.setColor(Color.black);
				
				g2d.fillRect(d + 475, f + 325, h - 75, j - 75);
				
		//Mouth
				g2d.fillRect(d + 375, f + 375, h - 75, j - 50);
				g2d.fillRect(d + 375, f + 400, h + 75, j - 75);
				g2d.fillRect(d + 350, f + 375, h - 75, j - 50);
				g2d.fillRect(d + 525, f + 375, h - 75, j - 50);
		
				
						
		
	}

	@Override 
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}

public class Cat extends JFrame {

	public Cat() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setSize(1600,1200);
		setTitle("Nyan_Cat");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Cat ex = new Cat();
				ex.setVisible(true);
			}
		});
	}
}