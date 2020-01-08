package obj.setter;

public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	public void use (int amount) {
		balance += amount;
		System.out.println(owner + "���� ī�� ���� : " + balance);
	}
	
	public void payBill(int amount) {
		balance -= amount;
		addPoint(amount);
		System.out.println("���Ҿ� : " + amount + ", �����ܾ� : " + balance);
		
		}
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("���ʽ� ����Ʈ: "+point);
		
	}
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {	//this.number = number;
		if(number < 1000_0000_0000_0000L) {
			System.err.println("�߸��� ī�� ��ȣ�Դϴ�.");
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
