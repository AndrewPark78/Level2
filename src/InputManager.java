import java.awt.event.KeyEvent;

public class InputManager {
	public static boolean LEFT_ARROW_KEY = false;
	public static void keyPressed(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_LEFT){
	   		 LEFT_ARROW_KEY = true;
	   	 }
	}

	public static void keyReleased(KeyEvent e) {
		LEFT_ARROW_KEY = true;
	}

	public static void keyTyped(KeyEvent e){}
	
}
