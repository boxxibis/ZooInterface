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
		
		g2d.setColor(new Color(0, 51, 102));
		g2d.fillRect(0,0,2000,2000);
		
		//Poptart
				g2d.setColor(new Color(254,202,162));
				g2d.fillRect(700, 175, 475, 375);
				
		Random rndmInt = new Random();
				
				for (int b = 1; b <=15; b++)
				{
					int q = rndmInt.nextInt(1200);
					int w = rndmInt.nextInt(1200);
					int red = (255);
					int green = (255);
					int blue =(255);
					g.setColor(new Color(red,green,blue));
					g.fillRect(q, w, 10, 10);
				}
		//Poptart Black Outline
				
				g2d.setColor(Color.black);
				
				g2d.fillRect(700,175,25,25);
				g2d.fillRect(700,525, 25, 25);
				g2d.fillRect(675,200, 25, 350);
				g2d.fillRect(725, 150, 425, 25);
				g2d.fillRect(1150, 175, 25, 25);
				g2d.fillRect(1175, 200, 25, 150);
				g2d.fillRect(725, 550, 300,25);
				
		//Poptart Topping
				g2d.setColor(new Color(255,153,255));
				
				g2d.fillRect(725, 200, 425, 325);
				
		//Poptart (Continued)
				g2d.setColor(new Color(254,202,162));
				
				g2d.fillRect(725, 200, 25, 50);
				g2d.fillRect(725, 200, 50, 25);
				g2d.fillRect(1100, 200, 50, 25);
				g2d.fillRect(1125, 200, 25, 50);
				g2d.fillRect(725, 475, 25, 50);
				g2d.fillRect(725, 500, 50, 25);
				
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
				
				g2d.fillRect(1000, 275, 50, 275);
				g2d.fillRect(975, 300, 25, 225);
				g2d.fillRect(950, 400, 25, 100); //Here
				g2d.fillRect(1050, 300, 25, 25);
				g2d.fillRect(1075, 325, 25, 25);
				g2d.fillRect(1050, 350, 50, 175);
				g2d.fillRect(1100, 350, 100, 200);
				g2d.fillRect(1025, 525, 250, 50);
				g2d.fillRect(1200, 325, 50, 175);
				g2d.fillRect(1225, 300, 25, 25);
				g2d.fillRect(1250, 275, 50, 225);
				g2d.fillRect(1300, 400, 50, 100);
				g2d.fillRect(1300, 300, 25, 100);
				g2d.fillRect(1300, 500, 25, 25);
				g2d.fillRect(1275, 525, 25, 25);
		//Head
				g2d.setColor(Color.gray);
				
				//g2d.drawRect(1000,300,300,300);
				g2d.fillRect(1000,300,50,225);
				g2d.fillRect(975,400,25,100);
				g2d.fillRect(1050,325, 25, 25);
				g2d.fillRect(1050, 350, 50, 175);
				g2d.fillRect(1100, 375, 100, 150);
				g2d.fillRect(1025, 525, 250, 25);
				g2d.fillRect(1200, 350, 50, 175);
				g2d.fillRect(1225, 325, 25, 25);
				g2d.fillRect(1250, 300, 50, 225);
				g2d.fillRect(1300, 400, 25, 100);
				
		//Cheek Blush
				g2d.setColor(Color.pink);
				
				g2d.fillRect(1000, 450, 50,50);
				g2d.fillRect(1275, 450, 50,50);
				
		//Eyes
				g2d.setColor(Color.black);
				
				g2d.fillRect(1050, 400, 50, 50);
				g2d.fillRect(1225, 400, 50,50);
				
				g2d.setColor(Color.white);
				
				g2d.fillRect(1050, 400, 25,25);  /*Inner white*/ 
				g2d.fillRect(1225, 400, 25, 25);  /*Inner white*/ 
				
		//Nose
				g2d.setColor(Color.black);
				
				g2d.fillRect(1175, 425, 25, 25);
				
		//Mouth
				g2d.fillRect(1075, 475, 25, 50);
				g2d.fillRect(1075, 500, 175, 25);
				g2d.fillRect(1150, 475, 25, 50);
				g2d.fillRect(1225, 475, 25, 50);
		
				
						
		
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

		setSize(1600, 900);
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