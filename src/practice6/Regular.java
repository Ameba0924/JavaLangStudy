/*��������2. ������ �����ϴ� Ŭ���� Regular�� �ۼ��Ͻÿ�.
- Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ����
- ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ���� ������ ȣ��
- Setter : ���� ���� �ʵ带 ����
- �޼ҵ� printInfo() : ���ڴ� ���� "������"�̶�� ������ ������ ���*/
package practice6;

public class Regular extends Employee {

	// ������
	Regular(String name, int age, String address, String bu) {
		// ���� ������ ȣ��
		super(name, age, address, bu);
	}

	public void setpay(int pay) {
		this.pay = pay;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("������");
		System.out.println("���� : " + pay);
	}

}