package pekan6_2511533023;

import java.util.Scanner;

public class dowhile1_2511533023 {

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			String phrase;
			do {
				System.out.print("input password: ");
				phrase = console.next();
			}while (!phrase.equals("abcd"));
		}

	}

}
