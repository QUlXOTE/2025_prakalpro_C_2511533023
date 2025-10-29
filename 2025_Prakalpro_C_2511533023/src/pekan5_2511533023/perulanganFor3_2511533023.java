package pekan5_2511533023;

public final class perulanganFor3_2511533023 {

	public static void main(String[] args) {
		int jumlah=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			jumlah= jumlah+i;
			if (i<10) {
				System.out.print(" + ");
				
			}
		}
		System.out.println();
		System.out.println("Jumlah = "+jumlah);
	}

}
