package inheritance.access;

import java.util.*;

public class Account {
	public String name; // 클래스내부 + 동일패키지 + 다른패키지(상위,하위)
	protected Date open; // 클래스내부 + 동일패키지 + 다른패키지(하위)
	/*pakage*/ int number; // 클래스내부 + 동일패키지
	private long balance; //클래스내부에서만
	
	protected Account(String name, int number) { 		 		//protected 생성자 - 내부클래스 + 동일패키지 + 다른패키지(하위)
		this.name = name;
		this.open = new Date(); // 날짜계산 객체변수 생성.
		this.number = number;
		}
	
	public long deposit(long amount) {
		return balance += amount;
	}
	
	public long withdraw(long amount) {
		return balance -= amount;
	}
	
	public long checkBalance() {
		System.out.println(this.name + " 계좌번호 " +this.number + " , 잔액" + this.balance);
	return balance;
	}
}
