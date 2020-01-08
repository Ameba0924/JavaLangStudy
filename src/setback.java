import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;


public class setback extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public setback(String title) {
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle(title);
	}
	
	public void decorate() {
		Container con = getContentPane();
		con.setBackground(Color.YELLOW);
		}
	
	


	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		setback sb = new setback("내가만든 윈도우");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex){
		  }
		sb.decorate();

	}

}
