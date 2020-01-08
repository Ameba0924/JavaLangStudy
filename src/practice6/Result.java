/*다음 조건을 만족하도록 클래스 Person과 Student를 작성하시오.
- 클래스 Person
- 필드 : 이름, 나이, 주소 선언
- 클래스 Student
- 필드 : 학교명, 학과, 학번, 8개 평균평점을 저장할 배열로 선언
- 생성자 : 학교명, 학과, 학번 지정
- 메소드 average() : 8개 학기 평균평점의 평균을 반환
- 클레스 Person과 Student 프로그램 테스트 프로그램의 결과 : 8개 학기의 평균평점은 표준입력으로 받도록한다.*/
package practice6;

public class Result {
	public static void main(String[] args) {
		Student st = new Student("이현호", 27, "서울시 동대문구 장안동", "동양미래대학교", "컴퓨터정보학과", 20111448);
		st.printInfo();
	}
}
