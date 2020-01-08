/*연습문제1.다음 조건을 만족하는 클래스를 구현하여 테스트하는 프로그램을 작성하시오.
- 표준입력으로 두 개의 정수를 입력 받아 곱셈 연산 결과를 출력
- 표준입력에서 정수가 아닌 값이 입력되면 예외가 발새하여 실행이 중단되는데, 이를 예외 처리하여 실행되도록 구현
- 다음 소스를 참고*/
package practice8;

import java.util.*;

public class Thread1 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 두개 입력하시오  : ");
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
