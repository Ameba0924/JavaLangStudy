package inheritance.typecast;

public class Instanceof {

	public static void main(String[] args) {
		Person she = new Person("�̼Ҷ�",112334);
		if (she instanceof Staff) {
			Staff st1 = (Staff) she;
			
		}else {
			System.out.println("she�� Staff �� ��ü�� �ƴմϴ�");
		}
		
		Person p = new Staff("����",11111,"�����",1);
		if(p instanceof Staff) {
			Staff st2 = (Staff) p;
			System.out.println("p�� Staff�� ��ü�� �½��ϴ�");
		}
}
}

