import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Object> data = new Vector<Object>(3);
		data.addElement(2012);
		data.add("년도");
		data.addElement(4.35);
		data.add(2,"목표 학점");
		data.insertElementAt("자바강좌",0 );
		System.out.println("size = " + data.size()); // 객체의개수 5개 
		System.out.println("capacity = " + data.capacity()); // 원래3인데 꽉차 2배가되서 6
		System.out.println(data.toString()); //모든원소를 순서대로 출력한다. (배열화시켜서)
	}

}
