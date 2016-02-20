import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class GameObject {
int x;
int y;
int width;
int height;
BufferedImage image;
public GameObject(int x, int y, int width, int height, BufferedImage image){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.image = image;
}
void update(){
	
}
public void paint(Graphics gra){
gra.drawImage(image, x, y, width, height, null);

}

}
