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
	boolean faceR;
	double time;
	boolean startG = true;
	int sX = 500;
	int sXR = 740;
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
		id = 3;
		aKey = false;
		dKey = false;
		cboxWin = new Rectangle(sX, sY, sW, sH);
		cboxLose = new Rectangle(bX, bY, bW, bH);
	}

	void update() {
		if (aKey) {
			faceR = false;
			x-=4;
			sX-=4;
			sXR-=4;
			bX-=4;
			bXR-=4;
			this.changeImage(left);
		}
		if (dKey) {
			faceR = true;
			x+=4;
			sX+=4;
			sXR+=4;
			bX+=4;
			bXR+=4;
			this.changeImage(right);
		}

		if (faceR) {
			cboxWin.setBounds(sXR, sY, sW, sH);
		} else {
			cboxWin.setBounds(sX, sY, sW, sH);
		}
		if (faceR) {
			cboxLose.setBounds(bXR, bY, bW, bH);
		} else {
			cboxLose.setBounds(bX, bY, bW, bH);
		}
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
//		gra.setColor(Color.red);
//		gra.drawRect((int) cboxWin.getX(), (int) cboxWin.getY(), (int) cboxWin.getWidth(), (int) cboxWin.getHeight());
//		gra.drawRect((int) cboxLose.getX(), (int) cboxLose.getY(), (int) cboxLose.getWidth(), (int) cboxLose.getHeight());
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
		if (System.currentTimeMillis() - time >= 500 || startG) {
			startG = false;
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				new Thread(new SoundPlayer("Attack.wav")).start();
				this.changeImage(left);
				faceR = false;
				x -= 50;
				sX -= 50;
				sXR -= 50;
				bX -= 50;
				bXR -= 50;
				time = System.currentTimeMillis();

			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				new Thread(new SoundPlayer("Attack.wav")).start();
				this.changeImage(right);
				faceR = true;
				x += 50;
				sX += 50;
				sXR += 50;
				bX += 50;
				bXR += 50;
				time = System.currentTimeMillis();
			}
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
