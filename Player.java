import java.util.Scanner;

public class Player {
	String name;
	int position;
	Board board = new Board();
	
	
	Player(String name){
		this.name = name;
	}
	Player() {
	}
	
void checkTurn() {
	//this.position = position;
	


	
	
}
	void well(int position) {

	}

	
	boolean checkIfTrap(int position) {
		for(int trap : board.traps) {
			if(position == trap) {
				return true;
			}
		}
		return false;
	}
	
	void skipTurn() {
		takeTurn(0);
		
	}
	
	

	void takeTurn(int worp) {
		position = position + worp;
		if (checkIfTrap(position)) {
			
			switch (position) {
			
			case 6:
				System.out.println("you reached the Bridge, Move to 12");
				position = 12;
				break;
			case 19:
				System.out.println("you reached the Hotel, Skip one turn");
				//skipTurn();
				break;
				//default:
					//takeTurn(position);
			}
		}
		System.out.println("Player "+name+" is at "+ position);
	
	}
}





