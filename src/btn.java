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
		p.add(new JCheckBox("������", true));
		p.add(new JCheckBox("����", true));
		p.add(new JCheckBox("������", true));
		
		JPanel p2 = new JPanel();
		JRadioButton r1 = new JRadioButton("����");
		JRadioButton r2 = new JRadioButton("����",true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1); bg.add(r2);
		
		p2.add(r1); p2.add(r2);
		
		JTabbedPane tp = new JTabbedPane();
		tp.add("üũ�ڽ�",p);
		tp.addTab("������ư",p2);
		
		add(tp);
		
	}
	
				
		public static void main(String args[]) {
			btn b = new btn("�������� �ǹ�ư");
		
		}
		
}

