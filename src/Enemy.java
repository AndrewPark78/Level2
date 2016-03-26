import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends GameObject {
	Rectangle enemyHead;
	public Enemy(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		cbox = new Rectangle(x+35, y, 190, 400);
		enemyHead = new Rectangle(x+105, y+40, 50, 50);
	}

	void update() {
		x++;
		cbox.setBounds(x+35, y, 190, 400);
		enemyHead.setBounds(x+105, y+40, 50, 50);
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
		gra.drawRect((int) cbox.getX(), (int) cbox.getY(), (int) cbox.getWidth(), (int) cbox.getHeight());
		gra.drawRect((int) enemyHead.getX(), (int) enemyHead.getY(), (int) enemyHead.getWidth(), (int) enemyHead.getHeight());
	}
}
