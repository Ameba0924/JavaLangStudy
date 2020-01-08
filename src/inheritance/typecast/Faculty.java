package inheritance.typecast;

public class Faculty extends Person {
	public String univ;
	public long number; //교직원번호
	
	public Faculty(String name,long number,String univ, long idNumber) {
		super(name,number); // 이름과 주민번호 상속
		this.univ = univ;
		this.number = idNumber;
	}
	
	public long getSNumber() {
		return super.number; // 주민번호 반환 메소드 
	}
}

