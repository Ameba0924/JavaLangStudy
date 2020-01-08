package inheritance.access;

import java.util.*;

public class Account {
	public String name; // Ŭ�������� + ������Ű�� + �ٸ���Ű��(����,����)
	protected Date open; // Ŭ�������� + ������Ű�� + �ٸ���Ű��(����)
	/*pakage*/ int number; // Ŭ�������� + ������Ű��
	private long balance; //Ŭ�������ο�����
	
	protected Account(String name, int number) { 		 		//protected ������ - ����Ŭ���� + ������Ű�� + �ٸ���Ű��(����)
		this.name = name;
		this.open = new Date(); // ��¥��� ��ü���� ����.
		this.number = number;
		}
	
	public long deposit(long amount) {
		return balance += amount;
	}
	
	public long withdraw(long amount) {
		return balance -= amount;
	}
	
	public long checkBalance() {
		System.out.println(this.name + " ���¹�ȣ " +this.number + " , �ܾ�" + this.balance);
	return balance;
	}
}
