import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy2 extends GameObject {


	public Enemy2(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		id = 2;
		cboxLose = new Rectangle(x + 35, y, 190, 400);
		cboxWin = new Rectangle(x + 150, y + 40, 50, 50);
	}

	void update() {
		x--;
		cboxLose.setBounds(x + 35, y, 190, 400);
		cboxWin.setBounds(x + 150, y + 40, 50, 50);
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
		gra.drawRect((int) cboxLose.getX(), (int) cboxLose.getY(), (int) cboxLose.getWidth(),
				(int) cboxLose.getHeight());
		gra.drawRect((int) cboxWin.getX(), (int) cboxWin.getY(), (int) cboxWin.getWidth(), (int) cboxWin.getHeight());
	}
}
