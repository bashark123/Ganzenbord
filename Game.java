
public class Game {

	public static void main(String[] args) {
		
/*		Player player = new Player();
		player.playerName();
		player.playerTurn();*/

		
		Dice d = new Dice();
		System.out.println(d.getDice());
		System.out.println(d.newDice);
		
		
		Board r = new Board();	
		System.out.println(r.player1Position());
		//System.out.println(r.newPosition);
		System.out.println(r.currentPosition);
		//System.out.println(r.board1[0]);
		//round.board = Board.board[d.dice];
		//int[] round = new int[d.dice];
		//r.movePlayer();
		

	}

}
