import java.awt.*;
import javax.swing.*;

public class grid extends JFrame {
	
	public grid(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,180);
		setVisible(true);
		JPanel p = new JPanel();
		JTextField tf = new JTextField("       ");
		p.add(new JLabel("�ü��"));
		p.add(tf);  //borderLayout �� �⺻ ��ġ�� �߾Ӻ��� . 
		p.setBackground(Color.red);
		add(p);
		setVisible(true);
		
	
	}

	public static void main(String args[]) {
		grid gr = new grid("��ȣ ����");
		
	}
	
}
