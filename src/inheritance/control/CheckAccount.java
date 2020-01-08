package inheritance.control;

import inheritance.access.Account;
import inheritance.access.SavingAccount;

public class CheckAccount extends Account {
	long minimum; // 최소 잔액 금액

	public CheckAccount(String name, int number, long minimum) {
		super(name,number);
		this.minimum = minimum;
		super.deposit(minimum);
	}
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 23311,0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(40000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name); // public 만 접근가능 다른패키지이기때문에 
		//System.out.println(myAccount.open); // 접근불가
		//System.out.println(myAccount.number);
		//System.out.println(myAccount.balance);
	
		CheckAccount cAccount = new CheckAccount("이민정",23331,400000);
		cAccount.deposit(400000);
		cAccount.withdraw(30000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name);
		System.out.println(cAccount.open); // protected 선언된open필드가 다른패키지의 하위클래스인 checkAccount에서 실행
		//System.out.println(myAccount.number); //접근불가 
		//System.out.println(myAccount.balance);
		
	
	
	
	}
	
}
