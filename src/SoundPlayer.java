import java.io.File;
import java.io.InputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer implements Runnable {
	String file = "";

	SoundPlayer(String f) {
		this.file = f;
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			File sound = new File(file);
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (Exception e) {
			System.out.println("Err");
		}
	}
}