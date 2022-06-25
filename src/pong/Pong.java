package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Pong implements ActionListener {

	public static Pong pong;

	public int width = 700, height = 700;

	public Renderer renderer;

	public Paddle player1;

	public Paddle player2;

	public Pong() {

		Timer timer = new Timer(20, this);
		JFrame jframe = new JFrame("Pong");

		renderer = new Renderer();

		jframe.setSize(width, height);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(renderer);

		start();

		timer.start();
	}

	public void start() {
		player1 = new Paddle(this, 1);
		player2 = new Paddle(this, 2);
	}

	public void update() {

	}

	public void render(Graphics g) {

		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);

		player1.render(g);
		player2.render(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();

		renderer.repaint();
	}

	public static void main(String args[]) {
		pong = new Pong();
	}

}