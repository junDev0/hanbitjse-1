package user;

import java.util.Scanner;

public class VarEx6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수x입력");
		double x = scanner.nextDouble();
		System.out.println("실수y입력");
		double y = scanner.nextDouble();
		double z = x + y;
		System.out.println("x+y:"+z);
	}

}
