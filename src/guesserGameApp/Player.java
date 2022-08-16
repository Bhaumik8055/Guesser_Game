package guesserGameApp;
//For input of players and will return int value to main class(Guesser game)
import java.util.Scanner;
public class Player 
{
	int pnum;
	int playerNum()
	{
		System.out.println("Give your numbers from 1 to 100:- ");
		Scanner scan =new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}
