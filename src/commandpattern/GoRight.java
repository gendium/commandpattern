package commandpattern;

public class GoRight implements Action {

	Car car;
	@Override
	public void execute() {
		this.car.goRight();
	}
	public void goRight(Car car)
	{
		this.car = car;
	}

}
