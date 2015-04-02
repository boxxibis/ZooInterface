/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class Zoo extends JPanel implements ActionListener {
	protected JButton b1, b2, b3, b4;

	public Zoo() {
		ImageIcon importNarwhal = new ImageIcon(
				new File("images/narwhal.jpg").getAbsolutePath());
		ImageIcon importNyanCat = new ImageIcon(
				new File("images/NYAN_CAT.jpg").getAbsolutePath());
		ImageIcon importMouse = new ImageIcon(
				new File("images/mouse.jpg").getAbsolutePath());
		ImageIcon importStingray = new ImageIcon(
				new File("images/stingray.jpg").getAbsolutePath());

		Image sizingNarwhal = importNarwhal.getImage().getScaledInstance(100,
				100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon narwhal = new ImageIcon(sizingNarwhal);
		b1 = new JButton("Narwhal", narwhal);
		b1.setVerticalTextPosition(AbstractButton.TOP);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		b1.setMnemonic(KeyEvent.VK_D);
		b1.setActionCommand("openNarwhal");

		Image sizingNyanCat = importNyanCat.getImage().getScaledInstance(100,
				100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon NyanCat = new ImageIcon(sizingNyanCat);
		b2 = new JButton("Nyan Cat", NyanCat);
		b2.setVerticalTextPosition(AbstractButton.TOP);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		b2.setMnemonic(KeyEvent.VK_M);
		b2.setActionCommand("openNyanCat");

		Image sizingMouse = importMouse.getImage().getScaledInstance(100, 100,
				java.awt.Image.SCALE_SMOOTH);
		ImageIcon mouse = new ImageIcon(sizingMouse);
		b3 = new JButton("Mouse", mouse);
		b3.setVerticalTextPosition(AbstractButton.TOP);
		b3.setHorizontalTextPosition(AbstractButton.TRAILING);
		b3.setMnemonic(KeyEvent.VK_X);
		b3.setActionCommand("openMouse");

		Image sizingStingray = importStingray.getImage().getScaledInstance(100,
				100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon stingray = new ImageIcon(sizingStingray);
		b4 = new JButton("Stingray", stingray);
		b4.setVerticalTextPosition(AbstractButton.CENTER);
		b4.setHorizontalTextPosition(AbstractButton.TRAILING);
		b4.setMnemonic(KeyEvent.VK_Y);
		b4.setActionCommand("openStingray");

		// Listen for actions on buttons 1 and 3.
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		// b1.setToolTipText("Click this button to disable the middle button.");
		// b2.setToolTipText("This middle button does nothing when you click it.");
		// b3.setToolTipText("Click this button to enable the middle button.");

		// Add Components to this container, using the default FlowLayout.
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}

	// ////////////////THIS IS WHERE ACTION COMMANDS
	// ARE////////////////////////////
	public void actionPerformed(ActionEvent e) {
		if ("openNarwhal".equals(e.getActionCommand())) {
			Animal animal = new Animal();
			animal.go();
			animal.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		}
		if ("openNyanCat".equals(e.getActionCommand())) {
			new Cat2().go();
		}

		if ("openMouse".equals(e.getActionCommand())) {
			new MouseLOL().go();
		}

		if ("openStingray".equals(e.getActionCommand())) {
			new jstingra().go();
		}
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = Zoo.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {

		// Create and set up the window.
		JFrame ZFrame = new JFrame("Zoo");
		ZFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		Zoo newContentPane = new Zoo();
		newContentPane.setOpaque(true); // content panes must be opaque
		ZFrame.setContentPane(newContentPane);

		// Display the window.
		ZFrame.pack();
		ZFrame.setVisible(true);
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
		}

	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				zoohabitat ex = new zoohabitat();
				ex.setVisible(true);

			}
		});
	}
}