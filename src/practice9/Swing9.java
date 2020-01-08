/*연습문제9. 프레임의 배치관리 GridLayout으로 수정하고, 다음 조건을 만족하는클래스를 구현하여 테스트하는 프로그램을 작성하시오.
- 배치관리 GridLayout에서 가로와 세로 사이의 간격을 각각 10, 20으로 지정
- 버튼에 번호 1, 2, 3, 4를 부여하여 삽입
- 패널에 색상 yellow, pink, green, blue를 지정하여 삽입*/
package practice9;

import java.awt.*;
import javax.swing.*;

public class Swing9 extends JFrame {
	public Swing9(String title) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle(title);
		setSize(400, 250);
		setLayout(new GridLayout(2, 4, 10, 20)); // 2행4열 hgap 10 vgap 20 설정 (그리드레이아웃)
		add(new JButton("1")); // 1인 버튼하나생성 컴포넌트추가
		JPanel yellowp = new JPanel(); // 패널생성
		yellowp.setBackground(Color.YELLOW); // 배경노랑
		add(yellowp); // 컴포넌트 추가
		add(new JButton("2")); //2 
		JPanel pinkp = new JPanel();
		pinkp.setBackground(Color.PINK);  //배경핑크
		add(pinkp);
		JPanel greenp = new JPanel();
		greenp.setBackground(Color.GREEN); //배경그린
		add(greenp);
		add(new JButton("3")); //3 
		JPanel bluep = new JPanel();
		bluep.setBackground(Color.BLUE); //배경블루
		add(bluep);
		add(new JButton("4")); //4
       //GridLayout지정시 행열 들어가는 순서와 전체 컴포넌트 개수에따라 모양이 바뀔수있음 
		setVisible(true);
	}

	public static void main(String[] args) {
		Swing9 sw9 = new Swing9("Grid Button");
	}

}
