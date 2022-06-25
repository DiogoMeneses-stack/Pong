package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

	public int paddleNumber;
	public int x, y, width = 100, height = 500;
	public int score;

	public Paddle(Pong pong, int paddleNumber) {

		this.paddleNumber = paddleNumber;

		if (paddleNumber == 1) {
			this.x = width;
		}
		if (paddleNumber == 2) {
			this.x = pong.width - width;
		}
		this.y = pong.height / 2 - this.height / 2;
	}

	public void render(Graphics g) {

		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}

}
