import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends GameObject {
	Rectangle enemyBod;

	public Enemy(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		enemyBod = new Rectangle(x+35, y, 190, 400);
	}

	void update() {
		x++;
		enemyBod.setBounds(x+35, y, 190, 400);
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
		gra.drawRect((int) enemyBod.getX(), (int) enemyBod.getY(), (int) enemyBod.getWidth(), (int) enemyBod.getHeight());
	}
}
