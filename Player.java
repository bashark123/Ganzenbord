import java.util.Scanner;

public class Player {
	String name1;
	String name2;
	
	public void playerName() {
		
		System.out.println("**********************************\n");
		System.out.println("*** Welcome to Goose Game ***\n\n** it is a game for two players **");
		System.out.println("\n**********************************\n");

		System.out.println("Player1 please enter your name");
		Scanner n1 = new Scanner(System.in);
		name1 = n1.next();
		System.out.println("Welcome "+ name1);
		System.out.println("Player2 please enter your name");
		Scanner n2 = new Scanner(System.in);
		name2 = n2.next();
		System.out.println("Welcome "+ name2);
	}
	
	public void playerTurn() {
		
		System.out.println(name1 + " Please press r to roll the dice");
		
		while (true) {
		Scanner n3 = new Scanner(System.in);
		char roll = n3.next().charAt(0);
		if (roll == 'r') {
			
			//System.out.println(Dice.randomDiceGenerator());

			
		}else {
			System.out.println("invalid entry please try again");
		}
		
	}
	}

}
