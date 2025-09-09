package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeBatter();
		memanggang();
		memanggang();
		menghias();
		

	}
    // Langkah 1: Buat adonan kue.
	public static void makeBatter() {
		System.out.println("Campur bahan kering");
		System.out.println("Krim mentega dan gula");
		System.out.println("Kocok telurnya");
		System.out.println("Masukkan bahan kering");
	}
	// Langkah 2: Panggang sekumpulan kue.
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengukur waktu.");
		System.out.println("Masukkan keu kedalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
	}
	// Langkah 3: Hiasi cookie.
	public static void menghias() {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting dan taburan.");
	}
	
}
