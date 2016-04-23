import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameWindow implements KeyListener, ActionListener {
	JFrame frame1;
	JFrame frame2;
	GamePanel panel;
	MenuPanel menu;

	GameObject menuScreen;
	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
		gw.createUI();
	}

	public void createUI() {
		frame1 = new JFrame("Best of Luck!");
		menu = new MenuPanel();
		frame1.addKeyListener(this);
		frame1.setVisible(false);
		frame2 = new JFrame("Home Screen");
		frame2.add(menu);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
		frame2.setSize(500,100);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	

	}
}
