public class Thread1 implements Runnable{

	Music m;

	String[] songs = {"do.wav", "mi.wav", "sol.wav", "si.wav"};

	public Thread1(Music m1){
		m = m1;
		new Thread(this).start();
	}

	@Override
	public void run(){

		for (int i=0; i<songs.length; i++){
			m.firstTone(songs[i]);
		}

		//player.play("do-octave.wav");
		

	}

	
}