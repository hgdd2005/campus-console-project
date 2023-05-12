package test1;

import java.util.Scanner;

public class Calculator {

	public static void Cal() {
		int a;
		char b;
		int c;
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해 주세요.");
		a = s.nextInt();
		
		System.out.println("연산자를 입력해 주세요.(+ - * / 중 입력)");
		while(true) { // 연산자 제대로 입력했는지 확인을 위한 while문
			b = s.next().charAt(0);
			if (b == '+') {
				break;
			}else if (b == '-') {
				break;
			}else if (b == '*') {
				break;
			}else if (b == '/') {
				break;
			}else {
				System.out.println("잘못된 연산자입니다. 다시 입력해 주세요.");
			}
		}
		
		System.out.println("두번째 정수를 입력해 주세요.");
		c = s.nextInt();
		
		System.out.print("결과값은 ");
		if(b == '+') {
			System.out.print(a + c);
		}else if (b == '-') {
			System.out.print(a - c);
		}else if (b == '*') {
			System.out.print(a * c);
		}else {
			System.out.print(a / c);
		}
		System.out.println(" 입니다.");
		System.out.println("----------------");
	}

}
