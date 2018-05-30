
public class Board {
	
	int[] board1 = new int[64];
	
	Board movePlayer() {
		for (int i = 0 ; i < board1.length; ) {
			//i += currentPosition;
			//board1[i] = player1Position();
			System.out.println(board1[i]);
			
		}
		return null;
	}
	Dice d1 = new Dice();
	int currentPosition ;
	//int newPosition ;

		
	int player1Position() {	
		int currentPosition = this.currentPosition ;
		int newPosition = this.currentPosition + Dice.newDice;
		//this.newPosition = newPosition;
		currentPosition += newPosition;
		this.currentPosition = currentPosition;
		board1[0] = 0;
		return newPosition;

		/*		
		for (int i = 0 ; i < board1.length; i++) {
		
		
	}*/
	
}
	}
