
public class BoxingUnboxing {

	public static void main(String[] args) {
		//Double radius = new Double(2.59);
		Double radius = 2.59; //Boxing
		//double r = radius.doubleValue();
		double r = radius; //unboxing
		System.out.print("반지름: " + r + ", 원면적: ");
		System.out.println(radius*radius*Math.PI);
		
		Integer x =5, y=3 ; // Boxing
		System.out.printf("%d + %d = %d %n ", x,y,x+y); //unboxing
		Boolean b = true; // Boxing
		System.out.printf("%b %n",b); // unboxing
		

	}

}
