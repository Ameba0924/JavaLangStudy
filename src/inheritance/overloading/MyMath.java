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
		//return x*y; //������ �ʵ� x�� y�� �����޼ҵ� ���ο��� ����Ҽ�����.
		//return this.x * this.y; // this�� super �� �����޼ҵ峻�ο��� ����Ҽ�����.
	}
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4,6.7);
		System.out.println(math.multiply());
		System.out.println(MyMath.multiply(3.4,6.7)); 
		//System.out.println(math.multiply(3.4,6.7)); �����޼ҵ��� multiply�޼ҵ带 
		//�������� math �� �̿��ؼ� �����ϴµ� MyMath.�� �����ϴ�������?
				
		
	}

}