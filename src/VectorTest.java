import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Object> data = new Vector<Object>(3);
		data.addElement(2012);
		data.add("�⵵");
		data.addElement(4.35);
		data.add(2,"��ǥ ����");
		data.insertElementAt("�ڹٰ���",0 );
		System.out.println("size = " + data.size()); // ��ü�ǰ��� 5�� 
		System.out.println("capacity = " + data.capacity()); // ����3�ε� ���� 2�谡�Ǽ� 6
		System.out.println(data.toString()); //�����Ҹ� ������� ����Ѵ�. (�迭ȭ���Ѽ�)
	}

}
