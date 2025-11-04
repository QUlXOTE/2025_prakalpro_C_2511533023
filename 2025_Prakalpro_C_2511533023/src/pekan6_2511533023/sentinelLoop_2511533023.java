package pekan6_2511533023;

import java.util.Scanner;

public class sentinelLoop_2511533023 {

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			int sum = 0;
			int number = 12;
			
			while (number != 0) {
				System.out.print("masukkan anka (0 untuk keluar): ");
				number = console.nextInt();
				sum = sum + number;
				
			}
			System.out.println("totalnya adalah " + sum);
		}

	}

}
