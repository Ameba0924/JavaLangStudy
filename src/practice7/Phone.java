/*��������9.Ŭ���� HashMap�� ����Ͽ� �̸��� ��ȭ��ȣ�� ����Ǵ� ������ ��ȭ��ȣ�θ� ����� �̸����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ����� ��� ȭ��*/

package practice7;

import java.util.*;

public class Phone {

	public static void main(String[] args) {

		HashMap<String, String> number = new HashMap<String, String>();
		number.put("�����", "010-3675-8754");
		number.put("����ȣ", "010-5126-5770");
		number.put("������", "011-3982-3929");
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("�̸��� �Է��Ͻÿ�.");
		name = s.nextLine();
		
		System.out.println("�Է��Ͻ� " + name + "�� ��ȭ��ȣ�� " + number.get(name) + "�Դϴ�.");

	}

}
