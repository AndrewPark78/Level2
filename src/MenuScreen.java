import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MenuScreen extends GameObject{
	public MenuScreen(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		// TODO Auto-generated constructor stub
	}
	public void paint(Graphics gra){
		gra.drawImage(image, 0, 0, width, height, null);

	}
}
