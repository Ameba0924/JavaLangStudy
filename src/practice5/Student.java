/*��������1.������ �����ϴ� Student Ŭ������ �ۼ��Ͻÿ�.
- String ���� �а��� �������� �й��� �ʵ�� ����
- Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���*/
package practice5;

public class Student {
	String hak;
	int number;

	Student(String a, int b) {
		hak = a;
		number = b;
	}

	public void pp() {
		System.out.println("�а� : " + hak);
		System.out.println("�й� : " + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("��ǻ�������а�", 20111448);
		st.pp();
	}

}

/*
 * ��������2 package practice5;
 * 
 * public class Student { private String hak; private int number;
 * 
 * public String gethak() { return hak; }
 * 
 * public void sethak(String hak) { this.hak = hak; }
 * 
 * public int getnumber() { return number; }
 * 
 * public void setnumber(int number) { this.number = number; }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Student st= new Student(); st.sethak("��ǻ�������а�"); st.setnumber(20111448);
 * System.out.println("�а� : " + st.gethak()); System.out.println("�й� : " +
 * st.getnumber()); } }
 */