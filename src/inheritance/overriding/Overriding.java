package inheritance.overriding;

public class Overriding {

	public static void main(String[] args) {
		Person she = new Person("�̼Ҷ�",111);
		she.printInfo();
		//�������ε�
		
		Person i = new Faculty("���ΰ�",2222,"���ϰ���",1);
		i.printInfo(); // �������ε�
		Person a = (Person) i;
		a.printInfo(); // �������ε� ������ü�� Faculty�� printinfo �� �����´� person�� i ������ faculty ��ü�� �����߱⶧��.
		// Person ���ιٲ㵵 �������ε��������� faculty���� ������ ������ printinfo �޼ҵ带 �ҷ��´�.
		//�������ε� 
		
	
		Person he = new Staff("������",989898,"���̴�",8282,"�̻���");
		he.printInfo(); // �������ε� Staff ��ü�����ؼ� Person �� he ������ printinfo �������޼ҵ� ����
		Faculty ft = (Faculty) he; 
		ft.printInfo(); // ��������..�̹� Staff ��ü�� �����߱⶧���� ������ ������ ������ü Staff �� �޼ҵ带�ҷ���. 
		Staff st = (Staff) he;
		st.printInfo();
		st.FacultyInfo(); // staff �� ����ȯ�� ������, FacultyInfo�� printfinfo ������ü�� Super�� �����Ǿ� Faculty �� ������ �ҷ����Ե�����.
		                         //24�� ����.! 
		
		 

	}

}
