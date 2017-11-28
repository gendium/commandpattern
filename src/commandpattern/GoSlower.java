package commandpattern;

public class GoSlower implements Action{

	Car car;
	@Override
	public void execute() {
		this.car.goSlower();
	}
	
	public void goSlower(Car car)
	{
		this.car = car;
	}

}
