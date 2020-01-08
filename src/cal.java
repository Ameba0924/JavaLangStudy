import java.awt.*;
import javax.swing.*;

public class cal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public cal(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,180);
		setTitle(title);
		setLayout(new BorderLayout(10,5));
	makeup();
	make();
	setVisible(true);
	
	}
	
	private void makeup() {
		add(new JTextField(),"North");
	}
	
	private void make() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,4,8,3));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				p.add(new JButton("7"));
		p.add(new JButton("7"));				

	add(p,BorderLayout.CENTER);
	}
	
	
	

	

	public static void main(String[] args) {
		cal ca = new cal("°è»ê±â");
	}

}
