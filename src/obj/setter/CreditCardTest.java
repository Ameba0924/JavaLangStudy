package obj.setter;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner = "������";
		parkCard.setNumber(1231_1234_4444_3333L);
		leeCard.owner = "�̹���";
		leeCard.setNumber(2331_1122_1222_1111L);
		
		parkCard.use(100000);
		leeCard.use(15000);
		parkCard.payBill(50000);
		leeCard.payBill(10000);
		System.out.println(parkCard.owner + " : " + parkCard.getNumber());
		System.out.println("ī���� �ܾ� : " + parkCard.getBalance());
		System.out.println("ī������Ʈ : " + parkCard.getPoint());
		System.out.println(leeCard.owner + " : " + leeCard.getNumber());
		System.out.println("ī���� �ܾ� : " + leeCard.getBalance());
		System.out.println("ī������Ʈ : " + leeCard.getPoint());
		

	}

}
