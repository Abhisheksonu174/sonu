package genericUtility;

import java.util.Random;


public class JavaLibrary {
	

	public int getRandomNumber(int limit) {
		int randomNumber = new Random().nextInt(limit);
		return randomNumber;

}
}
