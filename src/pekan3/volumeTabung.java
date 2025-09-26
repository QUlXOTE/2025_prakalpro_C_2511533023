package pekan3;

import java.util.Scanner;

public class volumeTabung {

	public static void main(String[] args) {
		double r , t , pi = 3.14;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Masukkan jari-jari tabung: ");
		r = scanner.nextDouble();
		System.out.println("Masukkan tinggi tabung: ");
		t = scanner.nextDouble();
		double volume = pi * r * r * t;
		System.out.println("volume tabung = " + volume);
		scanner.close();
		
	}

}
