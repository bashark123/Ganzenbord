import java.util.Random;

public class Dice {

	public static int randomDiceGenerator() {
	Random r = new Random();
	int dice =  r.nextInt(12)+1;
	return dice;
	}
}
