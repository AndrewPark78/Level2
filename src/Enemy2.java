import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy2 extends GameObject{
Rectangle enemyBod2;
Rectangle enemyHead2;
public Enemy2(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		enemyBod2 = new Rectangle(x+35, y, 190, 400);
		enemyHead2 = new Rectangle(x+150, y+40, 50, 50);
		// TODO Auto-generated constructor stub
	}

void update(){
	x--;
	enemyBod2.setBounds(x+35, y, 190, 400);
	enemyHead2.setBounds(x+150, y+40, 50, 50);
}
public void paint(Graphics gra){
gra.drawImage(image, x, y, width, height, null);
gra.drawRect((int) enemyBod2.getX(), (int) enemyBod2.getY(), (int) enemyBod2.getWidth(), (int) enemyBod2.getHeight());
gra.drawRect((int) enemyHead2.getX(), (int) enemyHead2.getY(), (int) enemyHead2.getWidth(), (int) enemyHead2.getHeight());
}
}
