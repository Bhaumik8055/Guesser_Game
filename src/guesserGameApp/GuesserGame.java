package guesserGameApp;

public class GuesserGame {

	public static void main(String[] args) 
	{
		Umpire u = new Umpire();
		u.collectnumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}

}
