package pekan7_2511533023;

import java.util.Scanner;

public class PanggilMahasiswa2_2511533023 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nim: ");
		String X = input.nextLine();
		System.out.println("Nama: ");
		String Y = input.nextLine();
		Mahasiswa_2511533023 a = new Mahasiswa_2511533023();
		a.setNim2(X);
		a.setNama(Y);
		if (X.startsWith("25")) {
			System.out.println(Y + " anda angkatan 2025");
			
		}
		if(X.contains("1153")) {
			System.out.println("Anda Mahasiswa Informatika");
		}
		a.cetak2();
		input.close();

	}

	
		
	}


