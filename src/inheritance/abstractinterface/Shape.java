package inheritance.abstractinterface;

public abstract class Shape {
	protected double x,y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public void drawCenter() {
		System.out.println("�߽���ǥ(x,y) = " +x +" , " + y);
	}
		public abstract void draw(); // �߻�Ŭ���� ���� ; �� ������������ 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape(3.4,1,2);  �߻�Ŭ������ ��üȭ�ɼ�����.  

	}

}
