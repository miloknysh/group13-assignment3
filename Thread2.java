public class Thread2 implements Runnable{

	Music block;

	String[] songs = {"re.wav", "fa.wav", "la.wav"};

	public Thread2(Music block){
		this.block = block;
		new Thread(this).start();
	}

	@Override
	public void run(){

		for (int i=0; i<songs.length; i++){
			block.secondTone(songs[i]);
		}

		try{
			Thread.sleep(1550);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		block.lastTone("do-octave.wav");

	}

	
}