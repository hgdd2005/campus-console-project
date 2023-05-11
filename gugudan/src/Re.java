class Re {																	// 종료 확인 여부
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void retry(String text) {
		if (text.equals("n")) {												// 입력이 n이맞을시
			System.out.println("프로그램 종료");
			System.exit(0);													// 프로그램 종료
		}
	}
}
