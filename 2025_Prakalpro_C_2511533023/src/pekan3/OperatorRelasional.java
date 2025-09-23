package pekan3;

import java.util.Scanner;

public class OperatorRelasional {

	public static void main(String[] args) {
		int A1;
		int A2;
		boolean hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Angka-1: ");
	    A1 = keyboard.nextInt();
   	    System.out.println("Input Angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		hasil = A1 > A2;// apakah A1 lebih besar A2?
		System.out.println("A1 > A2 = " +hasil);
		hasil = A1 < A2;// apakah A1 lebih kecil A2?
		System.out.println("A1 < A2 = " +hasil);
		hasil = A1 >= A2;// apakah A1 lebih besar samadengan A2?
		System.out.println("A1 >= A2 = " +hasil);
		hasil = A1 <= A2;// apakah A1 lebih kecil samadengan A2?
		System.out.println("A1 <= A2 = " +hasil);
		hasil = A1 == A2;// apakah A1 samadengan A2?
		System.out.println("A1 == A2 = " +hasil);
		hasil = A1 != A2;// apakah A1 tidak samadengan A2?
		System.out.println("A1 != A2 = " +hasil);
	}

}
