/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14. 
 * @author :pakjkwan@gmail.com
 * @file   :ArrAssign.java
 * @story  :
*/
public class ArrAssign2 {
	public static void main(String[] args) {
		/**
		 * 전교생이 몇명인지 몰라요.
		 * 전교생 수를 입력받고
		 * 학생의 이름과 점수를
		 * 입력받고, 이것을 1등부터 꼴등까지 출력하세요
		 * */
		Scanner scanner = new Scanner(System.in);
		int i = 0,count=0;
		System.out.println("학생 수가 몇명입니까?");
		count = scanner.nextInt();
		int[] hakbun = new int[count];
		int[] age = new int[count];
		String[]name = new String[count];
		System.out.println("?명의 이름,나이을 입력하세요");
		for (;i  < name.length; i++) {
			// ---- 학번
			name[i] = scanner.next();
			age[i]= scanner.nextInt();
		}
		System.out.print("====================\n");
		System.out.print("학번 | 이름 | 나이 \n");
		System.out.print("====================\n");
		for (i= 0; i < age.length; i++) {
			System.out.printf("%s\t%s\t%d\n",hakbun[i],name[i],age[i]);
		}
	}
}
