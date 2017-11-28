package commandpattern;

import java.util.ArrayList;
import java.util.List;

public class ActionInterpreter {
	List<Action> orders = new ArrayList<Action>();
	
	public ActionInterpreter()
	{
	}
	
	public void takeActions(Action action)
	{
		orders.add(action);
	}
	
	public void executeActions()
	{
		for(Action actions:orders)
		{
			actions.execute();
		}
		orders.clear();
	}
	
	
}
