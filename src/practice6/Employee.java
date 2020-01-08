/*연습문제1. 다음을 만족하는 클래스 Employee를 작성하시오(1에서 4번까지 관련된 문제입니다).
- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력*/
package practice6;

public class Employee {
	String name;
	String address;
	String bu;
	int pay;
	int age;

	Employee(String name, int age, String address, String department) {
		this.name = name;
		this.age = age;
		this.bu = department;
		this.address = address;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("부서 : " + bu);
	}
}
