package practice7;

import java.util.*;

public class Clendars {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int year;
		int month;
		int date;
		String day = null;

		System.out.print("년도를 입력하시오");
		year = input.nextInt();
		System.out.print("월을 입력하시오");
		month = input.nextInt();
		System.out.print("일을 입력하시오");
		date = input.nextInt();

		Calendar C = Calendar.getInstance();
		C.set(Calendar.YEAR, year);
		C.set(Calendar.MONTH, month - 1);
		C.set(Calendar.DATE, date);

		if (C.get(Calendar.DAY_OF_WEEK) == 1) {
			day = " 일요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 2) {
			day = " 월요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 3) {
			day = " 화요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 4) {
			day = " 수요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 5) {
			day = " 목요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 6) {
			day = " 금요일";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 7) {
			day = " 토요일";
		}

		System.out.println(day);

	}

}