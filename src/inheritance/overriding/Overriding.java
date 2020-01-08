package inheritance.overriding;

public class Overriding {

	public static void main(String[] args) {
		Person she = new Person("이소라",111);
		she.printInfo();
		//동적바인딩
		
		Person i = new Faculty("강민경",2222,"인하공전",1);
		i.printInfo(); // 동적바인딩
		Person a = (Person) i;
		a.printInfo(); // 동적바인딩 하위객체인 Faculty에 printinfo 를 가져온다 person형 i 변수에 faculty 객체를 대입했기때문.
		// Person 으로바꿔도 동적바인딩으로인해 faculty에서 마지막 구현된 printinfo 메소드를 불러온다.
		//동적바인딩 
		
	
		Person he = new Staff("하지영",989898,"동미대",8282,"이쁜이");
		he.printInfo(); // 동적바인딩 Staff 객체대입해서 Person 형 he 변수가 printinfo 스태프메소드 구현
		Faculty ft = (Faculty) he; 
		ft.printInfo(); // 마찬가지..이미 Staff 객체로 대입했기때문에 마지막 구현된 하위객체 Staff 의 메소드를불러옴. 
		Staff st = (Staff) he;
		st.printInfo();
		st.FacultyInfo(); // staff 로 형변환을 했으나, FacultyInfo의 printfinfo 정보자체가 Super로 지정되어 Faculty 의 정보를 불러오게되있음.
		                         //24행 질문.! 
		
		 

	}

}
