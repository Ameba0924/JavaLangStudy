package practice6;

import java.util.*;

public class Student extends Person {
	String univ;
	String hak;
	int number;
	double score[];

	Student(String name, int age, String address, String univ, String hak, int number) {
		super(name, age, address);
		this.univ = univ;
		this.hak = hak;
		this.number = number;
		score = new double[8];
	}

	public double average() {
		double sum = 0;
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		return sum / 8;
	}

	public void printInfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + univ);
		System.out.println("학과 : " + hak);
		System.out.println("학번 : " + number);
		System.out.println("\n");
		System.out.println("학점을 입력하시오");
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "학기 학점 :  ");
			score[i] = s.nextDouble();
		}
		System.out.println("");
		System.out.println("평균 :  " + average() + "");
	}
}
