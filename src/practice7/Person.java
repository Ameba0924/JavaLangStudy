/*1. ���� ������ �����ϴ� Ŭ���� Person�� �����Ͽ� �׽�Ʈ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
- Ŭ���� Person�� �̸��� �����ϴ� �ʵ� ����
- Ŭ���� Person�� ���� Ŭ���� Object�� �޼ҵ� equals()�� �������̵��Ͽ� �̸��� ������ true�� ��ȯ�ϴ� �޼ҵ� ����
- ������ ���� �ҽ��� Ŭ���� Person�� ����*/
package practice7;

public class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	public boolean Result(Person p) {
		if (this.name.equals(p.name)) {
			return true;
		} else {
			return false;
		}
	}
}