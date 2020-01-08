/*연습문제5. 다음을 만족하는 클래스 SalaryMan을 작성하시오.
- 필드 salary는 월 급여액을 저장하며, int형으로 초기 값으로 1000000 저장
- 메소드 getAnnualGross()는 연봉을 반환하는 메소드로 월급에 보너스 500%로 계싼
- 기본 생성자에서 필드 salary의 초기 값을 사용하며, 정수형 인자인 생성자에서 인자가 월 급여액으로 지정
- 다음과 같이 객체를 생성하여 메소드 getAnnualGrass()를 호출하여 출력*/
package practice5;

public class SalaryMan {
	int pay;
	
	public void pp(){
		System.out.print("보너스를 합친 연봉은 : ");
	}

	SalaryMan() {
		pay = 1000000;
	}

	SalaryMan(int amount) {
		this.pay = amount;
	}

	public int getAnnualGross() {
		return pay * 12 + pay * 5;
	}

	public static void main(String[] args) {
		SalaryMan sm = new SalaryMan();
		sm.pp();
		System.out.println(new SalaryMan().getAnnualGross());
		sm.pp();
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}

}
