/*연습문제6. 다음 조건을 만족하도록 클래스 Car를 작성하시오.
- 필드는 정수형으로 maxSpeed(최대속도)와 speed(현재속도)로 선언
- 생성자 : 최대속도를 지정하는 생성자 구현
- 메소드 : speedUp(), speedUp(int)과 speedDown(), speedDown(int) 으로 메소드 오버로딩 구현
- 다음은 클래스 Car 객체로 SpeedUp()과 speedDown()을 점검하는 소스*/
package practice6;

public class Car {
	private int maxSpeed;
	private int speed;
	Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	public void print(int a) {
		if (speed > maxSpeed) {
			System.out.print("최대속도보다 높아 최대속도로 지정, ");
			speed = maxSpeed;	}
		if (speed < 0) {
			System.out.print("속도가 0보다 작아져 0으로 지정, ");
			speed += a; 
		}
		System.out.println("최대속도: " + maxSpeed + ", 현재속도 : " + speed);
	}
	public void speedUp() {
		speed += 5;
		System.out.print("speedUp() 호출 : ");
		print(5);
	}

	public void speedUp(int b) {
		System.out.print("speedUp(" + b + ") 호출 : ");
		if (b < 0) { 
			System.out.print("오류 : 속도가 음수이므로 0으로 지정 : ");
			b = 0;
		}
		speed += b;
		print(b);
	}

	public void speedDown() {
		speed -= 5;
		System.out.print("speedDown() 호출 : ");
		print(5);
	}

	public void speedDown(int s) {
		System.out.print("speedDown(" + s + ") 호출 : ");
		if (s < 0) {
			System.out.print("오류 : 속도가 음수이므로 0으로 지정 : ");
			s = 0;
		}
		speed -= s;
		print(s);
	}

	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
	}
	}
