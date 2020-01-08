package inheritance.abstractinterface;

public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(double x, double y, double width,double height) {
		super(x,y);
		this.width = width;
		this.height = height;
		
	}
	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("���� : %f ,���� : %f" , this.width,this.height);
		System.out.printf("�簢�� ����: %f\n",width*height);
		// TODO Auto-generated method stub
	}

}
