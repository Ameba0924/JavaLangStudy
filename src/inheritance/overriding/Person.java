package inheritance.overriding;

public class Person {
	public String name;
	public long number;
	
	public Person(String name,long number) {
		super();
		this.name = name;
		this.number = number;
		
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + this.name + "�ֹι�ȣ: "	 + this.number);
}
}
