package com.db.test;

public class CallBy01 {
	public static void main(String[] args) {
		String str = new String("Hello");
		int[] x = { 1, 2, 3, 4, 5 };

		System.out.println("---배열인덱스에 값을 할당하면 'x[1] = 500' 주소지값이 실제로 변경됨---");
		changeArray1(x);
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");

		System.out.println("---배열변수에 배열의 주소를 할당하면 'x = new int[]{6,7,8,9,0}' 주소지값이 변경되지 않음---");
		changeArray2(x);
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");

		System.out.println("---참조변수 str에 새로운 객체의 주소를 할당했는데도 /'str = new String(/'Java/')/' 주소지값(str)이 변경되지 않음---");
		changeString(str);
		System.out.print(str);
		System.out.println("\n------------------");

		Point pt = new Point(10, 10);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---주소지(참조변수)로 접근해서  멤버변수 값을 할당하면 주소지의 멤버변수 값이 바뀜---");
		changePoint1(pt);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---참조변수 pt에 생성자로 새로운 객체의 주소를 할당했는데도 /'pt = new Point(50, 50)/' 주소지값(pt)이 변경되지 않음---");
		changePoint2(pt);
		System.out.print(pt);
		System.out.println("\n------------------");

		System.out.println("---주소지로 접근해서 setter 로 멤버변수 값을 할당하면 주소지의 멤버변수 값이 바뀜---");
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
