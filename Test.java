import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Test{
	
	public static void main(String[] args){

		FilePlayer music = new FilePlayer();
		music.play("do.wav");
		music.play("mi.wav");
		music.play("sol.wav");
		music.play("si.wav");
		music.play("do-octave.wav");
		
	}
}