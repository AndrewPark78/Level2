import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 0;
	ArrayList<GameObject> objects;
	BufferedImage i;
	BufferedImage i2;
	BufferedImage i3;
	BufferedImage i4;
	BufferedImage i5;
	GameObject player;
	GameObject enemy;
	GameObject enemy2;
	GameObject backg;
	int spearLoc;

	GamePanel() {
		objects = new ArrayList<GameObject>();

		try {
			i = ImageIO.read(this.getClass().getResourceAsStream("Knight2.png"));
			i2 = ImageIO.read(this.getClass().getResourceAsStream("Smorc.png"));
			i3 = ImageIO.read(this.getClass().getResourceAsStream("wall.jpg"));
			i4 = ImageIO.read(this.getClass().getResourceAsStream("Knight2-Right.png"));
			i5 = ImageIO.read(this.getClass().getResourceAsStream("RightAttack.png"));
		} catch (Exception ex) {
		}
		timer = new Timer(1000 / 60, this);
		timer.start();
		player = new Playa(500, 500, 300, 300, i);
		((Playa)player).loadBoth(i, i4);
		enemy = new Enemy(x, 500, 300, 300, i2);
		enemy2 = new Enemy(x+2500, 500, 300, 300, i2);
		backg = new GameObject(0, 0, 2000, 1000, i3);
		objects.add(backg);
		objects.add(player);
		objects.add(enemy);
		objects.add(enemy2);
		for (int i = 0; i < 10; i++) {
			objects.add(new Enemy(x - 300, 500, 300, 300, i2));
			objects.add(new Enemy2(x + 2200, 500, 300, 300, i5));
		}
	}

	public void paintComponent(Graphics gra) {

		for (GameObject go : objects) {
			go.paint(gra);
		}
	}

	void update() {
		for (GameObject go : objects) {
			go.update();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
		repaint();

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		player.keyTyped(e);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		player.keyPressed(e);
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		player.keyReleased(e);
	}
}