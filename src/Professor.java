
public class Professor extends Person {
String dept;

public Professor(String dept) {
	super(dept);
	this.dept = dept;
}

	public Professor(String dept,String name) {
		super(name);
		this.dept = dept;
	
	}

	public static void main(String args[]) {
		Professor pf = new Professor("�����а�" , "ȫ����");
		System.out.println(pf.dept);
		System.out.println(pf.name);
	}
}

