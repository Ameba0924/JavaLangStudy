/*��������1. ���� ������ �����ϸ� Ŭ���� J
 * Frame�� ��ӹ޴� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ����α׷��� �ۼ��Ͻÿ�.
- �������� ���ο� ���ΰ� ���� 300, 200����
- �������� ����Ʈ ���� ������ Color.red��
- �������� ĸ�� ������ "���α׷��� ���� 1"��
- �������� ���� ��ư���� ���α׷��� �Բ� �����ϵ��� */
package practice9;

import java.awt.*;

import javax.swing.JFrame;

public class Swing extends JFrame {

	public Swing(String title) { // ���������ڷΰ����� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �����ư������ ���� ���α׷���������
		setSize(300, 200); // (����,����)
		setTitle(title);
		Container pane = getContentPane(); // getContetPane���� setBackgound����
		pane.setBackground(Color.RED); // ������
		setVisible(true);
	}

	public static void main(String[] args) {
		Swing sw = new Swing("���α׷��� ���� 1");
	}

}
