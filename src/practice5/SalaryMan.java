/*��������5. ������ �����ϴ� Ŭ���� SalaryMan�� �ۼ��Ͻÿ�.
- �ʵ� salary�� �� �޿����� �����ϸ�, int������ �ʱ� ������ 1000000 ����
- �޼ҵ� getAnnualGross()�� ������ ��ȯ�ϴ� �޼ҵ�� ���޿� ���ʽ� 500%�� ���
- �⺻ �����ڿ��� �ʵ� salary�� �ʱ� ���� ����ϸ�, ������ ������ �����ڿ��� ���ڰ� �� �޿������� ����
- ������ ���� ��ü�� �����Ͽ� �޼ҵ� getAnnualGrass()�� ȣ���Ͽ� ���*/
package practice5;

public class SalaryMan {
	int pay;
	
	public void pp(){
		System.out.print("���ʽ��� ��ģ ������ : ");
	}

	SalaryMan() {
		pay = 1000000;
	}

	SalaryMan(int amount) {
		this.pay = amount;
	}

	public int getAnnualGross() {
		return pay * 12 + pay * 5;
	}

	public static void main(String[] args) {
		SalaryMan sm = new SalaryMan();
		sm.pp();
		System.out.println(new SalaryMan().getAnnualGross());
		sm.pp();
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}

}
