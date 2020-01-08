package inheritance.overloading;

public class MyMath {
	double x,y;
	
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double multiply() {
		return x*y;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
		//return x*y; //비정적 필드 x와 y를 정적메소드 내부에서 사용할수없다.
		//return this.x * this.y; // this와 super 는 정적메소드내부에서 사용할수없다.
	}
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4,6.7);
		System.out.println(math.multiply());
		System.out.println(MyMath.multiply(3.4,6.7)); 
		//System.out.println(math.multiply(3.4,6.7)); 정적메소드인 multiply메소드를 
		//참조변수 math 를 이용해서 참조하는데 MyMath.로 참조하는이유는?
				
		
	}

}
