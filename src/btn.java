import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;


public class btn extends JFrame{
	private static final long serialVersionUID = 1L;

	
	public btn(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,180);
		make();
		setVisible(true);
		}
	
	public void  make() {
		JPanel p = new JPanel();
		p.add(new JCheckBox("스위스", true));
		p.add(new JCheckBox("영국", true));
		p.add(new JCheckBox("스페인", true));
		
		JPanel p2 = new JPanel();
		JRadioButton r1 = new JRadioButton("남자");
		JRadioButton r2 = new JRadioButton("여자",true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1); bg.add(r2);
		
		p2.add(r1); p2.add(r2);
		
		JTabbedPane tp = new JTabbedPane();
		tp.add("체크박스",p);
		tp.addTab("라디오버튼",p2);
		
		add(tp);
		
	}
	
				
		public static void main(String args[]) {
			btn b = new btn("내가만든 탭바튼");
		
		}
		
}

