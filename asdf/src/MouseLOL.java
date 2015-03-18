

import java.util.Random;

import javax.swing.*;

import java.awt.*;

final public class MouseLOL<gtg> {
//Jframe Documenting
	JFrame frame;

	DrawPanel drawPanel;
	//constructing everything

	private int x = 650;

	private int y = 50;

	boolean up = false;
	//Variables for moving the mouse
	boolean down = true;
	int x1=10;
    int y1=110;
	
	//boolean left = true;

		//boolean right = false;

	boolean left = false;

	boolean right = true;

	public static void main(String[] args) {

		new MouseLOL().go();

	}

	void go() {
//Jframe structuring and attentiveness
		frame = new JFrame("Test");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		drawPanel = new DrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

		frame.setVisible(true);

		frame.setResizable(false);

		frame.setSize(800, 800);

		frame.setLocation(375, 55);

		moveIt();

	}

	class DrawPanel extends JPanel {
		
		//Change to Graphics g

		public void paintComponent(Graphics g) {
			Random rnd = new Random();
			//////////////////////////////////////
			
//Gradient Background
			
			
		    Graphics2D g2d1 = (Graphics2D) g;
            g2d1.setBackground(Color.green);
            Color color1 = Color.green;
            Color color2 = color1.darker().darker().darker().darker().darker().darker().darker().darker().darker();
            //Integers are set to deliver the darker side as image paints.
            int w = getWidth();
            int h = getHeight(); 
            GradientPaint gp = new GradientPaint(
                    w, 0, color1,
                    15, h, color2,true);
            g2d1.setPaint(gp);
            g.fillRect(0,0,w,h);
          //Mouse Ear1   
          //Mouse Ear 1 approximately 1/2 the size of the head.
            g.setColor(Color.PINK);
            g.fillOval(x1, y1, 150, 170);
            //Mouse Ear2
            //Mouse Ear 2 approximately 1/2 the size of the head
            g.setColor(Color.PINK);
            g.fillOval(x1+130, y1, 150, 170);
            //Mouse Head
            //Mouse head is 250x180 size because it is required to fit into ears well
            g.fillOval(x1+15, y1+150, 250, 180);
            //Mouse Nose
            g.setColor(Color.black);
            g.fillOval(x1+110, y1+200, 25, 25);
            g.fillOval(x1+150,y1+200, 25, 25);
            //Mouse Mout
            g.setColor(Color.red);
            g.fillRect(x1+95, y1+250, 100, 15);
            //Mouse Teeth
            g.setColor(Color.WHITE);
            g.fillRect(x1+120, y1+250, 20, 40);
            g.fillRect(x1+150, y1+250, 20, 40);
            g.setColor(Color.blue);
            
            

		    
		    
		    
		    
		    
		    /////////////////////////////////////
			

		}

	}

	private void moveIt() {

		while (true) {

			if (x1 >= 5) {

				right = false;

				left = true;
				
				/*if (k >= 650) {
				right = false;
				left = true;
			}

			if (k <= 325) {

				right = true;
				left = false;

			}*/

			}

			if (x1 <= 550) {

				right = true;

				left = false;

			}

			if (y1 >= 170) {

				up = true;

				down = false;

			}

			if (y1 <= 0) {

				up = false;

				down = true;

			}

			if (up) {

				y1--;

			}

			if (down) {

				y1++;
				
				/*if (left) {

				x--;

			}

			if (right) {

				x++;

			}*/

			}

			if (left) {

				x1--;

			}

			if (right) {

				x1++;

			}

			try {

				Thread.sleep(10);

			} catch (Exception exc) {
			}

			frame.repaint();

		}

	}

}

