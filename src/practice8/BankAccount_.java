/*연습문제3.위에서 구현한 클래스 InvalidWithdraw와 BankAccount를 다음 조건을 만족하도록 다시 구현하여 클래스 ex03에서 테스트하시오.
위 클래스 Ex03을 실행하면 다음과 같이 마지막 문장에서 예외가 발생하도록 BankAccount를 적절히 구현시오
(단 패키지와 예외 발생 줄 번호는 달라도 상관없음)
클래스 Ex03에서 다음 소스에 문법오류가 없도록 예외 InvalidWithdraw를 비체크 예외로 작성하시오
package practice8;
class InvalidWithdraw extends RuntimeException { //Runtime 비체크예외처리 
	private static final long serialVersionUID = 1L;

	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class BankAccount_ {
	int min;
	int money;

	public BankAccount_(int minmoney) {
		this.min = minmoney;
		money = 0;
	}

	void deposit(int money) {
		if (money < 0)
			try {
				throw new Exception("음수입니다 양수로 입금하세요. ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			this.money += money;
			System.out.printf("입금정상  : 입금금액=>%d, 잔액 =>%d\n", money, this.money);
		}
	}

	void withdraw(int money) {
		this.money -= money;
		if (money < 0)
			try {
				throw new Exception("양수를 입력하시오.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			if (this.money < this.min)
				try {
					throw new Exception("출금처리 초과 예외 발생 ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			else
				System.out.printf("출금정상  : 출금금액=%d, 잔액 =%d\n", money, this.money);
		}
	}
}*/
