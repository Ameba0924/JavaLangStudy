/*2. 다음 조건을 만족하도록 8개의 랩퍼 클래스 객체를 처리하는 프로그램을 작성하시오.
- 박싱 기능을 사용하여 8개의 랩퍼 클래스의 객체를 생성
- 언박싱 기능과 메소드 printf()를 사용하여 위 객체를 그대로 출력*/
package practice7;

public class rapper {
	static void printf(Object o) {
        System.out.println(o);
    }
    public static void main(String[] args) {
        
        Byte a = 1;
        Integer b = 2;
        Short c = 3;
        Long d = 4l;
        Float e = 5f;
        Double f = 6.0;
       Boolean g = true;
       Character h = 'h';
         
        rapper.printf(a);
        rapper.printf(b);
        rapper.printf(c);
        rapper.printf(d);
        rapper.printf(e);
        rapper.printf(f);
        rapper.printf(g);
        rapper.printf(h);
    }
 
}