package inheritance.overriding;

public class Staff extends Faculty {
public String division;

	public Staff(String name, long number , String univ , long idNumber ,  String division) {
		super(name,number,univ,idNumber);
		this.division = division;
		
	}
	
	public void printInfo() { 
		System.out.print("이름 : " + super.name + "주민번호: "  + super.getSNumber());
		System.out.print(" 대학 : " + univ + "직원번호 : " + super.number);
		System.out.println("부서 " + this.division );
	} //printinfo 메소드를staff에서 재정의 하위클래스에서 상위클래스 Person의 printinfo메소드를 재정의 
	
	public void FacultyInfo() {
		super.printInfo();
	}
	public static void main(String[] args) {
	
		Person she = new Person("이소라" , 11111); 
		she.printInfo(); // person 클래스에있는 print문을 읽어옴 
		
		Faculty ft = new Faculty("김영태",22222,"서울대",1);
		ft.printInfo(); // faculty 클래스에 있는 print문을 읽어옴 
		
		Staff st = new Staff("김상기",33333,"서강대",2,"교학처");
		st.printInfo(); // st 에잇는 프린트문을읽어옴
		st.FacultyInfo(); // st정보로 super.printinfo(faculty) 클래스에잇는 print메소드를 읽어옴
		
	}

}
