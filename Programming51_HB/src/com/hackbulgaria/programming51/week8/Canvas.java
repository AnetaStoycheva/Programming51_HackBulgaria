package com.hackbulgaria.programming51.week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	public final int WIDTH = 800;
	public final int HEIGHT = 800;

	public static int HALF = 400;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);  //  vajno, za da se narisuva!

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D.Double upLeftSquare = new Rectangle2D.Double(0, 0, HALF, HALF);
		Rectangle2D.Double upRightSquare = new Rectangle2D.Double(400, 0, HALF, HALF);
		Rectangle2D.Double downLeftSquare = new Rectangle2D.Double(0, 400, HALF, HEIGHT);
		Rectangle2D.Double downRightSquare = new Rectangle2D.Double(400, 400, HALF, HEIGHT);
		
		g2.setPaint(Color.GREEN);
		g2.fill(upLeftSquare);
		
		g2.setPaint(Color.BLACK);
		g2.fill(upRightSquare);
		
		g2.setPaint(Color.MAGENTA);
		g2.fill(downLeftSquare);
		
		g2.setPaint(Color.CYAN);
		g2.fill(downRightSquare);
	}

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
