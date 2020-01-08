/*연습문제2.다음 조건을 만족하며 클래스 JFrame을 상속받는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.
- 윈도우의 가로와 세로가 각각 300, 150으로, 윈도우의 콘텐트패인 색상을 Color.lightGray로
- 윈도우의 캡션 제목을 "프로그래밍 연습 2"로
- 윈도우의 종료 버튼으로 프로그램도 함께 종료하도록
- 상단에 "OK" 버튼과 하단에 "Cancel" 버튼 추가, BorderLayout의 "North", "South"이용
- 메소드 setDefaultLookAndFeelDecorated(boolean)의 인자를 true, false로 하여 결과를 비교*/
package practice9;

import javax.swing.*;
import java.awt.*;

public class Swing2 extends JFrame{
	private JButton btn1, btn2;
	public Swing2(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150); 
		setTitle(title); 
		setBackground(Color.lightGray); 
		
		setLayout(new BorderLayout()); // 레이아웃을 보더레이아웃으로설정
		btn1 = new JButton("OK");     //버튼내용 OK
		btn2 = new JButton("Cancel"); //버튼내용 Cancle
		add(btn1, BorderLayout.NORTH); //add(버튼객체,BorderLayout.상수 위치설정
		add(btn2, BorderLayout.SOUTH);

		setDefaultLookAndFeelDecorated(true); //스윙의 화면이 나옴 
		//setDefaultLookAndFeelDecorated(false);  false값할시 기본윈도우플랫폼이나옴
		
		setVisible(true);
		}
	public static void main(String[] args) {
		Swing2 sw2 = new Swing2("프로그래밍 연습 2");
		}
}
