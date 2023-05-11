package test1;

public class View {
	public static void main(String[] args) {

		Controller con = new Controller();
		Gugu gugu = new Gugu();

		while (true) {
			System.out.println("정수를 입력해 주세요.");
			System.out.println("0을 입력시, 종료합니다.");
			con.numberInput(); // 입력을 controller클래스에서 해결
			if (con.numberOutput() == 0) { // controller에서 입력된 값이 0이라면 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else { // 0이 아닌 정상범주의 값일 경우
				gugu.setNumber(con.numberOutput()); // 입력된 값을 구구단 클래스로 보내고
				gugu.getAnswer(); // 그 값으로 구구단을 계산해달라!
			}
		}
	}
}
