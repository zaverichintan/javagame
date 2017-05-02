package kiloboltgame;

import java.io.*;
import sun.audio.*;
import javax.sound.sampled.*;

public class JavaAudioExample {
	  public static void main(String[] args){
		soundPlay("/home/zaverichintan/Chintan/Onlinetutorials/javagame/javagame/src/data/menutheme.mp3");  
		
	  }
		public static void soundPlay(String filename)
		{
		    try
		    {
		        Clip clip = AudioSystem.getClip();
		        clip.open(AudioSystem.getAudioInputStream(new File(filename)));
		        clip.start();
		    }
		    catch (Exception exc)
		    {
		        exc.printStackTrace(System.out);
		    }
		}
}
