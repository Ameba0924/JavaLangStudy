package practice7;

import java.util.*;

public class Clendars {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int year;
		int month;
		int date;
		String day = null;

		System.out.print("�⵵�� �Է��Ͻÿ�");
		year = input.nextInt();
		System.out.print("���� �Է��Ͻÿ�");
		month = input.nextInt();
		System.out.print("���� �Է��Ͻÿ�");
		date = input.nextInt();

		Calendar C = Calendar.getInstance();
		C.set(Calendar.YEAR, year);
		C.set(Calendar.MONTH, month - 1);
		C.set(Calendar.DATE, date);

		if (C.get(Calendar.DAY_OF_WEEK) == 1) {
			day = " �Ͽ���";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 2) {
			day = " ������";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 3) {
			day = " ȭ����";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 4) {
			day = " ������";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 5) {
			day = " �����";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 6) {
			day = " �ݿ���";
		} else if (C.get(Calendar.DAY_OF_WEEK) == 7) {
			day = " �����";
		}

		System.out.println(day);

	}

}