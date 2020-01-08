package inheritance.typecast;

public class UpCasting {

	public static void main(String[] args) {
		Person she = new Person("�̼Ҷ�",2045123);
		System.out.println(she.name + "  " + she.number);
		
		Faculty f = new Faculty("�迵��",114422,"�����",1);
		Person p = f; // ��ĳ����
		System.out.println(p.name + " " + p.number);
		//System.out.println(p.univ); // univ �� ����Ŭ������ü�̹Ƿ� �����Ұ� 
		System.out.print(f.name + " " + ((Person)f).number);
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("����",992211,"�����",2);
		s.division = "����ó";
		Person pn = s; // ��ĳ����
		Faculty fn = s; // ��ĳ���� 
		System.out.print(pn.name + " " + pn.number);
		System.out.print(fn.univ + " " + fn.number);
		System.out.println(s.division);
	
	}

}
