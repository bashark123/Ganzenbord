import java.util.Random;

public class Dice {
	
	static public int newDice ;
	
	 int getDice() {
		int newDice = randomDiceGenerator();
		this.newDice = newDice;
		return newDice;
	}

	private int randomDiceGenerator() {
	Random r = new Random();
	int dice =  r.nextInt(12)+1;
	return dice;
	}
}
