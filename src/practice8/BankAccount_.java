/*��������3.������ ������ Ŭ���� InvalidWithdraw�� BankAccount�� ���� ������ �����ϵ��� �ٽ� �����Ͽ� Ŭ���� ex03���� �׽�Ʈ�Ͻÿ�.
�� Ŭ���� Ex03�� �����ϸ� ������ ���� ������ ���忡�� ���ܰ� �߻��ϵ��� BankAccount�� ������ �����ÿ�
(�� ��Ű���� ���� �߻� �� ��ȣ�� �޶� �������)
Ŭ���� Ex03���� ���� �ҽ��� ���������� ������ ���� InvalidWithdraw�� ��üũ ���ܷ� �ۼ��Ͻÿ�
package practice8;
class InvalidWithdraw extends RuntimeException { //Runtime ��üũ����ó�� 
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
				throw new Exception("�����Դϴ� ����� �Ա��ϼ���. ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			this.money += money;
			System.out.printf("�Ա�����  : �Աݱݾ�=>%d, �ܾ� =>%d\n", money, this.money);
		}
	}

	void withdraw(int money) {
		this.money -= money;
		if (money < 0)
			try {
				throw new Exception("����� �Է��Ͻÿ�.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			if (this.money < this.min)
				try {
					throw new Exception("���ó�� �ʰ� ���� �߻� ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			else
				System.out.printf("�������  : ��ݱݾ�=%d, �ܾ� =%d\n", money, this.money);
		}
	}
}*/
