/*��������4. ���� ������ �����ϵ��� ������ PrimeNumber01 ���α׷��� �ۼ��Ͽ� Ŭ���� Ex04�� main() �޼ҵ忡�� �׽�Ʈ�Ͻÿ�.
- Ŭ���� PrimeNumber01�� 1���� ������ �������� ���ڱ��� �Ҽ��� ���Ͽ� ����ϴ� ���α׷�
- Ŭ���� Ex04�� main() �޼ҵ忡�� ������ �����ϸ� 1���� 20������ �Ҽ��� ������ ���*/
package practice8;

public class PrimeNumber01 extends Thread {
	int a; // ���ڸ� ������ ����

	PrimeNumber01(int a) { // ���� a ������ �Ҽ��� ���� ����������������
		this.a = a;
	}

	public void run() {
		int sosu = 1;
		for (int i = 2; i <= a; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					sosu = 0; // �Ҽ����ƴմϴ�
					break;
				}
			}
			if (sosu == 1) {
				System.out.print(i + " ");
			}
			sosu = 1;
		}
	}
}