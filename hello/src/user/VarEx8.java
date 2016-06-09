package user;

import java.util.Scanner;

public class VarEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수 x 입력");
		double x = scanner.nextDouble();
		System.out.println("실수 y 입력");
		double y = scanner.nextDouble();
		double z = x * y;
		System.out.println("x * y = " + z);
	}
}
