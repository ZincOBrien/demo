//package Exceptions;


//musical Instrument Digital Interface
import javax.sound.midi.*;

public class MusicTest1
{

	// first get a squencer object takes in the midi data
	// and sends it to the right place it plays the music
public void play()
{
	//getSequencer() check the Oracle docs to determine what
	//exceptions it throws and use it in the catch
	//
	//here we are handling the exception
	
	try
	{
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("Successfully got a sequencer");
	}
	catch(MidiUnavailableException ex)
	{
		System.out.println("Didn't get one");
	}
	
	
}// close play

public static void main(String[] args)
{
	MusicTest1 mt = new MusicTest1();
	mt.play();	
}//close main



}//close class