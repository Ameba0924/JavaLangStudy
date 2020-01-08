package component;

import java.awt.*;
import javax.swing.*;

public class PanelWin extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public PanelWin(String title) {//제목을 인자로가지는 생성자 생성
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setTitle(title);
		//패널 구성의 메소드 호출
		makePanel();
		setVisible(true);
		}
	
	public void makePanel() {
		//상위 패널에 삽입할 2개의 패널을 만들어 색상 수정
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.blue);
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.PINK);
		
		//패널의 기본배치는 FlowLayout이며 add의 기본 정렬은 중앙
		//패널의 배치관리에서 가로를 이등분하기 위해 GridLayout 설정
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(pan1);
		p.add(pan2);
		//윈도우의 기본배치는 BorderLayout이며 add는 중앙에 삽입된다.
		add(p); // 모든정보를 담은 p를 마지막에 삽입 
		}
		
	
	public static void main(String[] args) {	
		PanelWin pw = new PanelWin("현호 패널");
	}

}
