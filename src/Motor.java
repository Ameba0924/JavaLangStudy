
public class Motor extends Vehicle {
	public String name = "자동차"; // 이름
	public int displacement;  // 배기량
	
	public void printinfo() {
		System.out.print("name : " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km");;
		System.out.print("정원: " + seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc ");
	}
	public static void main(String[] args) {
	 Motor myCar = new Motor(); /// 객체 생성 mycar로 Motor클래스를 컨트롤하겠다. 
	 myCar.maxSpeed = 160;
	 myCar.seater = 5;
	 myCar.displacement = 1500;
	 myCar.printinfo();

	}

}
