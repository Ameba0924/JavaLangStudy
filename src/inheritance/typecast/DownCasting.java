package inheritance.typecast;

public class DownCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라" , 200111);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;
		//Faculty f = (Faculty) she; //문법상 오류는 없으나 f에 person 정보는있으나 faculty에대한정보가 없으므로. 실행오류
		Person p = new Staff("김상기",1233111,"서울대학교",1);
		//Staff = p; // 변환형 맞추지않았으므로 오류가 일어남 
		Staff s = (Staff) p; // 형변환 완료 . S 는 person의정보를가지고있으며 Staff의정보 (4가지인자) 를 가지고있음 
		s.division = " 교학처 ";
		System.out.print(p.name + " " + p.number); //Person의 다운캐스팅이 이루어졌음로 Staff의 형을 가져 정보를 가져옴 
		System.out.println(s.univ + " " + s.number);
		System.out.println(s.division);
	}

}
