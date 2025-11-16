package TugasPekan7_2511533023;

import java.util.Scanner;

public class Registrasi_2511533023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====== REGISTRASI AKUN BARU ======");
		
		// Input pengguna 
		System.out.println("Masukkan username  : ");
		String inputUsername = scanner.nextLine();
		System.out.println("Masukkan password  : ");
		String inputPassword = scanner.nextLine();
		System.out.println("Masukkan Email  : ");
		String inputEmail = scanner.nextLine();
		System.out.println("Masukkan Pin (6 digit) : ");
		int inputPin = scanner.nextInt();
		
		// Membuat objek akun
		Akun_2511533023 akunBaru = new Akun_2511533023();
		
		// Setter untuk menyimpan data ke dalam objek
		akunBaru.setUsername(inputUsername);
		akunBaru.setPassword(inputPassword);
		akunBaru.setEmail(inputEmail);
		akunBaru.setPinAngka(inputPin);
		
		// Validasi dari objek akun
		if(!akunBaru.isPasswordValid()) {
			System.out.println("\n---- REGISTRASI GAGAL ----");
			System.out.println("password anda \"" + akunBaru.getPassword() + "\" tidak valid (8 karakter).");
			System.out.println(" silakan coba lagi");
			scanner.close();
			return;
		}
		if (!akunBaru.isEmailValid()) {
			System.out.println("\n---- REGISTRASI GAGAL ----");
			System.out.println("Email anda \"" + akunBaru.getEmail() + "\" tidak valid (mengandung '@' dan '.').");
			System.out.println("silakan coba lagi");
			scanner.close();
			return;
		}
		// jika validasi sukses.
		System.out.println("\n---- REGISTRASI BERHASIL ----");
		System.out.println(" akun untuk \"" + akunBaru.getUsername() + "\" telah berhasil dibuat.\n");
		
		// menampilkan detail akun sesuai format
		System.out.println("---- DETAIL AKUN ----");
		System.out.println("Username (Lowercase) : " + akunBaru.getUsername().toLowerCase());
		System.out.println("Email (Uppercase) : " + akunBaru.getEmail().toUpperCase());
		System.out.println("ID pengguna (Gabungan): " + akunBaru.getUsername() + akunBaru.getPinAngka());
		System.out.println("\n---- Uji Tipe Data (Pin anda: " + akunBaru.getPinAngka() + ") ----");
		int pinInt = akunBaru.getPinAngka();
		String pinString = String.valueOf(pinInt);
		System.out.println(" Pin (int) + 10 = " + (pinInt + 10));
		System.out.println("Pin (String) + \"10\" = " + pinString + "10");
		scanner.close();

	}

}
