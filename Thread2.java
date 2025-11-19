public class Thread2 implements Runnable{

	Music m;

	String[] songs = {"re.wav", "fa.wav", "la.wav"};

	public Thread2(Music m2){
		m = m2;
		new Thread(this).start();
	}

	@Override
	public void run(){

		for (int i=0; i<songs.length; i++){
			m.secondTone(songs[i]);
		}
		
		//player.play("do-octave.wav");

	}

	
}