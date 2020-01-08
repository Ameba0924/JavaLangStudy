import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();  //캘린더는 new 를 이용해 객체생성불가능 
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1 ;
		int hour = now.get(Calendar.HOUR);
		int date = now.get(Calendar.DATE);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
	System.out.println(year + " 년" + month + "월" + date +  "일");
	System.out.println(hour + "시" + minute + "분 " + second + "초");
		
	
	}

}
