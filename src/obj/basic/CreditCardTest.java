package obj.basic;

public class CreditCardTest {

	public static void main(String[] args) {
	CreditCard yourCard = new CreditCard();
	//������ ���� ���� ����� ��ü ���� ������ �и� ���� 
	//CreditCard yourCard
	//youtCard = new CreditCard();
	
	yourCard.owner = new String("�̹���");
	//yourCard.number = 1111_2222_3333_4444L; // ���� �߻�
	//System.out.println("ī���ȣ: " + yourCard.number); // �����߻� 
	System.out.println(",ī�� ������ : " + yourCard.owner);
	yourCard.use(150000);
	yourCard.use(100000);
	yourCard.payBill(100000);
	
	}

}
