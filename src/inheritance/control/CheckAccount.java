package inheritance.control;

import inheritance.access.Account;
import inheritance.access.SavingAccount;

public class CheckAccount extends Account {
	long minimum; // �ּ� �ܾ� �ݾ�

	public CheckAccount(String name, int number, long minimum) {
		super(name,number);
		this.minimum = minimum;
		super.deposit(minimum);
	}
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("������", 23311,0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(40000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name); // public �� ���ٰ��� �ٸ���Ű���̱⶧���� 
		//System.out.println(myAccount.open); // ���ٺҰ�
		//System.out.println(myAccount.number);
		//System.out.println(myAccount.balance);
	
		CheckAccount cAccount = new CheckAccount("�̹���",23331,400000);
		cAccount.deposit(400000);
		cAccount.withdraw(30000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name);
		System.out.println(cAccount.open); // protected �����open�ʵ尡 �ٸ���Ű���� ����Ŭ������ checkAccount���� ����
		//System.out.println(myAccount.number); //���ٺҰ� 
		//System.out.println(myAccount.balance);
		
	
	
	
	}
	
}
