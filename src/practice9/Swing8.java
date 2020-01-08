/*연습문제8.프레임에 설정되어 있는 기본 배치관리자를 사용하고, 다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.
- 스윙의 패키지를 삽입한 리스트를 구성하여 윈도우 중앙에 삽입
* 리스트는 필요하면 수직 스크롤 바가 생기도록 구성
- 영어로 1월부터 12월이 삽입된 콤보박스를 구성하여 윈도우 남쪽에 삽입
* 콤보박스는 편집 가능하도록 구현*/
package practice9;

import java.awt.*;
import javax.swing.*;

public class Swing8 extends JFrame {
	public Swing8(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400, 200);
		setLayout(new BorderLayout());

		String a[] = { "javax.accessibility", "javax.swing,javax.swing.border", "javax.swing.event",
				"javax.swing.filechooser", "javax.swing.plaf", "javax.swing.plaf.basic", "javax.swing.plaf.heyonho" }; // 리스트문자열작성
																														
		JList<String> list = new JList<String>(a); // <String>일반화선언 --> 받을 배열리스트가 문자열형태이기때문
		list.setVisibleRowCount(4); // 한스크롤에보일화면객체수
		JScrollPane window1 = new JScrollPane(list); // 스크롤 생성
		window1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);// 필요할때 수직 스크롤바 생김

		String b[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		JComboBox<String> window2 = new JComboBox<String>(b);
		window2.setEditable(true); // 검색창 편집기능
		window2.setSelectedIndex(3); // 어떤게 처음에 보여질지 (배열첨자)

		add(window1, BorderLayout.CENTER);
		add(window2, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		Swing8 sw8 = new Swing8("목록 선택을 위한 콘트롤");
	}

}
