import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class BadGuy extends GameObject {
	boolean neverRoared = true;

	public BadGuy(int x, int y, int width, int height, BufferedImage image) {
		super(700, -375, width, height, image);

	}

	public void update() {
		if ((GamePanel.score >= 100) && neverRoared) {
			id = 10;
			new Thread(new SoundPlayer("Roar1.wav")).start();
			System.out.println("ROAR");
			neverRoared = false;
		}
		if ((GamePanel.score >= 100) && y < 50) {
			super.y++;
		}
		if ((GamePanel.lose == true) && (x > Playa.x - 100)) {
			super.x--;
		}
		if ((GamePanel.lose == true) && (x < Playa.x - 100)) {
			super.x++;
		}
		if ((GamePanel.lose == true) && (y < Playa.y - 250)) {
			super.y++;
		}
		if ((GamePanel.lose == true) && (y > Playa.y - 250)) {
			super.y--;
		}
		if((GamePanel.score == 200) || (GamePanel.score == 201)){
			if(super.height > 0){
				super.height --;
			}
			if(super.width > 0){
			super.width -- ;
			}
		}

		// if (GamePanel.lose = true) {
		// //badguy.x = playa.x;
		// }

	}
}
