package inheritance.typecast;

public class DownCasting {

	public static void main(String[] args) {
		Person she = new Person("�̼Ҷ�" , 200111);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;
		//Faculty f = (Faculty) she; //������ ������ ������ f�� person ������������ faculty������������ �����Ƿ�. �������
		Person p = new Staff("����",1233111,"������б�",1);
		//Staff = p; // ��ȯ�� �������ʾ����Ƿ� ������ �Ͼ 
		Staff s = (Staff) p; // ����ȯ �Ϸ� . S �� person�������������������� Staff������ (4��������) �� ���������� 
		s.division = " ����ó ";
		System.out.print(p.name + " " + p.number); //Person�� �ٿ�ĳ������ �̷�������� Staff�� ���� ���� ������ ������ 
		System.out.println(s.univ + " " + s.number);
		System.out.println(s.division);
	}

}
