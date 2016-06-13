/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13. 
 * @author :pakjkwan@gmail.com
 * @file   :Unary.java
 * @story  :
*/
public class Unary {
	public static void main(String[] args) {
		int c; // c라는 주소값에 메모리를 생성해라
		c=1; // c라는 메모리공간에 1을 할당하라
		int a=5,b=0; 
		a++;
		System.out.printf("a++ = %d \n",a++);
	//	System.out.printf("a++(2) = %d \n",a++);
		System.out.printf("++b = %d",++b);
	}

}
