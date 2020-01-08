
public class StringBufferInfo {

	public static void main(String[] args) { // String 클래스는 문자열선언후 이후에 계속해서 수정됨.
		//예외 -- a.substring같은 명령어같은경우 (int start,int end-1)까지의 문자열을 뽑아출력이라 수정되서 저장되는값은없음.
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
		// 이유 void System.out.println(a.setCharAt(10,'E')); 질문하기!!!
		//System.out.println(a.setLength(9););
		//마찬가지 반환값없는 void 사용 
		a.setLength(9);
		System.out.println(a);
		
		
		

	}

}
