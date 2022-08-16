package guesserGameApp;

public class Umpire 
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	
	void collectnumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		Player p5=new Player();
		
		numFromPlayer1=p1.playerNum();
		numFromPlayer2=p2.playerNum();
		numFromPlayer3=p3.playerNum();
		numFromPlayer4=p4.playerNum();
		numFromPlayer5=p5.playerNum();
	}
	
	void compare()
	{
		byte count=0;
		if (numFromPlayer1==numFromGuesser) {
			count++;
		System.out.println("Player 1 wins");}
		
		 if (numFromPlayer2==numFromGuesser && count>=1) {
		System.out.println("Player 2 also wins");
		count++;
		}
		 else if(numFromPlayer2==numFromGuesser) {
	    System.out.println("Player 2 wins");
	    count++;
	    }
		
		 if (numFromPlayer3==numFromGuesser && count>=1) {
		System.out.println("Player 3 also wins");
		count++;
		 }
		 else if(numFromPlayer3==numFromGuesser) {
		System.out.println("Player 3 wins");
		count++;
		 }
		
		 if (numFromPlayer4==numFromGuesser && count>=1) {
		System.out.println("Player 4 also wins");
		count++;	
		 }
		 else if(numFromPlayer4==numFromGuesser) {
		System.out.println("Player 4 wins");
		count++;	
		 }
		
		 if (numFromPlayer5==numFromGuesser && count>=1) {
		System.out.println("Player 5 also wins");
		count++;	
		 }
		 else if(numFromPlayer5==numFromGuesser) {
		System.out.println("Player 5 wins");
		count++;
		 }
		 
		 if(count>=1)
			 System.exit(0);
		 System.out.println("Game lost");
	}
}
