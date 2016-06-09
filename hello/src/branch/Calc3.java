/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8. 
 * @author :pakjkwan@gmail.com
 * @file   :Calc.java
 * @story  :
*/
public class Calc3 {
	/*
	 * 두개의 정수를 입력받아서
	 * opcode 값이 1이면 덧셈
	 * 2면 뺄셈
	 * 3이면 곱셈
	 * 4면 나눗셈(몫)
	 * 5면 나머지 구하는 계산기
	 * */
	public static void main(String[] args) {
		//-------------init-------------
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,numResult=0;
		String symbol="",count="";
		//-------------op--------------
		System.out.print("첫번째숫자 : ");
		num1 = scan.nextInt();
		System.out.print("연산자 : ");
		count = scan.next();
		System.out.print("두번째숫자 : ");
		num2 = scan.nextInt();
		switch (count) {
		case "+":
			symbol = "+";
			numResult= num1+num2;
			break;
		case "-":
			symbol = "-";
			numResult= num1-num2;	
			break;
		case "*":
			symbol = "*";
			numResult= num1*num2;
			break;
		case "/":
			symbol = "/";
			numResult= num1/num2;
			break;
		case "%":
			symbol = "%";
			numResult= num1%num2;	
			break;
		default:
			System.out.println("1~5까지만 입력바랍니다");
			break;
		}
		//----------out-----------
		System.out.println(num1+symbol+num2+"="+numResult);
	}

}
