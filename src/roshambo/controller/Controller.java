package roshambo.controller;
import roshambo.model.GameDecider;
import java.util.Scanner;

public class Controller 
{
	private GameDecider findWinner;
	private Scanner gameScanner;
	private int score;
	
	
	
	public void start()
	{
		findWinner = new GameDecider();
		gameScanner = new Scanner(System.in);
		score = 0;
		message();
		startUp();
	}
	
	private void message()
	
	{
		
		System.out.println("Hello and welcome to the Ro Sham Bo arena!");
		System.out.println("Are you a noob, scrub, or Semi-Decent? Please choose one.");
		String userInput = gameScanner.nextLine();
		System.out.println("Great, you're better than most!");
	}
	private void startUp()
	{
		
		System.out.println("Okay just type Ro(Rock) Sham(Paper) Bo(Scissors)");
		String gameChoice = gameScanner.nextLine();
		if(gameChoice.equalsIgnoreCase("Ro") || gameChoice.equalsIgnoreCase("Sham") || gameChoice.equalsIgnoreCase("Bo")) 
		{
			int computer = findWinner.fight();
			if(gameChoice.equalsIgnoreCase("Ro") && computer == 2)
			{
				System.out.println("Congrats you threw Ro(Rock) and the computer threw Bo(Scissors)");
				score += 1;
			}
			else if(gameChoice.equalsIgnoreCase("Ro") && computer == 1)
			{
				System.out.println("Sorry you threw Ro(Rock) and the computer threw Sham(Paper)");
				score -= 1;
			}
			else if(gameChoice.equalsIgnoreCase("Ro") && computer == 0)
			{
				System.out.println("Tie you threw Ro(Rock) and the computer threw Ro(Rock)");
			}
			else if(gameChoice.equalsIgnoreCase("Sham") && computer == 0)
			{
				System.out.println("Congrats you threw Sham(Paper) and the computer threw Ro(Rock)");
				score += 1;
			}
			else if(gameChoice.equalsIgnoreCase("Sham") && computer == 2)
			{
				System.out.println("Sorry you threw Sham(Paper) and the computer threw Bo(Scissors)");
				score -= 1;
			}
			else if(gameChoice.equalsIgnoreCase("Sham") && computer == 1)
			{
				System.out.println("Tie you threw Sham(Paper) and the computer threw Sham(Paper)");
			}
			else if(gameChoice.equalsIgnoreCase("Bo") && computer == 1)
			{
				System.out.println("Congrats you threw Bo(Scissors) and the computer threw Sham(Paper)");
				score += 1;
			}
			else if(gameChoice.equalsIgnoreCase("Bo") && computer == 2)
			{
				System.out.println("Sorry you threw Bo(Scissors) and the computer threw Ro(Rock)");
				score -= 1;
			}
			else if(gameChoice.equalsIgnoreCase("Bo") && computer == 0)
			{
				System.out.println("Tie you threw Bo(Scissors) and the computer threw Bo(Scissors)");
			}
			System.out.println("You have a score of "+ score + "\n");
			startUp();
		}
		
		else
		{
			System.out.println("I guess I was wrong...");
			System.out.println("you're worse than anybody who has ever lived...");
			System.out.println("you can't even spell words that were spelled for you.");
		}
		
	}
}
