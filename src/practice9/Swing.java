/*연습문제1. 다음 조건을 만족하며 클래스 J
 * Frame을 상속받는 클래스를 구현하여 테스트하는프로그램을 작성하시오.
- 윈도우의 가로와 세로가 각각 300, 200으로
- 윈도우의 콘텐트 페인 색상을 Color.red로
- 윈도우의 캡션 제목을 "프로그래밍 연습 1"로
- 윈도우의 종료 버튼으로 프로그램도 함께 종료하도록 */
package practice9;

import java.awt.*;

import javax.swing.JFrame;

public class Swing extends JFrame {

	public Swing(String title) { // 제목을인자로가지는 생성자 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼누르면 같이 프로그램도종료함
		setSize(300, 200); // (가로,세로)
		setTitle(title);
		Container pane = getContentPane(); // getContetPane으로 setBackgound설정
		pane.setBackground(Color.RED); // 빨강색
		setVisible(true);
	}

	public static void main(String[] args) {
		Swing sw = new Swing("프로그래밍 연습 1");
	}

}
