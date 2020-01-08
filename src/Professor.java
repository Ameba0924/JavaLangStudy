
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
		Professor pf = new Professor("Àü»êÇÐ°ú" , "È«¼º·æ");
		System.out.println(pf.dept);
		System.out.println(pf.name);
	}
}

