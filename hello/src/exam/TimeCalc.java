/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10. 
 * @author :pakjkwan@gmail.com
 * @file   :TimeCalc.java
 * @story  :초를 가지고 시간 분 초로 환산하기
*/
public class TimeCalc {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000초로 나오네요.
	 * 그런데 이게 감이 잘 안와서요..
	 * 시간,분,초로 나누어서 보게 해주세요.
	 * 예를들면 50000초가 입력되면
	 * [출력] 13시간 53분 20초 
	 * 이렇게 보이게 해주세요
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초입력?");
		int sec = scanner.nextInt();
		System.out.println(sec/60/60+"시간 "+sec/60%60+"분 "+sec%60+"초");
	}

}












