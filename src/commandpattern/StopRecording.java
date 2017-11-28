package commandpattern;

public class StopRecording implements Action {

	Recording recording;
	
	@Override
	public void execute() {
		this.recording.stopRecording();		
	}
	
	public void stopRecording(Recording record)
	{
		this.recording = record;
	}

}
