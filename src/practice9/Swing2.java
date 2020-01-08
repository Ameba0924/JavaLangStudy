/*��������2.���� ������ �����ϸ� Ŭ���� JFrame�� ��ӹ޴� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
- �������� ���ο� ���ΰ� ���� 300, 150����, �������� ����Ʈ���� ������ Color.lightGray��
- �������� ĸ�� ������ "���α׷��� ���� 2"��
- �������� ���� ��ư���� ���α׷��� �Բ� �����ϵ���
- ��ܿ� "OK" ��ư�� �ϴܿ� "Cancel" ��ư �߰�, BorderLayout�� "North", "South"�̿�
- �޼ҵ� setDefaultLookAndFeelDecorated(boolean)�� ���ڸ� true, false�� �Ͽ� ����� ��*/
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
		
		setLayout(new BorderLayout()); // ���̾ƿ��� �������̾ƿ����μ���
		btn1 = new JButton("OK");     //��ư���� OK
		btn2 = new JButton("Cancel"); //��ư���� Cancle
		add(btn1, BorderLayout.NORTH); //add(��ư��ü,BorderLayout.��� ��ġ����
		add(btn2, BorderLayout.SOUTH);

		setDefaultLookAndFeelDecorated(true); //������ ȭ���� ���� 
		//setDefaultLookAndFeelDecorated(false);  false���ҽ� �⺻�������÷����̳���
		
		setVisible(true);
		}
	public static void main(String[] args) {
		Swing2 sw2 = new Swing2("���α׷��� ���� 2");
		}
}
