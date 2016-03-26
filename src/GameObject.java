import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	BufferedImage image;
	Rectangle cbox;

	public GameObject(int x, int y, int width, int height, BufferedImage image) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.image = image;
	}

	void update() {

	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void changeImage(BufferedImage change) {
		this.image = change;
	}

	boolean checkColide(Rectangle cbox) {
return this.cbox.intersects(cbox);
	}
	Rectangle getCbox(){
	return this.cbox;	
	}
}
