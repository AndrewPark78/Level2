import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameWindow implements KeyListener, ActionListener {
	JFrame frame;
	GamePanel panel;
	MenuPanel menu;
	// GamePanel menuImage;
	JButton start;
	JButton instructions;
	BufferedImage i6;

	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
		gw.createUI();
	}

	public void createUI() {
		try {
			i6 = ImageIO.read(this.getClass().getResourceAsStream("menuScreen.png"));
		} catch (Exception ex) {
			System.out.println("Printing");
		}
		frame = new JFrame("Best of Luck!");
		start = new JButton("Start");
		start.addActionListener(this);
		instructions = new JButton("Instructions");
		instructions.addActionListener(this);
		JPanel menuImage = new JPanel() {
			public void paintComponent(Graphics gra) {
				gra.drawImage(i6, 0, 0, 500, 300, null);
			}
		};
		frame.add(menuImage);
		menu = new MenuPanel();
		menu.add(start);
		menu.add(instructions);
		frame.add(menu);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		panel.keyTyped(e);
		// System.out.println("Moving");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
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
		if (e.getSource().equals(start)) {
			panel = new GamePanel();
			frame.remove(menu);
			frame.setFocusable(false);
			panel.setFocusable(true);
			panel.addKeyListener(this);
			panel.requestFocusInWindow();
			// System.out.println(frame.getKeyListeners());
			frame.repaint();
			frame.add(panel);
			panel.requestFocus();
			frame.repaint();
			frame.setSize(2000, 1000);
		}
		if (e.getSource().equals(instructions)) {
			JOptionPane.showMessageDialog(null, "To play this game");
		}
	}
}