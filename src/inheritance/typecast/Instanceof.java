package inheritance.typecast;

public class Instanceof {

	public static void main(String[] args) {
		Person she = new Person("이소라",112334);
		if (she instanceof Staff) {
			Staff st1 = (Staff) she;
			
		}else {
			System.out.println("she는 Staff 의 객체가 아닙니다");
		}
		
		Person p = new Staff("김상기",11111,"서울대",1);
		if(p instanceof Staff) {
			Staff st2 = (Staff) p;
			System.out.println("p는 Staff의 객체가 맞습니다");
		}
}
}

