import java.util.Scanner;

class GooseGame {
	Player player1;
	Player player2;
	Board board;
	Dice dice1;
	Dice dice2;
	Scanner scanner = new Scanner(System.in);

	GooseGame() {
		player1 = new Player("Jan");
		player2 = new Player("Piet");
		board = new Board();
		dice1 = new Dice();
		dice2 = new Dice();
	}

	void play() {

		System.out.println("The game has started");
		boolean continuePlay = true;
		while (continuePlay) {
			printMenu();
			String input = scanner.next();
			switch (input) {
				case "q":
					continuePlay = false;
					break;
				case "c":
					newTurn();
					break;
				default:
					System.out.println("Not a valid input");
			}
			
		}
		System.out.println("Thanks for playing");
	}
	void printMenu() {
		System.out.println("Make your choice");
		System.out.println("q for quit");
		System.out.println("c for continue");
	}
	void newTurn() {
		System.out.println("A new turn for player1");
		int resultWorp = dice1.throwing() + dice2.throwing();
		//player1.checkTurn();
		player1.takeTurn(resultWorp);
		resultWorp = dice1.throwing() + dice2.throwing();
		System.out.println("A new turn for player2");
		player2.takeTurn(resultWorp);
	}

}
