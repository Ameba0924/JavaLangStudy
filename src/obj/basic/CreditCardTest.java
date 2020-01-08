package obj.basic;

public class CreditCardTest {

	public static void main(String[] args) {
	CreditCard yourCard = new CreditCard();
	//다음과 같이 변수 선언과 객체 생성 대입의 분리 가능 
	//CreditCard yourCard
	//youtCard = new CreditCard();
	
	yourCard.owner = new String("이민정");
	//yourCard.number = 1111_2222_3333_4444L; // 오류 발생
	//System.out.println("카드번호: " + yourCard.number); // 오류발생 
	System.out.println(",카드 소유자 : " + yourCard.owner);
	yourCard.use(150000);
	yourCard.use(100000);
	yourCard.payBill(100000);
	
	}

}
