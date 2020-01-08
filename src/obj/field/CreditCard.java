package obj.field;

public class CreditCard {
	
	private long number; // 16자리 카드번호
	public String owner;  // 주인 이름 

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		//CreditCard myCard;
		//myCard = new Creditcard();
		myCard.number = 3456_7654_8756_5677L;
		myCard.owner = "유재석";
				System.out.print("카드번호: " +  myCard.number);
				System.out.println(", 카드소유자: " + myCard.owner);
	}

}
