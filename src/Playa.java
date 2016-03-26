import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Playa extends GameObject {
	boolean aKey;
	boolean dKey;
	BufferedImage left;
	BufferedImage right;
	Rectangle spear;
	boolean faceR;
	int sX = 500;
	int sXR = 700;
	int sY = 550;
	int sW = 90;
	int sH = 25;

	int bX = 600;
	int bXR = 550;
	int bY = 550;
	int bW = 160;
	int bH = 300;

	public Playa(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		aKey = false;
		dKey = false;
		spear = new Rectangle(sX, sY, sW, sH);
		cbox = new Rectangle(bX, bY, bW, bH);
	}

	void update() {
		if (aKey) {
			faceR = false;
			x--;
			sX--;
			sXR--;
			bX--;
			bXR--;
			this.changeImage(left);
		}
		if (dKey) {
			faceR = true;
			x++;
			sX++;
			sXR++;
			bX++;
			bXR++;
			this.changeImage(right);
		}

		if (faceR) {
			spear.setBounds(sXR, sY, sW, sH);
		} else {
			spear.setBounds(sX, sY, sW, sH);
		}
		if (faceR) {
			cbox.setBounds(bXR, bY, bW, bH);
		} else {
			cbox.setBounds(bX, bY, bW, bH);
		}
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
		gra.setColor(Color.red);
		gra.drawRect((int) spear.getX(), (int) spear.getY(), (int) spear.getWidth(), (int) spear.getHeight());
		gra.drawRect((int) cbox.getX(), (int) cbox.getY(), (int) cbox.getWidth(), (int) cbox.getHeight());
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aKey = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dKey = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.changeImage(left);
			faceR = false;
			x -= 15;
			sX -= 15;
			sXR -= 15;
			bX -= 15;
			bXR -= 15;

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.changeImage(right);
			faceR = true;
			x += 15;
			sX += 15;
			sXR += 15;
			bX += 15;
			bXR += 15;

		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_A) {
			aKey = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			dKey = false;
		}
	}

	public void loadBoth(BufferedImage i, BufferedImage i4) {
		this.left = i;
		this.right = i4;
	}
}
