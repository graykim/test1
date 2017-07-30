package com.db.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Scanner sc = new Scanner(System.in);

		int n = 0;

		do {
			try {
				System.out.print("정수를 입력하세요 : ");
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				n = 0;
				System.out.println(n);
				System.out.println("예외 발생!!!");
			}
		} while (n==0);

		System.out.printf("입력된 정수 : %s\n", n);
		System.out.println("프로그램 종료");
	}
}
