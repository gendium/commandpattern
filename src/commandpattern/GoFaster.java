package commandpattern;

public class GoFaster implements Action {
	Car car;
	@Override
	public void execute() {
		this.car.goFaster();
	}
	
	public void goFaster(Car car)
	{
		this.car = car;
		
}

}
	