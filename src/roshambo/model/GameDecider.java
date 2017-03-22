package roshambo.model;

public class GameDecider 
{
	public int fight()
	{
		int computerChoice = 0;
		
		computerChoice = (int)(Math.random()*3);
		
		return computerChoice;
	}
}
