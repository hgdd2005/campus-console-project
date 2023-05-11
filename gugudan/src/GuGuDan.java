public class GuGuDan { // 구구단 계산
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		int num = Integer.parseInt(number); // 원하는 단을 String에서 int로 변환
		if (0 < num && num <= 999) //원하는 단의 범위 파악
		{
			for (int dan = 1; dan < 10; dan++) {
				System.out.println("	" + num + "*" + dan + "=" + (num * dan)); // 구구단을 출력
			}
		} else {
			System.out.println("입력하신 숫자는 음수이거나 큽니다."); // 범위가 벗어나면 다시
		}
	}
}