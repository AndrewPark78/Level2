import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Enemy2 extends GameObject{

	public Enemy2(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		// TODO Auto-generated constructor stub
	}

void update(){
	x--;
}
public void paint(Graphics gra){
gra.drawImage(image, x, y, width, height, null);

}
}