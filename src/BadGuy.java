import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class BadGuy extends GameObject {
	boolean neverRoared = true;

	public BadGuy(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);

	}

	void update() {
		if ((GamePanel.score >= 10) && neverRoared) {
			new Thread(new SoundPlayer("Roar1.wav")).start();
			System.out.println("ROAR");
			neverRoared = false;
		}
		if (GamePanel.lose = true) {
			//badguy.x = playa.x;
		}
	}
}
