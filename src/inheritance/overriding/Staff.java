package inheritance.overriding;

public class Staff extends Faculty {
public String division;

	public Staff(String name, long number , String univ , long idNumber ,  String division) {
		super(name,number,univ,idNumber);
		this.division = division;
		
	}
	
	public void printInfo() { 
		System.out.print("�̸� : " + super.name + "�ֹι�ȣ: "  + super.getSNumber());
		System.out.print(" ���� : " + univ + "������ȣ : " + super.number);
		System.out.println("�μ� " + this.division );
	} //printinfo �޼ҵ带staff���� ������ ����Ŭ�������� ����Ŭ���� Person�� printinfo�޼ҵ带 ������ 
	
	public void FacultyInfo() {
		super.printInfo();
	}
	public static void main(String[] args) {
	
		Person she = new Person("�̼Ҷ�" , 11111); 
		she.printInfo(); // person Ŭ�������ִ� print���� �о�� 
		
		Faculty ft = new Faculty("�迵��",22222,"�����",1);
		ft.printInfo(); // faculty Ŭ������ �ִ� print���� �о�� 
		
		Staff st = new Staff("����",33333,"������",2,"����ó");
		st.printInfo(); // st ���մ� ����Ʈ�����о��
		st.FacultyInfo(); // st������ super.printinfo(faculty) Ŭ�������մ� print�޼ҵ带 �о��
		
	}

}
