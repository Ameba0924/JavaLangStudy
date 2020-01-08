/*연습문제2. 다음을 만족하는 클래스 Regular를 작성하시오.
- 클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 월급 정보 필드를 지정
- 메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력*/
package practice6;

public class Regular extends Employee {

	// 생성자
	Regular(String name, int age, String address, String bu) {
		// 상위 생성자 호출
		super(name, age, address, bu);
	}

	public void setpay(int pay) {
		this.pay = pay;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("졍규직");
		System.out.println("월급 : " + pay);
	}

}