package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("������",2333342,0.34);
		myAccount.deposit(40000);
		myAccount.withdraw(20000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		//System.out.println(myAccount.open); // ���ٺҰ� protected �ٸ���Ű�� ��������������. 
		//System.out.println(myAccount.balance); // private ���ٺҰ� 
		//System.out.println(myAccount.number); // default ���� ��Ű�������� ��밡��.
		
		CheckAccount cAccount = new CheckAccount("�̹���",233342,30000);
		cAccount.deposit(200300);
		cAccount.withdraw(20000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name); // public ��밡�� 
		//System.out.println(cAccount.open); // protected �ٸ���Ű�� �Ϻο�������밡�� ����� ����Ŭ����. 
		//System.out.println(cAccount.number); // ���ٺҰ� 
		//System.out.println(c.Account.balance); //���ٺҰ� 
		System.out.println(cAccount.minimum); // minimum defaul���������ڷ� ������Ű�������� ��밡��

	}

}
