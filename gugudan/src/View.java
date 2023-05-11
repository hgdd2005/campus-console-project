import java.util.Scanner;
import java.io.IOException;

public class View { // 화면이 출력됩니다.
	public void Screen() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 프로그램 입력 :  (구구단 1, 계산기 2)");
			String num = scan.next();
			if (num.equals("1")) { // 1을 입력하면 구구단
				System.out.println("구구단 프로그램 \n");
				System.out.println("원하시는 단을 입력 하십시오");
				String number = scan.next();
				if (GugudanisInteger(number)) { // 입력하신 숫자가 정수인지 판단
					GuGuDan guguDan = new GuGuDan();// Gugudan 클래스
					guguDan.setNumber(number);
				}
			} else if (num.equals("2")) {
				System.out.println("계산기 프로그램입니다..)\n");
				System.out.println("첫번째 숫자 입력");
				String number1 = scan.next();
				System.out.println("기호를 입력 하십시오(/,*,-,+)");
				String sign = scan.next();
				System.out.println("두 번째 숫자 입력");
				String number2 = scan.next();
				if (CalcultorisInteger2(number1, number2)) { // 입력한 숫자가
					Calcultor calcultor = new Calcultor();//
					calcultor.iscalculate(number1, sign, number2); // Calcultor
					if (calcultor.getResult() == 0) {
						System.out.println(sign + "은 올바르지 않은 기호 입니다."); // 기호가 올바르지 않을 시 다시 실행
					}
					else{
						System.out.println(number1 + sign + number2 + '=' + calcultor.getResult());
					}
				}
			} else {// 입력이 올바르지 않을시
				System.out.println("입력이 올 바르지 않습니다.");
			}
			System.out.println("종료 하시겠습니까?:(원할시 n만 입력)");
			String check = scan.next();
			Re re = new Re();
			re.retry(check);
		}
	}

	public static boolean GugudanisInteger(String judgment) { // 구구단 할때 정수가 올바른지 판단
		try {
			Integer.parseInt(judgment);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 정수가 아닙니다.");
			return false;
		}
	}

	public static boolean CalcultorisInteger2(String judgment0, String judgment2) { // 계산기 실행시 정수가 올바른지 판단
		try {
			Integer.parseInt(judgment0);
			Integer.parseInt(judgment2);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 정수가 아닙니다.");
			return false;
		}
	}
}