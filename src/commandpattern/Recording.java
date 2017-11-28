package commandpattern;
import java.util.ArrayList;


public class Recording {
	String recordingName;
	
	public Recording(String name)
	{
		recordingName = name;
	}
	
	public void record()
	{
		System.out.println("Recording...");
	}
	
	public void stopRecording()
	{
		System.out.println("Stopping Recording Process...");
	}

}
