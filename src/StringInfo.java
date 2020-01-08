
public class StringInfo {

	public static void main(String[] args) {
		String snum = "20123458";
		String name = new String("김경석");
		String dept = new String(new char[] {'컴','퓨','터','공','학'});
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));
		System.out.printf("%d %n", snum.compareTo("20123456"));
		System.out.printf("%s ",name);
		System.out.printf("%s ",name.replace('김', '강'));
		System.out.printf("%s ",name); //String 클래스에서 반환메소드실행시 수정되지않고 새로운 문자열을 생성해서보여줬기때문에 그대로 김경식이 출력된다. 
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


