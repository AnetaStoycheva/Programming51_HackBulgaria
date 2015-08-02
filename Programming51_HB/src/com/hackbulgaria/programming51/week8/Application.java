package com.hackbulgaria.programming51.week8;

import javax.swing.JFrame;

public class Application extends JFrame {

	public Application() {
		super.add(new Canvas());  // moje i bez super

		setResizable(false);
		super.pack(); // moje i bez super

		setTitle("My application name");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}
