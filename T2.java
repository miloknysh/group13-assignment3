public class T2 implements Runnable{

	Twinkle block;

	String[][] sounds = {{"la.wav", "la.wav"}, {"fa.wav", "fa.wav"}, {"re.wav", "re.wav"}, {"fa.wav", "fa.wav"}, {"re.wav"}, {"fa.wav", "fa.wav"}, 
	{"re.wav"}, {"la.wav", "la.wav"}, {"fa.wav", "fa.wav"}, {"re.wav", "re.wav"}};

	public T2(Twinkle block){
		this.block = block;
		new Thread(this).start();
	}

	@Override
	public void run(){
		for (int i=0; i<sounds.length; i++){
			block.secondSection(sounds[i]);
		}
	}
	
}

//re, fa, la

//la la
//fa fa 
//re re
//fa fa 
//re 
//fa fa 
//re 
//la la @
//fa fa 
//re re do