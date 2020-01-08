public class ObjectMath {
	
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
		System.out.println(Math.PI);
		System.out.println(Math.round(-3.5));
		System.out.println(Math.abs(-3.4));
		System.out.println(Math.pow(3,4)); // Math 클래스 멤버 모두 정적 표현 . 클래스이름으로 참조
		
	}

}
