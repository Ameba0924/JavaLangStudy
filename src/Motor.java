
public class Motor extends Vehicle {
	public String name = "�ڵ���"; // �̸�
	public int displacement;  // ��ⷮ
	
	public void printinfo() {
		System.out.print("name : " + this.name);
		System.out.println(", �ִ�ӵ�: " + maxSpeed + " km");;
		System.out.print("����: " + seater + " ��");
		System.out.println(", ��ⷮ: " + displacement + " cc ");
	}
	public static void main(String[] args) {
	 Motor myCar = new Motor(); /// ��ü ���� mycar�� MotorŬ������ ��Ʈ���ϰڴ�. 
	 myCar.maxSpeed = 160;
	 myCar.seater = 5;
	 myCar.displacement = 1500;
	 myCar.printinfo();

	}

}
