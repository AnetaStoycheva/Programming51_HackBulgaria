package com.hackbulgaria.programming51.week8;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Chessboard extends JPanel {

	public static int WIDTH = 800;
	public static int HEIGHT = 800;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		int squareX = 0;
		int squareY = 0;
		int squareSize = 40;
		int counterSwitch = 0;

		for (int i = 0; i < 20; i++) {
			counterSwitch = i % 2; // for the correct black and white places
			
			for (int j = 0; j < 20; j++) {
				Rectangle2D.Double square = new Rectangle2D.Double(squareX, squareY, squareSize, squareSize);
				
//				System.out.println(squareX + ", " + squareY);
				
				if (counterSwitch % 2 == 0) {
					g2.setPaint(Color.BLACK);
				} else {
					g2.setPaint(Color.WHITE);
				}
				g2.fill(square);
				counterSwitch++;
				squareX = squareX + squareSize;
			}
			squareX = 0;
			squareY = squareY + squareSize;
		}
	}

	public Chessboard() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
