public class Twinkle{
	
	boolean flag = false;

	FilePlayer player = new FilePlayer();

	public synchronized void firstSection(String[] song){

		if (flag){
			try{
				wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}

		for (int i=0; i<song.length; i++){
			player.play(song[i]);
		}
		flag = true;
		notify();

	}

	public synchronized void secondSection(String[] song){

		if (!flag){
			try{
				wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}

		for (int i=0; i<song.length; i++){
			player.play(song[i]);
		}
		flag = false;
		notify();
	}
}