package com.db.test;

public class CallBy01 {
	public static void main(String[] args) {
		String str = new String("Hello");
		int[] x = { 1, 2, 3, 4, 5 };

		System.out.println("---�迭�ε����� ���� �Ҵ��ϸ� 'x[1] = 500' �ּ������� ������ �����---");
		changeArray1(x);
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");

		System.out.println("---�迭������ �迭�� �ּҸ� �Ҵ��ϸ� 'x = new int[]{6,7,8,9,0}' �ּ������� ������� ����---");
		changeArray2(x);
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");

		System.out.println("---�������� str�� ���ο� ��ü�� �ּҸ� �Ҵ��ߴµ��� /'str = new String(/'Java/')/' �ּ�����(str)�� ������� ����---");
		changeString(str);
		System.out.print(str);
		System.out.println("\n------------------");

		Point pt = new Point(10, 10);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---�ּ���(��������)�� �����ؼ�  ������� ���� �Ҵ��ϸ� �ּ����� ������� ���� �ٲ�---");
		changePoint1(pt);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---�������� pt�� �����ڷ� ���ο� ��ü�� �ּҸ� �Ҵ��ߴµ��� /'pt = new Point(50, 50)/' �ּ�����(pt)�� ������� ����---");
		changePoint2(pt);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---�ּ����� �����ؼ� setter �� ������� ���� �Ҵ��ϸ� �ּ����� ������� ���� �ٲ�---");
		changePoint3(pt);
		System.out.print(pt);

	}

	static void changeString(String str) {
		str = new String("Java");

	}

	static void changeArray1(int[] x) {
		x[1] = 500;
	}

	static void changeArray2(int[] x) {
		x = new int[] { 6, 7, 8, 9, 0 };
	}

	static void changePoint1(Point pt) {
		pt.x = 20;
		pt.y = 20;
	}

	static void changePoint2(Point pt) {
		pt = new Point(50, 50);
	}

	static void changePoint3(Point pt) {
		pt.setX(80);
		pt.setY(80);
	}

}
