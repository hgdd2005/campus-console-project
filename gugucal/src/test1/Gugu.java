package test1;

import java.util.Scanner;

public class Gugu {
	public static void gugugu() {
		int a;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("구하고자하는 단 수를 입력해 주세요.");
			System.out.println("(수의 범위는 1~999까지입니다.)");
			a = sc.nextInt();
			if (a >= 1 && a <= 999) { // 숫자의 범위는 1~999까지
				for (int i = 1; i < 10; i++) {
					System.out.println("" + a + "x" + i + " = " + a * i);
				}
				System.out.println("------------------");
				break;
			} else { // 숫자 범위 넘어가면 에러메시지
				System.out.println("유효하지 않은 숫자입니다.");
				System.out.println("다시 입력해 주세요.");

			}
		}
	}
}