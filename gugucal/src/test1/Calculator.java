package test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void Cal() {
		int first = 0;
		char operator;
		int second = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해 주세요.");
		while (true) {
			try {
				first = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				s = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}

		System.out.println("연산자를 입력해 주세요.(+ - * / 중 입력)");
		while (true) { // 연산자 제대로 입력했는지 확인을 위한 while문
			operator = s.next().charAt(0);
			if (operator == '+') {
				break;
			} else if (operator == '-') {
				break;
			} else if (operator == '*') {
				break;
			} else if (operator == '/') {
				break;
			} else {
				System.out.println("잘못된 연산자입니다. 다시 입력해 주세요.");
			}
		}

		System.out.println("두번째 정수를 입력해 주세요.");
		while (true) {
			try {
				second = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				s = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}

		System.out.print("결과값은 ");
		if (operator == '+') {
			System.out.print(first + second);
		} else if (operator == '-') {
			System.out.print(first - second);
		} else if (operator == '*') {
			System.out.print(first * second);
		} else {
			System.out.print(first / second);
		}
		System.out.println(" 입니다.");
		System.out.println("----------------");
	}

}
