/*��������6. ���� ������ �����ϵ��� Ŭ���� Car�� �ۼ��Ͻÿ�.
- �ʵ�� ���������� maxSpeed(�ִ�ӵ�)�� speed(����ӵ�)�� ����
- ������ : �ִ�ӵ��� �����ϴ� ������ ����
- �޼ҵ� : speedUp(), speedUp(int)�� speedDown(), speedDown(int) ���� �޼ҵ� �����ε� ����
- ������ Ŭ���� Car ��ü�� SpeedUp()�� speedDown()�� �����ϴ� �ҽ�*/
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
			System.out.print("�ִ�ӵ����� ���� �ִ�ӵ��� ����, ");
			speed = maxSpeed;	}
		if (speed < 0) {
			System.out.print("�ӵ��� 0���� �۾��� 0���� ����, ");
			speed += a; 
		}
		System.out.println("�ִ�ӵ�: " + maxSpeed + ", ����ӵ� : " + speed);
	}
	public void speedUp() {
		speed += 5;
		System.out.print("speedUp() ȣ�� : ");
		print(5);
	}

	public void speedUp(int b) {
		System.out.print("speedUp(" + b + ") ȣ�� : ");
		if (b < 0) { 
			System.out.print("���� : �ӵ��� �����̹Ƿ� 0���� ���� : ");
			b = 0;
		}
		speed += b;
		print(b);
	}

	public void speedDown() {
		speed -= 5;
		System.out.print("speedDown() ȣ�� : ");
		print(5);
	}

	public void speedDown(int s) {
		System.out.print("speedDown(" + s + ") ȣ�� : ");
		if (s < 0) {
			System.out.print("���� : �ӵ��� �����̹Ƿ� 0���� ���� : ");
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
