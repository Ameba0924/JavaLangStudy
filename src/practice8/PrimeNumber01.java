/*연습문제4. 다음 조건을 만족하도록 스레드 PrimeNumber01 프로그램을 작성하여 클래스 Ex04의 main() 메소드에서 테스트하시오.
- 클래스 PrimeNumber01은 1에서 지정된 생성자의 인자까지 소수를 구하여 출력하는 프로그램
- 클래스 Ex04의 main() 메소드에서 다음을 실행하면 1에서 20사이의 소수인 다음이 출력*/
package practice8;

public class PrimeNumber01 extends Thread {
	int a; // 인자를 저장할 변수

	PrimeNumber01(int a) { // 숫자 a 까지의 소수를 구할 범위값생성자지정
		this.a = a;
	}

	public void run() {
		int sosu = 1;
		for (int i = 2; i <= a; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					sosu = 0; // 소수가아닙니다
					break;
				}
			}
			if (sosu == 1) {
				System.out.print(i + " ");
			}
			sosu = 1;
		}
	}
}