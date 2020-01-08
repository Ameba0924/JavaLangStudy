import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.*;
import javax.swing.*;


public class ItemEventWin extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;
	
	JPanel pCheck = new JPanel();
	JTextArea txtArea = new JTextArea();
	JLabel status = new JLabel("�޴�����");
	
	public ItemEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		makeCheckBox();
		makeMenuAndEventHandle();
		add(pCheck,"North");
		add(txtArea,"Center");
		add(status,"South");
		setVisible(true);
		
	}
	
	public void makeCheckBox() {
		JCheckBox box1 = new JCheckBox("����");
		JCheckBox box2 = new JCheckBox("����");
		JCheckBox box3 = new JCheckBox("�౸");
		JCheckBox box4 = new JCheckBox("�߱�");
		box1.addItemListener(this); 	box2.addItemListener(this);
		box3.addItemListener( this); 	box4.addItemListener(this);
		
		pCheck.add(box1); pCheck.add(box2); pCheck.add(box3); pCheck.add(box4);	
		}
	
	public void makeMenuAndEventHandle() {
		JMenuBar mBar = new JMenuBar();
		JMenu mainMenu = new JMenu("����");
		JMenu subMenu = new JMenu("��Ƽ�̵��");
		JCheckBoxMenuItem SubCheck1 = new JCheckBoxMenuItem("����");
		JCheckBoxMenuItem SubCheck2 = new JCheckBoxMenuItem("�̹���");
		subMenu.add(SubCheck1);
		subMenu.add(SubCheck2);
		SubCheck1.addItemListener(this);
		SubCheck2.addItemListener(this);
		
		mainMenu.add(subMenu);
		mBar.add(mainMenu);
		setJMenuBar(mBar);
		}
	
	public void itemStateChanged(ItemEvent e) {
		String str = ((AbstractButton)e.getItem()).getText();
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			str += "����\n" ;
			
		}else 
			str += "����\n";
		
		status.setText(str);
		txtArea.append(str);
	}
	

	public static void main(String[] args) {
		ItemEventWin myWin = new ItemEventWin();
		myWin.setTitle("�������̺�Ʈ ó��");

	}

}
