package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희",2333342,0.34);
		myAccount.deposit(40000);
		myAccount.withdraw(20000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		//System.out.println(myAccount.open); // 접근불가 protected 다른패키지 하위에서만가능. 
		//System.out.println(myAccount.balance); // private 접근불가 
		//System.out.println(myAccount.number); // default 동일 패키지에서만 사용가능.
		
		CheckAccount cAccount = new CheckAccount("이민정",233342,30000);
		cAccount.deposit(200300);
		cAccount.withdraw(20000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name); // public 사용가능 
		//System.out.println(cAccount.open); // protected 다른패키지 하부에서만사용가능 여기는 상위클래스. 
		//System.out.println(cAccount.number); // 접근불가 
		//System.out.println(c.Account.balance); //접근불가 
		System.out.println(cAccount.minimum); // minimum defaul접근지정자로 동일패키지내에서 사용가능

	}

}
