package inheritance.typecast;

public class Faculty extends Person {
	public String univ;
	public long number; //��������ȣ
	
	public Faculty(String name,long number,String univ, long idNumber) {
		super(name,number); // �̸��� �ֹι�ȣ ���
		this.univ = univ;
		this.number = idNumber;
	}
	
	public long getSNumber() {
		return super.number; // �ֹι�ȣ ��ȯ �޼ҵ� 
	}
}

