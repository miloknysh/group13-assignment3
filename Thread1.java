public class Thread1 implements Runnable{

	Music block;

	String[] songs = {"do.wav", "mi.wav", "sol.wav", "si.wav"};

	public Thread1(Music block){
		this.block = block;
		new Thread(this).start();
	}

	@Override
	public void run(){

		for (int i=0; i<songs.length; i++){
			block.firstTone(songs[i]);
		}

		//try{
		//	Thread.sleep(200);
		//} catch (InterruptedException e){
		//	e.printStackTrace();
		//}

		block.lastTone("do-octave.wav");
		

	}

	
}