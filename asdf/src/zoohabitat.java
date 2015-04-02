
import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {

	private void doDrawing(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 1600, 900);
		g.setColor(Color.lightGray);

		Polygon path = new Polygon();
		path.addPoint(0, 440);
		path.addPoint(200, 440);
		path.addPoint(150, 220);
		path.addPoint(170, 220);
		path.addPoint(220, 440);
		path.addPoint(500, 440);
		path.addPoint(400, 220);
		path.addPoint(430, 220);
		path.addPoint(515, 390);
		path.addPoint(570, 220);
		path.addPoint(600, 220);
		path.addPoint(550, 440);
		path.addPoint(750, 440);
		path.addPoint(850, 220);
		path.addPoint(880, 220);
		path.addPoint(780, 440);

		path.addPoint(1600, 440);
		path.addPoint(1600, 460);
		path.addPoint(0, 460);

		g.fillPolygon(path);

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

		setSize(360, 300);
		setTitle("Rectangles");
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
