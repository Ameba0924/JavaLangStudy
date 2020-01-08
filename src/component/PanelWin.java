package component;

import java.awt.*;
import javax.swing.*;

public class PanelWin extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public PanelWin(String title) {//������ ���ڷΰ����� ������ ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setTitle(title);
		//�г� ������ �޼ҵ� ȣ��
		makePanel();
		setVisible(true);
		}
	
	public void makePanel() {
		//���� �гο� ������ 2���� �г��� ����� ���� ����
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.blue);
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.PINK);
		
		//�г��� �⺻��ġ�� FlowLayout�̸� add�� �⺻ ������ �߾�
		//�г��� ��ġ�������� ���θ� �̵���ϱ� ���� GridLayout ����
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(pan1);
		p.add(pan2);
		//�������� �⺻��ġ�� BorderLayout�̸� add�� �߾ӿ� ���Եȴ�.
		add(p); // ��������� ���� p�� �������� ���� 
		}
		
	
	public static void main(String[] args) {	
		PanelWin pw = new PanelWin("��ȣ �г�");
	}

}
