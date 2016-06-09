package user;

import java.util.Scanner;

public class VarEX4 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("정수x입력");
		int x = scanner.nextInt();
		System.out.println("정수y입력");
		int y = scanner.nextInt();
		int z = x/y;
		System.out.println("x/y="+z);
		
	}

}
