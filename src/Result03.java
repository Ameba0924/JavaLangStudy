
public class Result03 {
		int data = 0;

public Result03() {
	System.out.println(data);
	data++;
}

public Result03(int data) {
System.out.println(this.data);
	this.data += data;
	
}
	public static void main(String[] args) {
		Result03 r1 = new Result03();
		System.out.println(r1.data);
		Result03 r2 = new Result03(5);
		System.out.println(r2.data);
	}

}
