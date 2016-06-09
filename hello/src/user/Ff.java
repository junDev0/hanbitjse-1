package user;

import java.util.Scanner;

public class Ff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x= 정수");
		int x = scanner.nextInt();
		System.out.println("y=정수");
		int y = scanner.nextInt();
		int z = x % y;
		System.out.println("x%y=" + z);

	}
}
