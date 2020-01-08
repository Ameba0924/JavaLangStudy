package obj.setter;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner = "박지성";
		parkCard.setNumber(1231_1234_4444_3333L);
		leeCard.owner = "이민정";
		leeCard.setNumber(2331_1122_1222_1111L);
		
		parkCard.use(100000);
		leeCard.use(15000);
		parkCard.payBill(50000);
		leeCard.payBill(10000);
		System.out.println(parkCard.owner + " : " + parkCard.getNumber());
		System.out.println("카드대금 잔액 : " + parkCard.getBalance());
		System.out.println("카드포인트 : " + parkCard.getPoint());
		System.out.println(leeCard.owner + " : " + leeCard.getNumber());
		System.out.println("카드대금 잔액 : " + leeCard.getBalance());
		System.out.println("카드포인트 : " + leeCard.getPoint());
		

	}

}
