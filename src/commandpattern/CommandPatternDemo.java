package commandpattern;

public class CommandPatternDemo {
public static void main(String[] args) {
	Car car = new Car("Ford Model A");
	Recording recording = new Recording("Current Record");
	
	
	StartRecording startRecord = new StartRecording();
	startRecord.startRecording(recording);
	
	GoFaster faster = new GoFaster();
	faster.goFaster(car);
	GoSlower slower = new GoSlower();
	slower.goSlower(car);
	GoRight goRight = new GoRight();
	goRight.goRight(car);
	GoLeft goLeft = new GoLeft();
	goLeft.goLeft(car);

	StopRecording stopRecord = new StopRecording();
	stopRecord.stopRecording(recording);
	
	
	ActionInterpreter interpreter = new ActionInterpreter();
	
	interpreter.takeActions(startRecord);
	interpreter.takeActions(faster);
	interpreter.takeActions(goRight);
	interpreter.takeActions(slower);
	interpreter.takeActions(goLeft);
	interpreter.takeActions(stopRecord);
	interpreter.executeActions();
	
}
}
