/*��������1.���� ������ �����ϴ� Ŭ������ �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ǥ���Է����� �� ���� ������ �Է� �޾� ���� ���� ����� ���
- ǥ���Է¿��� ������ �ƴ� ���� �ԷµǸ� ���ܰ� �߻��Ͽ� ������ �ߴܵǴµ�, �̸� ���� ó���Ͽ� ����ǵ��� ����
- ���� �ҽ��� ����*/
package practice8;

import java.util.*;

public class Thread1 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �ΰ� �Է��Ͻÿ�  : ");
		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
