public class Task1{

	public static void main(String[] args){

		Music music = new Music();

		new Thread1(music);
		new Thread2(music);

	}
}