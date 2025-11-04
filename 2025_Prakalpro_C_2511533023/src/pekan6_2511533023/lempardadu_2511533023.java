package pekan6_2511533023;
import java.util.Random;
public class lempardadu_2511533023 {

	public static void main(String[] args) {
		Random rand = new Random();
		int tries = 0;
		int sum = 0;
		while (sum != 7) {
			int dadu1 = rand.nextInt(6) + 1;
			int dadu2 = rand.nextInt(6) + 1;
			sum = dadu1 + dadu2;
			System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
			tries++;
		}
		System.out.println("you won after " + tries + " tries!");

	}

}
