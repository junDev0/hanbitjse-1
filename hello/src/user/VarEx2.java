package user;

import java.util.Scanner;

public class VarEx2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
		System.out.println("정수 x : [ ]");
		int x = scanner.nextInt();
		System.out.println("정수 y : [ ]");	
		int y = scanner.nextInt();	
		int z = x - y;
		System.out.println("x-y="+z);
		}
}
