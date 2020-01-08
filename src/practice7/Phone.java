/*연습문제9.클래스 HashMap을 사용하여 이름과 전화번호가 저장되는 간단한 전화번호부를 만들어 이름으로 검색하는 프로그램을 작성하시오.
- 입출력 결과 화면*/

package practice7;

import java.util.*;

public class Phone {

	public static void main(String[] args) {

		HashMap<String, String> number = new HashMap<String, String>();
		number.put("김미현", "010-3675-8754");
		number.put("이현호", "010-5126-5770");
		number.put("하지영", "011-3982-3929");
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("이름을 입력하시오.");
		name = s.nextLine();
		
		System.out.println("입력하신 " + name + "의 전화번호는 " + number.get(name) + "입니다.");

	}

}
