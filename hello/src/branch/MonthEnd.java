/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9. 
 * @author :pakjkwan@gmail.com
 * @file   :MonthEnd.java
 * @story  :
*/
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는
	 * 프로그램.
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다 라고 뜬다.
	 * */
	public static void main(String[] args) {
		// --------init---------
		Scanner scanner = new Scanner(System.in);
		int malil=0;
		//---------op --------
		System.out.println("월입력?");
		switch (scanner.nextInt()) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			malil = 31;
			break;
		case 2:
			malil = 29;
			break;
		case 4:case 6:case 9:case 11:
			malil = 30;
			break;
		default:System.out.println("잘못 입력 되었습니다");
			return;
		}
		System.out.println(malil+"일");
	}

}
