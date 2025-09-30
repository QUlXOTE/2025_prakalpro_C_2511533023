package pekan4;

import java.util.Scanner;

public class latif1 {

	public static void main(String[] args) {
		double ipk;
		Scanner input=new Scanner(System.in);
		System.out.print("input ipk anda = ");
		ipk=input.nextDouble();
		input.close();
		if (ipk>2.75) {
			System.out.println("Anda lulus sangat memuaskan dengan ipk "+ipk);
		}

	}

}
