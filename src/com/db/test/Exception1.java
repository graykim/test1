package com.db.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");

		Scanner sc = new Scanner(System.in);

		int n = 0;

		do {
			try {
				System.out.print("������ �Է��ϼ��� : ");
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				n = 0;
				System.out.println(n);
				System.out.println("���� �߻�!!!");
			}
		} while (n==0);

		System.out.printf("�Էµ� ���� : %s\n", n);
		System.out.println("���α׷� ����");
	}
}
