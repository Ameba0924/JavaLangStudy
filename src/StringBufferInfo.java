
public class StringBufferInfo {

	public static void main(String[] args) { // String Ŭ������ ���ڿ������� ���Ŀ� ����ؼ� ������.
		//���� -- a.substring���� ��ɾ����� (int start,int end-1)������ ���ڿ��� �̾�����̶� �����Ǽ� ����Ǵ°�������.
		StringBuffer a = new StringBuffer("Java");
		
		
		System.out.println(a.capacity());
		System.out.println(a.append(" language"));
		System.out.println(a.insert(5, "programming "));
		System.out.println(a.capacity());
		System.out.println(a);
		System.out.println(a.replace(0,4,"Objective-C"));
		System.out.println(a.substring(0,9));
		System.out.println(a);
		System.out.println(a.charAt(10));
		a.setCharAt(10,'D');
		System.out.println(a);
		// ���� void System.out.println(a.setCharAt(10,'E')); �����ϱ�!!!
		//System.out.println(a.setLength(9););
		//�������� ��ȯ������ void ��� 
		a.setLength(9);
		System.out.println(a);
		
		
		

	}

}
