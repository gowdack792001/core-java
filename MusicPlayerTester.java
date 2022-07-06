class MusicPlayerTester{


public static void main(String a[]){



MusicPlayer m = new  MusicPlayer();

			m.setname("JBL");
			m.setplayerType("record player");
			m.setmaxVolume(10);
			m.setmaxSoundLevel(120);
			
			System.out.println(m.getname() + " " + m.getplayerType() + " " + m.getmaxVolume() + " " + m.getmaxSoundLevel());




}




}