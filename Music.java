public class Music{

	boolean flag = false;

	FilePlayer player = new FilePlayer();

	public synchronized void firstTone(String song){
		if (flag){
			try{
				wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}

		player.play(song);
		flag = true;
		notify();
	}

	public synchronized void secondTone(String song){
		if (!flag){
			try{
				wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}

		player.play(song);
		flag = false;
		notify();
	}
	
}