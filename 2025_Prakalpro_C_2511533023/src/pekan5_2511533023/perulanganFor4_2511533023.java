package pekan5_2511533023;

import java.util.Scanner;

public class perulanganFor4_2511533023 {

	public static void main(String[] args) {
		int jumlah=0;
		int batas;
		Scanner input= new Scanner(System.in);
		System.out.print("masukkan nilai batas = ");
		batas= input.nextInt();
		input.close();
		for (int i=1;i<= batas;i++) {
			System.out.print(i);
			jumlah= jumlah+i;
			if (i<batas) {
				System.out.print(" + ");
				
			}else {
				System.out.print(" = ");
			}
		}
		System.out.print(jumlah);

	}

}
