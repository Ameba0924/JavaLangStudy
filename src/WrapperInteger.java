
public class WrapperInteger {

	public static void main(String[] args) {
		Integer age = new Integer(20);
		Integer snum = new Integer("20121105");
		
		System.out.println("���� : " + age.intValue());
		System.out.println("�й� : " + snum.intValue());
		System.out.println(age.equals(snum));
		
		System.out.println(Integer.parseInt("24567"));
		System.out.println(Integer.parseInt("ff",16)); // 16��������int������ ��ȯ ��Ŵ
		System.out.println(Integer.toBinaryString(255));// 255�� 2���� ���ڿ��� ��ȯ 
		System.out.println(Integer.toString(255,16)); //255�� 16���� ���ڿ��� ��ȯ 
		
		// TODO Auto-generated method stub

	}

}
