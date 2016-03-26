import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameWindow implements KeyListener{
	JFrame frame;
	GamePanel panel;

	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
		gw.createUI();
	}

	public void createUI() {
		frame = new JFrame("Best of Luck!");
		frame.addKeyListener(this);
		panel = new GamePanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(2000, 1000);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyTyped(e);
		panel.keyTyped(e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyPressed(e);
		panel.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyReleased(e);
		panel.keyReleased(e);
	}

}
