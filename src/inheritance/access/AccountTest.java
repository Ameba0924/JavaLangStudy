package inheritance.access;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("°­¹Î°æ",233111,0.33);
		myAccount.deposit(400000);
		myAccount.withdraw(30000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
		// System.out.println(myAccount.Balance);
	}

}
