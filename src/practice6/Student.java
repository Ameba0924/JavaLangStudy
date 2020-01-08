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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("�б� : " + univ);
		System.out.println("�а� : " + hak);
		System.out.println("�й� : " + number);
		System.out.println("\n");
		System.out.println("������ �Է��Ͻÿ�");
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "�б� ���� :  ");
			score[i] = s.nextDouble();
		}
		System.out.println("");
		System.out.println("��� :  " + average() + "");
	}
}
