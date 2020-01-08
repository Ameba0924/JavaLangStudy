/*연습문제1.다음을 만족하는 Student 클래스를 작성하시오.
- String 형의 학과와 정수형의 학번을 필드로 선언
- Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력*/
package practice5;

public class Student {
	String hak;
	int number;

	Student(String a, int b) {
		hak = a;
		number = b;
	}

	public void pp() {
		System.out.println("학과 : " + hak);
		System.out.println("학번 : " + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("컴퓨터정보학과", 20111448);
		st.pp();
	}

}

/*
 * 연습문제2 package practice5;
 * 
 * public class Student { private String hak; private int number;
 * 
 * public String gethak() { return hak; }
 * 
 * public void sethak(String hak) { this.hak = hak; }
 * 
 * public int getnumber() { return number; }
 * 
 * public void setnumber(int number) { this.number = number; }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Student st= new Student(); st.sethak("컴퓨터정보학과"); st.setnumber(20111448);
 * System.out.println("학과 : " + st.gethak()); System.out.println("학번 : " +
 * st.getnumber()); } }
 */