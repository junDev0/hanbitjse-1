/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8. 
 * @author :pakjkwan@gmail.com
 * @file   :Average.java
 * @story  :
*/
public class Average {
	/**
     * 클라이언트에서 프로그램 개발 요청이 왔습니다.
     * 이름과 국,영,수 세과목점수를 입력받아서
     * [홍길동 : 총점 ***점, 평균***점]
     * 을 출력하는 프로그램을 만들어 주세요.
     * 단) 평균은 소수점이하는 절삭합니다
     */
	
	public static void main(String[] args) {
		String name="";
		int total=0,avg=0,kor=0,eng=0,math=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("국,영,수??");
		kor=scanner.nextInt();
		eng=scanner.nextInt();
		math=scanner.nextInt();
		total=kor+eng+math;
		avg=(kor+eng+math)/3;
		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점]");
	}
	

}
