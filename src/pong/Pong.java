package pong;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Pong {

	public static Pong pong;

	public int width = 700, height = 700;

	public Pong() {
		JFrame jframe = new JFrame("Pong");

		jframe.setSize(width, height);
		jframe.setVisible(true);
	}

	public static void main(String args[]) {
		pong = new Pong();
	}

	public void render(Graphics g) {

	}
}