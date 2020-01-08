//��������2.���� ������ �����ϵ��� Ŭ���� BankAccount�� �̸� �׽�Ʈ�ϴ� Ŭ���� Ex03 ���α׷��� �ۼ��Ͻÿ�. 
package practice8;

class InvalidWithdraw extends Exception { // ����ó������
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
			throw new Exception("�Ա� �ݾ��� �Է��ϼ���");
		else {
			this.money += money;
		}
	}

	void withdraw(int money) throws Exception {
		this.money -= money;

		if (money < 0)

			throw new Exception("�����Դϴ�. ���ó���������߽��ϴ�.");

		else {
			if (this.money < this.min)
				throw new Exception("�ִ� ���� �ݾ��� �ʰ��߽��ϴ�.");

		}
	}
}
