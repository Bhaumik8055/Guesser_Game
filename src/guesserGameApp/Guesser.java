package guesserGameApp;
//For input of guesser and will return int value to main class(Guesser game)
import java.util.Scanner;
public class Guesser 
{
	int gnum;
	int guessNum()
	{
		System.out.println("Hey guesser, guess your number between 1-100:- ");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}
