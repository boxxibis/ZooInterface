/************************************************
 
 * Code by Cameron Spencer                       *
 ************************************************/

import javax.swing.*;

import java.awt.*;
import java.util.Random;

final public class Cat2 {

	JFrame frame;

	DrawPanel drawPanel;

	private int d = 700;

	private int f = 100;

	boolean up = true;

	boolean down = false;

	//boolean left = true;

	//boolean right = false;

	public static void main(String[] args) {

		new Cat2().go();

	}

	void go() {

		frame = new JFrame("Narwhal");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		drawPanel = new DrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

		frame.setVisible(true);

		frame.setResizable(false);

		frame.setSize(1500, 800);

		frame.setLocation(10, 10);

		moveIt();

	}

	class DrawPanel extends JPanel {
		boolean hasgraphics=false;
		Car car1 = new Car();
		//Car car1 = new Car();
		public void paintComponent(Graphics g) {
			
			Graphics2D g2d = (Graphics2D) g;
			System.out.println("hi");

			//Variables
			
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
						int y = (rndInt.nextInt(f + 150) + (f + 125));
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

	}

	public void moveIt() {

		while (true) {
			

			/*if (d >= 375) {
				right = false;
				left = true;
			}

			if (d <= 325) {

				right = true;
				left = false;

			}*/

			if (f >= 225) {                    //DELETE THIS END COMMENT WHEN DONE

				up = true;

				down = false;

			}

			if (f <= 175) {

				up = false;

				down = true;

			}

			if (up) {

				f--;

			}

			if (down) {

				f++;

			}

			/*if (left) {

				d--;

			}

			if (right) {

				d++;

			}*/

			try {

				Thread.sleep(30);

				} catch (Exception exc) {
				}

			frame.repaint();

		}

	}

}