package inheritance.access;

public class SavingAccount extends Account {
	public double rates; // ÀÌÀÚÀ²

public SavingAccount(String name, int number , double rates) {
	super(name,number);
	this.rates = rates;
	
}
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("±èÅÂÈñ",2323123,0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		System.out.println(myAccount.number);
		System.out.println(myAccount.open);
		// System.out.println(myAccount.balance);

	}

}
