package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// Deklarasi variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		
		// Menampilkan nilai variabel char
		System.out.println("Contoh variabel char");
		System.out.println("Huruf pertama:" + huruf1);
		System.out.println("Huruf kedua: " + huruf2);
		System.out.println("Angka: " + angka);
		System.out.println("Simbol: " + simbol);
		
		// Operasi dengan char (berdasarkan kode Unicode/ASCII)
		char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
		System.out.println("Huruf1 + 1 =" + huruf3);
		
		// Char juga bisa disimpan dalam integer (ASCII/Unicode value)
		int kodehuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ' , '0');
		System.out.println("Kode ASCII dari" + huruf1 + " = " + kodehuruf);
		System.out.println("Kode BINER dari" + huruf1 + " = " + biner1);
		
		// Menggabungkan char jadi string
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan char menjadi string: " + kata);

	}

}
