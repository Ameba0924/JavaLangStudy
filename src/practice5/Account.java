/*연습문제6 다음을 만족하는 클래스 Account를 작성하시오.
- 다음의 2개의 필드를 선언
- 위 모든 필드에 대한 getter와 setter의 구현
- 위 모든 필드를 사용하는 가능한 모든 생성자의 구현*/
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
		owner = "이현호";
		balance = 0;
	}

	Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}

	Account(long balance) {
		this.owner = "이현호";
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
	Account at = new Account("이현호",10000);
	at.print();
	
		}
}
