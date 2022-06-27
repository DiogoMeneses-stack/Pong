package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball {

	public int x, y, width = 25, height = 25;
	public int motionX, motionY;
	public Random random;

	public Ball(Pong pong) {
		this.random = new Random();
		this.x = pong.width / 2 - this.width / 2;
		this.y = pong.height / 2 - this.height / 2;

	}

	public void update(Paddle paddle1, Paddle paddle2) {
		if (checkColision(paddle1) == 1) {
			this.motionX = 1;
			this.motionY = -2 + random.nextInt(4);

		} else if (checkColision(paddle2) == 1) {
			this.motionX = -1;
			this.motionY = -2 + random.nextInt(4);
		}

		if (checkColision(paddle1) == 2) {
			paddle2.score++;

		} else if (checkColision(paddle2) == 2) {
			paddle1.score++;
		}

	}

	public int checkColision(Paddle paddle) {

		if (paddle.x > x || paddle.x < x + width) {

			if (paddle.y > y + height || paddle.y + height < y) {

				return 1;// hit

			} else {
				return 2; // wall

			}
		}
		return 0;// nothing
	}

	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, width, height);
	}

}
