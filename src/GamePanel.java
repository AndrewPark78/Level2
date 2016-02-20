import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 0;
	BufferedImage i;
	GameObject go;

	GamePanel() {

		try {
			i = ImageIO.read(this.getClass().getResourceAsStream("revolver.jpg"));
		} catch (Exception ex) {

		}
		go = new GameObject(100, 100, 600, 500, i);
		timer = new Timer(1000 / 60, this);
		timer.start();
	}


	public void paint(Graphics gra) {
		// gra.setColor(Color.BLUE);
		// gra.fillRect(x++, 50, 500, 500);
		go.paint(gra);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();

	}
}