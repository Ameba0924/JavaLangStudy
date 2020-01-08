import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;

public class ComponentEventWin extends JFrame{
	private static final long serialVersionUID = 1L;
	JTextArea txtArea = new JTextArea();
	
	class MyComponentAdapter extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			String str = e.getSource().getClass() + " ������Ʈ ũ�� ������ : ";
			str += e.getComponent().getBounds() + "\n" ;
			txtArea.append(str);
		}
	}
	public ComponentEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,150);
		
		add(txtArea, "Center");
		txtArea.addComponentListener(new MyComponentAdapter());
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
	ComponentEventWin myWin = new ComponentEventWin();
	myWin.setTitle("������Ʈ �̺�Ʈ ó��");

	}

}