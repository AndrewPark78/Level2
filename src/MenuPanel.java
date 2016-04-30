import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MenuPanel extends JPanel implements ActionListener {
	BufferedImage i6;
	JButton start;
	JButton instructions;
	MenuScreen menuScreen;

	MenuPanel() {

		try {
			i6 = ImageIO.read(this.getClass().getResourceAsStream("menuScreen"));
		} catch (Exception ex) {
		}
		menuScreen = new MenuScreen(0, 0, 800, 300, i6);
		start = new JButton();
		start.addActionListener(this);
		instructions = new JButton();
		instructions.addActionListener(this);
		repaint();
	}

	public void paintComponent(Graphics gra) {
		gra.drawImage(i6, 0, 0,500,300,null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if (e.getSource().equals(start)) {
//			panel = new GamePanel();
//			frame1.add(panel);
//			frame1.setSize(2000, 1000);
//			frame2.setVisible(false);
//			frame1.setVisible(true);
//		}
		if (e.getSource().equals(instructions)) {
			JOptionPane.showMessageDialog(null, "The object of the game is to");
		}
	}

}
