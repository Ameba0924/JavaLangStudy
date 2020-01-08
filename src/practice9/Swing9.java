/*��������9. �������� ��ġ���� GridLayout���� �����ϰ�, ���� ������ �����ϴ�Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ��ġ���� GridLayout���� ���ο� ���� ������ ������ ���� 10, 20���� ����
- ��ư�� ��ȣ 1, 2, 3, 4�� �ο��Ͽ� ����
- �гο� ���� yellow, pink, green, blue�� �����Ͽ� ����*/
package practice9;

import java.awt.*;
import javax.swing.*;

public class Swing9 extends JFrame {
	public Swing9(String title) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle(title);
		setSize(400, 250);
		setLayout(new GridLayout(2, 4, 10, 20)); // 2��4�� hgap 10 vgap 20 ���� (�׸��巹�̾ƿ�)
		add(new JButton("1")); // 1�� ��ư�ϳ����� ������Ʈ�߰�
		JPanel yellowp = new JPanel(); // �гλ���
		yellowp.setBackground(Color.YELLOW); // �����
		add(yellowp); // ������Ʈ �߰�
		add(new JButton("2")); //2 
		JPanel pinkp = new JPanel();
		pinkp.setBackground(Color.PINK);  //�����ũ
		add(pinkp);
		JPanel greenp = new JPanel();
		greenp.setBackground(Color.GREEN); //���׸�
		add(greenp);
		add(new JButton("3")); //3 
		JPanel bluep = new JPanel();
		bluep.setBackground(Color.BLUE); //�����
		add(bluep);
		add(new JButton("4")); //4
       //GridLayout������ �࿭ ���� ������ ��ü ������Ʈ ���������� ����� �ٲ������ 
		setVisible(true);
	}

	public static void main(String[] args) {
		Swing9 sw9 = new Swing9("Grid Button");
	}

}
