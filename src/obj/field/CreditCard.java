package obj.field;

public class CreditCard {
	
	private long number; // 16�ڸ� ī���ȣ
	public String owner;  // ���� �̸� 

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		//CreditCard myCard;
		//myCard = new Creditcard();
		myCard.number = 3456_7654_8756_5677L;
		myCard.owner = "���缮";
				System.out.print("ī���ȣ: " +  myCard.number);
				System.out.println(", ī�������: " + myCard.owner);
	}

}
