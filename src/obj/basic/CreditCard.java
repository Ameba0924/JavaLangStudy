package obj.basic;

public class CreditCard {
private long number;
public String owner;
private int point;
private int balance;

//ī����޼ҵ�

	public void use(int amount) {
		balance += amount;
		System.out.println("���� ī�� ���� : " + balance);
	}
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("���Ҿ� : " + amount + ", �����ܾ� : " + balance);
	}
	
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("���ʽ� ����Ʈ: "+point);
		
	}
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_1222_3333_4444L;
		myCard.owner = "�̼���";
		System.out.println("ī���ȣ :" + myCard.number);
		System.out.println(", ī������� : " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);

	}

}
