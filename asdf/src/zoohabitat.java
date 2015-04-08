
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
		path.addPoint(500, 100);//First Path
		path.addPoint(520, 100);//First Path
		path.addPoint(220, 440);
		path.addPoint(500, 440);
		path.addPoint(725, 100);//Second Path
		path.addPoint(745, 100);//Second Path
		path.addPoint(515, 440);
		path.addPoint(815, 100);//Third Path
		path.addPoint(835, 100);//Third Path
		path.addPoint(550, 440);
		path.addPoint(750, 440);
		path.addPoint(1130, 100);//Fourth Path
		path.addPoint(1150, 100);//Fourth Path
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

		setSize(1600, 900);
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
