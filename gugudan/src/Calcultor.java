public class Calcultor { //계산기
	private String number1; // 첫번째 숫자
	private String sign;//기호
	private String number2;// 두번째 숫자
	private int result;//게산 값

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumer2(String number2) {
		this.number2 = number2;
	}

	public void iscalculate(String number1, String sign, String number2) { // 
		int num1 = Integer.parseInt(number1);// 첫 번째 숫자 String을 int변환
		int num2 = Integer.parseInt(number2); // 두 번째 숫자String을 int변환
		if (sign.equals("+")) { // sign의 무엇인지에 따라 계산
			result = num1 + num2;
		} else if (sign.equals("-")) {
			result = num1 - num2;
		} else if (sign.equals("*")) {
			result = num1 * num2;
		} else if (sign.equals("/")) {
			result = num1 / num2;
		} else {
			result=0;
		}
	}

	public int getResult() {
		return result;
	}
}