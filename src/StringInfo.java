
public class StringInfo {

	public static void main(String[] args) {
		String snum = "20123458";
		String name = new String("��漮");
		String dept = new String(new char[] {'��','ǻ','��','��','��'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));
		System.out.printf("%d %n", snum.compareTo("20123456"));
		System.out.printf("%s ",name);
		System.out.printf("%s ",name.replace('��', '��'));
		System.out.printf("%s ",name); //String Ŭ�������� ��ȯ�޼ҵ����� ���������ʰ� ���ο� ���ڿ��� �����ؼ�������⶧���� �״�� ������ ��µȴ�. 
		System.out.printf("%s ", dept);
		System.out.printf("%s ",dept.substring(0, 3));
		System.out.printf("%d %n",dept.length());
		System.out.printf("%s ",java.indexOf('a'));
		System.out.printf("%s ",java.concat(" language"));
		System.out.printf("%s ",java.replace('j', 'J'));
		System.out.printf("%s ",java.toUpperCase());
		System.out.printf("%s ",java.equals("JAVA"));
		System.out.printf("%s ",java.equalsIgnoreCase("JAVA"));
		System.out.printf("%s ",java.substring(1));
		}

	}


