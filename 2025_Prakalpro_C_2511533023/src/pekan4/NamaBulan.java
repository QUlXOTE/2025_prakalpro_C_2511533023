package pekan4;

import java.util.Scanner;

public class NamaBulan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka bulan (1 - 12): ");
		int bulan = scanner.nextInt();
		switch (bulan) {
		case 1:
			System.out.print("Januari");
			break;
		case 2:
			System.out.print("Februri");
			break;
		case 3:
			System.out.print("Maret");
			break;
		case 4: 
			System.out.print("April");
			break;
		case 5:
			System.out.print("Mei");
			break;
		case 6:
			System.out.print("Juni");
			break;
		case 7:
			System.out.print("Juli");
			break;
		case 8:
			System.out.print("Agustus");
			break;
		case 9:
			System.out.print("September");
			break;
		case 10:
			System.out.print("Oktober");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("Desember");
			break;
			default:
				System.out.print("Angka tidak valid");
		}
		scanner.close();

	}

}
