package commandpattern;

public class StartRecording implements Action {

	Recording recording;
	
	@Override
	public void execute() {
		this.recording.record();		
	}
	
	public void startRecording(Recording record)
	{
		this.recording = record;
	}

}
