
import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {

	void doDrawing(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 1600, 900);
		g.setColor(Color.lightGray);

		Polygon path = new Polygon();
		path.addPoint(0, 440);
		path.addPoint(200, 440);
		path.addPoint(500, 50);//First Path
		path.addPoint(520, 50);//First Path
		path.addPoint(220, 440);
		path.addPoint(500, 440);
		path.addPoint(725, 50);//Second Path
		path.addPoint(745, 50);//Second Path
		path.addPoint(515, 440);
		path.addPoint(815, 50);//Third Path
		path.addPoint(835, 50);//Third Path
		path.addPoint(550, 440);
		path.addPoint(750, 440);
		path.addPoint(1130, 45);//Fourth Path
		path.addPoint(1150, 45);//Fourth Path
		path.addPoint(780, 440);

		path.addPoint(1600, 440);
		path.addPoint(1600, 460);
		path.addPoint(0, 460);

		g.fillPolygon(path);
		
		g.fillRect(75, 40, 20, 400);//First rectangular path
		g.fillRect(210, 40, 20, 390);//Second Rectangular path
		g.fillRect(470, 40, 20, 50);//Third Rectangular Path
		g.fillRect(850, 40, 20, 300);//Fourth Rectangular Path
		g.fillRect(920, 40 , 20, 230);//Fifth Rectangular Path
		g.fillRect(1000, 40, 20, 145);//Sixth Rectangular Path
		g.fillRect(1200, 40 , 20 , 400);

	}

	//

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}

public class zoohabitat extends JFrame {

	public zoohabitat() {
		initUI();
	}

	public final void initUI() {

		DrawPanel dpnl = new DrawPanel();
		add(dpnl);

		setSize(1600, 900);
		setTitle("");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				zoohabitat ex = new zoohabitat();
				ex.setVisible(true);
			}
		});
	}
}
