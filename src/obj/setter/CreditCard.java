package obj.setter;

public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	public void use (int amount) {
		balance += amount;
		System.out.println(owner + "현재 카드 사용액 : " + balance);
	}
	
	public void payBill(int amount) {
		balance -= amount;
		addPoint(amount);
		System.out.println("지불액 : " + amount + ", 지불잔액 : " + balance);
		
		}
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("보너스 포인트: "+point);
		
	}
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {	//this.number = number;
		if(number < 1000_0000_0000_0000L) {
			System.err.println("잘못된 카드 번호입니다.");
			return;
		}
		
		this.number = number;
	}
	public int getPoint() {
		return point ;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
	
	}

}
