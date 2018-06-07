import java.util.Random;

public class Dice {
	Random random = new Random();
	int throwing() {
		return random.nextInt(6)+1;
	}

}
