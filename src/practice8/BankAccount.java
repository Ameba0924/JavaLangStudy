//연습문제2.다음 조건을 만족하도록 클래스 BankAccount와 이를 테스트하는 클래스 Ex03 프로그램을 작성하시오. 
package practice8;

class InvalidWithdraw extends Exception { // 예외처리만듬
	private static final long serialVersionUID = 1L;

	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

public class BankAccount {
	int min;
	int money;

	public BankAccount(int minmoney) {
		this.min = minmoney;
		money = 0;
	}

	void deposit(int money) throws Exception {
		if (money < 0)
			throw new Exception("입금 금액을 입력하세요");
		else {
			this.money += money;
		}
	}

	void withdraw(int money) throws Exception {
		this.money -= money;

		if (money < 0)

			throw new Exception("음수입니다. 출금처리하지못했습니다.");

		else {
			if (this.money < this.min)
				throw new Exception("최대 인출 금액을 초과했습니다.");

		}
	}
}
