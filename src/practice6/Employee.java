/*��������1. ������ �����ϴ� Ŭ���� Employee�� �ۼ��Ͻÿ�(1���� 4������ ���õ� �����Դϴ�).
- Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ����
- �ʵ�: �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
- �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���*/
package practice6;

public class Employee {
	String name;
	String address;
	String bu;
	int pay;
	int age;

	Employee(String name, int age, String address, String department) {
		this.name = name;
		this.age = age;
		this.bu = department;
		this.address = address;
	}

	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("�μ� : " + bu);
	}
}
