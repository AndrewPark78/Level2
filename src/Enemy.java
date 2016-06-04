import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends GameObject {
	public boolean ended = false;

	public Enemy(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		id = 1;
		cboxLose = new Rectangle(x + 35, y, 190, 400);
		cboxWin = new Rectangle(x + 105, y + 40, 50, 50);
	}

	void update() {
		//while(!ended){
		if(GamePanel.score > 100){
			x+=7;
		}else{
		x+=6;
		}
		cboxLose.setBounds(x + 35, y, 190, 400);
		cboxWin.setBounds(x + 105, y + 40, 50, 50);
		//}
	}

	public void paint(Graphics gra) {
		gra.drawImage(image, x, y, width, height, null);
//		gra.drawRect((int) cboxLose.getX(), (int) cboxLose.getY(), (int) cboxLose.getWidth(),
//				(int) cboxLose.getHeight());
//		gra.drawRect((int) cboxWin.getX(), (int) cboxWin.getY(), (int) cboxWin.getWidth(), (int) cboxWin.getHeight());
	}
}
