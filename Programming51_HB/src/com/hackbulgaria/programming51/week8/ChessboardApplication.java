package com.hackbulgaria.programming51.week8;

import javax.swing.JFrame;

public class ChessboardApplication extends JFrame {

	public ChessboardApplication() {
		super.add(new Chessboard());  // kazvame na app-a da raboti s chessboard

		setResizable(false);
		super.pack(); // moje i bez super

		setTitle("A strange chessboard");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		ChessboardApplication app = new ChessboardApplication();
		app.setVisible(true);
	}
}
