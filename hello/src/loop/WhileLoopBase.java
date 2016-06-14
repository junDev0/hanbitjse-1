/**
 * 
 */
package loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 14. 
 * @author :pakjkwan@gmail.com
 * @file   :WhileLoopBase.java
 * @story  :
*/
public class WhileLoopBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String result = JOptionPane.showInputDialog(null, "[메뉴]1.출력 2.종료");
			switch (Integer.parseInt(result)) {
			case 1:
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s",(i+1));
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "종료하십니까?");
				return;
			case 3:
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 값");
				break;
			}
			System.out.println();
		}
	}

}
