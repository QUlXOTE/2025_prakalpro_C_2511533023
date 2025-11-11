package pekan7_2511533023;

import java.util.Scanner;


public class BilanganPrima_2511533023 {

	public static boolean isprime(int n) {
		int factors = 0;
		int n1 = 0;
		for (int i = 1; i <= n1; i++) {
			if(n1 % i == 0) {
				factors++;
			}
		}
		return (factors == 2);

	}
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("input nilai n = ");
			int a = input.nextInt();
			if (isprime(a)) {
				System.out.print(a+"bilangan prima ");
			}else {
				System.out.print(a+"bukan bilangan prima ");
			}
		}
	}
}
