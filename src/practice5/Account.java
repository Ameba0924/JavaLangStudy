/*��������6 ������ �����ϴ� Ŭ���� Account�� �ۼ��Ͻÿ�.
- ������ 2���� �ʵ带 ����
- �� ��� �ʵ忡 ���� getter�� setter�� ����
- �� ��� �ʵ带 ����ϴ� ������ ��� �������� ����*/
package practice5;

public class Account {
	private String owner;
	private long balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	Account() {
		owner = "����ȣ";
		balance = 0;
	}

	Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}

	Account(long balance) {
		this.owner = "����ȣ";
		this.balance = balance;
	}

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
		}
	
	public void print() {
		System.out.println(owner);
		System.out.println(balance);
	}

	public static void main(String[] args) {
	Account at = new Account("����ȣ",10000);
	at.print();
	
		}
}
