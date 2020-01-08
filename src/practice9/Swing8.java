/*��������8.�����ӿ� �����Ǿ� �ִ� �⺻ ��ġ�����ڸ� ����ϰ�, ���� ������ �����ϴ� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ������ ��Ű���� ������ ����Ʈ�� �����Ͽ� ������ �߾ӿ� ����
* ����Ʈ�� �ʿ��ϸ� ���� ��ũ�� �ٰ� ���⵵�� ����
- ����� 1������ 12���� ���Ե� �޺��ڽ��� �����Ͽ� ������ ���ʿ� ����
* �޺��ڽ��� ���� �����ϵ��� ����*/
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
				"javax.swing.filechooser", "javax.swing.plaf", "javax.swing.plaf.basic", "javax.swing.plaf.heyonho" }; // ����Ʈ���ڿ��ۼ�
																														
		JList<String> list = new JList<String>(a); // <String>�Ϲ�ȭ���� --> ���� �迭����Ʈ�� ���ڿ������̱⶧��
		list.setVisibleRowCount(4); // �ѽ�ũ�ѿ�����ȭ�鰴ü��
		JScrollPane window1 = new JScrollPane(list); // ��ũ�� ����
		window1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);// �ʿ��Ҷ� ���� ��ũ�ѹ� ����

		String b[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		JComboBox<String> window2 = new JComboBox<String>(b);
		window2.setEditable(true); // �˻�â �������
		window2.setSelectedIndex(3); // ��� ó���� �������� (�迭÷��)

		add(window1, BorderLayout.CENTER);
		add(window2, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		Swing8 sw8 = new Swing8("��� ������ ���� ��Ʈ��");
	}

}
