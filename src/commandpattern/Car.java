package commandpattern;

public class Car {
	String userName;
	float speed;
	public Car(String username)
	{
		speed = 0;
		this.userName = username;
	}
	public void goFaster()
	{
		System.out.println("Going Faster");
		speed++;
	}
	public void goSlower()
	{
		System.out.println("Going Slower");
		speed--;
	}
	public void goLeft()
	{
		System.out.println("Going Left");
	}
	public void goRight()
	{
		System.out.println("Going Right");
	}
}
