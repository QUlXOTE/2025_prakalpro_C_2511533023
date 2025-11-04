package pekan6_2511533023;

import java.util.Scanner;

public class perulanganWhile1_2511533023 {

	public static void main(String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		
		try (Scanner scan = new Scanner(System.in)) {
			while (running) {
				counter++;
				System.out.println("jumlah = "+counter);
				System.out.print("apakah lanjut (ya / tidak?)");
				jawab= scan.nextLine();
				if (jawab.equalsIgnoreCase("tidak")) {
					running= false;
				}
			}
		}
		System.out.println("anda sudah melakukan perulangan sebanyak"+counter+" kali");
	}

}
