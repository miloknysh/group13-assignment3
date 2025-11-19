public class T1 implements Runnable{
	
	Twinkle block;

	String[][] sounds = {{"do.wav", "do.wav", "sol.wav", "sol.wav"}, {"sol.wav"},{"mi.wav", "mi.wav"}, {"do.wav", "sol.wav", "sol.wav"},{"mi.wav", "mi.wav"},
		{"sol.wav", "sol.wav"}, {"mi.wav", "mi.wav"}, {"do.wav", "do.wav", "sol.wav", "sol.wav"},{"sol.wav"}, {"mi.wav", "mi.wav"}, {"do.wav"}};

	public T1(Twinkle block){
		this.block = block;
		new Thread(this).start();
	}

	@Override
	public void run(){
		for (int i=0; i<sounds.length; i++){
			block.firstSection(sounds[i]);
		}
	}


}


//do do sol sol
//sol
//mi mi 
//do sol sol 
//mi mi 
//sol sol
//mi mi 
//do do sol sol 
//sol
//mi mi 
//do