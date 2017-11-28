package commandpattern;

public class GoLeft implements Action{

	Car car;
	
	@Override
	public void execute() {
		this.car.goLeft();
	}

	public void goLeft(Car car)
	{
		this.car = car;
	}
}
