package inheritance.typecast;

public class UpCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라",2045123);
		System.out.println(she.name + "  " + she.number);
		
		Faculty f = new Faculty("김영태",114422,"서울대",1);
		Person p = f; // 업캐스팅
		System.out.println(p.name + " " + p.number);
		//System.out.println(p.univ); // univ 는 하위클래스객체이므로 참조불가 
		System.out.print(f.name + " " + ((Person)f).number);
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("김상기",992211,"고려대",2);
		s.division = "교학처";
		Person pn = s; // 업캐스팅
		Faculty fn = s; // 업캐스팅 
		System.out.print(pn.name + " " + pn.number);
		System.out.print(fn.univ + " " + fn.number);
		System.out.println(s.division);
	
	}

}
