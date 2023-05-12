package test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugu {
	private int integer;

	public void gugugu(int integer) {
		this.integer = integer;
		if (integer >= 1 && integer <= 999) { // 숫자의 범위는 1~999까지
			for (int i = 1; i < 10; i++) {
				System.out.println("" + integer + "x" + i + " = " + integer * i);
			}
			System.out.println("------------------");
		} else { // 숫자 범위 넘어가면 에러메시지
			System.out.println("유효하지 않은 숫자입니다.");

		}
	}
}
