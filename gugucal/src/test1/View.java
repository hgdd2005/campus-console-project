package test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Gugu gugu = new Gugu();
		Calculator calc = new Calculator();

		while (true) {
			try {
				System.out.println("원하시는 메뉴를 선택해 주세요.");
				System.out.println("1 : 계산기");
				System.out.println("2 : 구구단");
				System.out.println("0 : 종료");
				int menu = s.nextInt();
				if (menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (menu == 1) {
					calc.Cal();
				} else if (menu == 2) {
					System.out.println("구하고자 하는 단 수를 입력해 주세요.");
					System.out.println("(수의 범위는 1~999까지입니다.)");
					while (true) {
						try {
							gugu.setNumber(s.nextInt());
							System.out.println("입력하신 단 수는 "+gugu.getNumber()+"단 입니다");
							gugu.gugugu();
							break;
						} catch (InputMismatchException e) {
							s = new Scanner(System.in);
							System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
						}
					}
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				}
			} catch (InputMismatchException e) {
				s = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");

			}
		}
	}
}
