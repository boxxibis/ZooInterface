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
	protected JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	DrawPanel zooh = new DrawPanel();
	
	private static Cat2 cat2;
	private static Animal narwhal3;
	private static MouseLOL suckymouse;
	private static jstingra stingray29;
	private static Shark sharkkk;
	private static piggy piggyyy;
	private static puma pumaaa;
	private static MOVINGGRADIENTBEAR bearrr;//annoying to type the type
	private static dinothing dinooo;
	private static Penguin penguinnn;
	
	public Zoo() {
		
		//Imports all Images
		ImageIcon importNarwhal = new ImageIcon(
				new File("images/narwhal.jpg").getAbsolutePath());
		ImageIcon importNyanCat = new ImageIcon(
				new File("images/NYAN_CAT.jpg").getAbsolutePath());
		ImageIcon importMouse = new ImageIcon(
				new File("images/mouse.jpg").getAbsolutePath());
		ImageIcon importStingray = new ImageIcon(
				new File("images/stingray.jpg").getAbsolutePath());
		ImageIcon importPig = new ImageIcon(
				new File("images/pig.jpg").getAbsolutePath());
		ImageIcon importShark = new ImageIcon(
				new File("images/shark.jpg").getAbsolutePath());
		ImageIcon importPuma = new ImageIcon(
				new File("images/puma.jpg").getAbsolutePath());
		ImageIcon importBear = new ImageIcon(
				new File("images/bear.jpg").getAbsolutePath());
		ImageIcon importDino = new ImageIcon(
				new File("images/dino.jpg").getAbsolutePath());
		ImageIcon importPenguin = new ImageIcon(
				new File("images/penguin.jpg").getAbsolutePath());
	
		Image sizingNarwhal = importNarwhal.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes Image
		ImageIcon narwhal = new ImageIcon(sizingNarwhal);//Converts to Image Icon
		b1 = new JButton("Narwhal", narwhal);//Gives the Button the icon
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		b1.setMnemonic(KeyEvent.VK_D);
		b1.setActionCommand("openNarwhal");

		Image sizingNyanCat = importNyanCat.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon NyanCat = new ImageIcon(sizingNyanCat);//Converts to Icon
		b2 = new JButton("Nyan Cat", NyanCat);//Uses Icon
		b2.setVerticalTextPosition(AbstractButton.CENTER);
		b2.setHorizontalTextPosition(AbstractButton.LEADING);
		b2.setMnemonic(KeyEvent.VK_M);
		b2.setActionCommand("openNyanCat");

		Image sizingMouse = importMouse.getImage().getScaledInstance(50, 50,
				java.awt.Image.SCALE_SMOOTH);//Sizes Image
		ImageIcon mouse = new ImageIcon(sizingMouse);//Converts to Icon
		b3 = new JButton("Mouse", mouse);//Uses icon
		b3.setVerticalTextPosition(AbstractButton.CENTER);
		b3.setHorizontalTextPosition(AbstractButton.LEADING);
		b3.setMnemonic(KeyEvent.VK_X);
		b3.setActionCommand("openMouse");

		Image sizingStingray = importStingray.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon stingray = new ImageIcon(sizingStingray);//Converts to Icon
		b4 = new JButton("Stingray", stingray);//Uses icon
		b4.setVerticalTextPosition(AbstractButton.CENTER);
		b4.setHorizontalTextPosition(AbstractButton.TRAILING);
		b4.setMnemonic(KeyEvent.VK_Y);
		b4.setActionCommand("openStingray");
		
		Image sizingShark = importShark.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon shark = new ImageIcon(sizingShark);//Converts to Icon
		b5 = new JButton("Shark", shark);//Uses icon
		b5.setVerticalTextPosition(AbstractButton.CENTER);
		b5.setHorizontalTextPosition(AbstractButton.TRAILING);
		b5.setMnemonic(KeyEvent.VK_Y);
		b5.setActionCommand("openShark");
		
		Image sizingPig = importPig.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon pig = new ImageIcon(sizingPig);//Converts to Icon
		b6 = new JButton("Pig", pig);//Uses icon
		b6.setVerticalTextPosition(AbstractButton.CENTER);
		b6.setHorizontalTextPosition(AbstractButton.TRAILING);
		b6.setMnemonic(KeyEvent.VK_Y);
		b6.setActionCommand("openPig");
		
		
		
		Image sizingPuma = importPuma.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon puma = new ImageIcon(sizingPuma);//Converts to Icon
		b7 = new JButton("Puma", puma);//Uses icon
		b7.setVerticalTextPosition(AbstractButton.CENTER);
		b7.setHorizontalTextPosition(AbstractButton.TRAILING);
		b7.setMnemonic(KeyEvent.VK_Y);
		b7.setActionCommand("openPuma");
		
		Image sizingBear = importBear.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon bear = new ImageIcon(sizingBear);//Converts to Icon
		b8 = new JButton("Bear", bear);//Uses icon
		b8.setVerticalTextPosition(AbstractButton.CENTER);
		b8.setHorizontalTextPosition(AbstractButton.TRAILING);
		b8.setMnemonic(KeyEvent.VK_Y);
		b8.setActionCommand("openBear");
		
		Image sizingDino = importDino.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon dino = new ImageIcon(sizingDino);//Converts to Icon
		b9 = new JButton("Dino-Thing", dino);//Uses icon
		b9.setVerticalTextPosition(AbstractButton.CENTER);
		b9.setHorizontalTextPosition(AbstractButton.TRAILING);
		b9.setMnemonic(KeyEvent.VK_Y);
		b9.setActionCommand("openDino");
		
		Image sizingPenguin = importPenguin.getImage().getScaledInstance(50,
				50, java.awt.Image.SCALE_SMOOTH);//Sizes image
		ImageIcon penguin = new ImageIcon(sizingPenguin);//Converts to Icon
		b10 = new JButton("Penguin", penguin);//Uses icon
		b10.setVerticalTextPosition(AbstractButton.CENTER);
		b10.setHorizontalTextPosition(AbstractButton.TRAILING);
		b10.setMnemonic(KeyEvent.VK_Y);
		b10.setActionCommand("openPenguin");
		

		// Listen for actions on buttons 1 and 3.
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);

		 b1.setToolTipText("Click this button for a narwhal.");
		 b2.setToolTipText("Click this button for a Nyan Cat.");
		 b3.setToolTipText("Click this button for a Mouse.");
		 b4.setToolTipText("Click this button for a stingray.");
		 b5.setToolTipText("Click this button for a shark.");
		 b6.setToolTipText("Click this button for a pig.");
		 b7.setToolTipText("Click this button for a puma.");
		 b8.setToolTipText("Click this button for a bear.");
		 b9.setToolTipText("Click this button for a dino-thing.");
		 b10.setToolTipText("Click this button for a penguin.");

		// Add Components to this container, using the default FlowLayout.
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		
		cat2 = new Cat2();
		narwhal3 = new Animal();
		suckymouse = new MouseLOL();
		stingray29 =  new jstingra();
		sharkkk =  new Shark();
		piggyyy = new piggy();
		pumaaa = new puma();
		bearrr = new MOVINGGRADIENTBEAR();//still annoying
		dinooo = new dinothing();
		penguinnn = new Penguin();
		
		new Thread(updater).start();
		
	}
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		zooh.doDrawing(g);
		
	}

	// ////////////////THIS IS WHERE ACTION COMMANDS
	// ARE////////////////////////////
	public void actionPerformed(ActionEvent e) {
		if ("openNarwhal".equals(e.getActionCommand())) {
			narwhal3.go();

		}
		if ("openNyanCat".equals(e.getActionCommand())) {
			cat2.go();
		}

		if ("openMouse".equals(e.getActionCommand())) {
			suckymouse.go();
		}

		if ("openStingray".equals(e.getActionCommand())) {
			stingray29.go();
		}
		
		
		if ("openShark".equals(e.getActionCommand())) {
			sharkkk.go();
			
		}
		
		if("openPig".equals(e.getActionCommand())) {
			piggyyy.go();
		}
		
		if("openPuma".equals(e.getActionCommand())) {
			pumaaa.go();
		}
		
		if("openBear".equals(e.getActionCommand())) {
			bearrr.go();
		}
		
		if("openDino".equals(e.getActionCommand())) {
			dinooo.go();
		}
		
		if("openPenguin".equals(e.getActionCommand())) {
			penguinnn.go();
		}
	}
	
	private Runnable updater = new Runnable() {
		public void run() {
			while(true){
				narwhal3.moveIt();
				cat2.moveIt();
				suckymouse.moveIt();
				stingray29.moveIt();
				sharkkk.moveIt();
				piggyyy.moveIt();
				pumaaa.moveIt();
				bearrr.moveIt();
				dinooo.moveIt();
				penguinnn.moveIt();
				
			}
		}
	};
	
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
		ZFrame.setSize(1599,899);
		ZFrame.setVisible(true);
		//System.out.println("WasuUUUUP");
		
		

	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				//zoohabitat ex = new zoohabitat();
				//ex.setVisible(true);

			}
		});
	}
}