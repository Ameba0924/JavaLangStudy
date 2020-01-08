package inheritance.abstractinterface;

public abstract class Shape {
	protected double x,y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public void drawCenter() {
		System.out.println("중심좌표(x,y) = " +x +" , " + y);
	}
		public abstract void draw(); // 추상클래스 끝에 ; 로 마무리지어줌 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape(3.4,1,2);  추상클래스는 객체화될수없다.  

	}

}
