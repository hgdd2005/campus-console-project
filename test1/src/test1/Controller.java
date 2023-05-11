package test1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
	Gugu gugu = new Gugu();
	int c = 0;
	Scanner scan = new Scanner(System.in);

	public void numberInput() {
		try {
			c = scan.nextInt(); // 여기서 구하고자 하는 구구단의 값을 입력해준다
		} catch (InputMismatchException e) {
			System.out.println("error : 잘못된 입력입니다.");
			c = scan.nextInt(); // 예외처리가 익숙치 않음
		}
	}

	public int numberOutput() {
		return c; // 이제 입력된 값이 c로써 쓰일 것!
	}

}
