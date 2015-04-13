

import java.util.Random;

import javax.swing.*;

import java.awt.*;

final public class jstingra {

	JFrame frame;

	DrawPanel drawPanel;

	private int x = 650;

	private int y = 50;

	boolean up = false;

	boolean down = true;

	boolean left = false;

	boolean right = true;

	public static void main(String[] args) {

		new jstingra().go();

	}

	void go() {

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
		
		

		public void paintComponent(Graphics g) {
			Random rnd = new Random();
			//////////////////////////////////////
			
//Gradient Background
			
			
		    Graphics2D g2d1 = (Graphics2D) g;
            g2d1.setBackground(Color.blue);
            Color color1 = getBackground();
            Color color2 = color1.darker().darker().darker().darker().darker().darker().darker().darker().darker();
            int w = getWidth();
            int h = getHeight(); 
            GradientPaint gp = new GradientPaint(
                    w, 0, color1,
                    0, h, color2);
//Aquarium
            g2d1.setPaint(gp);
            g2d1.fillRect(0, 200, 800, 400);
//Stingray Body            
		    g.setColor(Color.blue);
		    g.fillOval(250, 250, 200, 200);
//Stingray Nose
		    g.setColor(Color.blue);
		    g.fillArc(125, 250, 200, 200, -45, 90);
//Stingray Eyes
		    g.setColor(Color.black);
		    g.fillOval(300, 300, 25, 25);
		    g.fillOval(300, 375, 25, 25);
//Stingray Tail
		    g.setColor(Color.blue);
		    g.fillRect(450, 350, 200, 5);
		    
		    
		    
		    
		    
		    
		    /////////////////////////////////////
			
//Random Animated Stones: Different Colors and Sizes	
			int blue = rnd.nextInt(256);
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			g.setColor(new Color(blue, red, green));
			int l1 = rnd.nextInt(0 + 50);
			
			g.fillOval(x, y + 500, l1, l1);
			g.fillOval(x, y + 500, l1, l1);
			g.fillOval(x, y + 500, l1, l1);
			g.fillOval(x, y + 500, l1, l1);
			g.fillOval(x, y + 500, l1, l1);
			g.fillOval(x, y + 500, l1, l1);
		}

	}

	void moveIt() {

		//while (true) {

			if (x >= 650) {

				right = false;

				left = true;

			}

			if (x <= 550) {

				right = true;

				left = false;

			}

			if (y >= 50) {

				up = true;

				down = false;

			}

			if (y <= 0) {

				up = false;

				down = true;

			}

			if (up) {

				y--;

			}

			if (down) {

				y++;

			}

			if (left) {

				x--;

			}

			if (right) {

				x++;

			}

			try {

				Thread.sleep(10);
				frame.repaint();

			} catch (Exception exc) {
			}


		}

	}

//}