package example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        double num1 = scanner.nextDouble(); // 첫 번째 숫자를 입력 받음

        System.out.print("두 번째 숫자를 입력하세요 : ");
        double num2 = scanner.nextDouble(); // 두 번쨰 숫자를 입력 받음

        System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
        char operator = scanner.next().charAt(0); // 연산자를 입력받음

        double result = 0.0; // 결과값을 저장할 변수 선언

        switch(operator) { // 계산 수행
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다");
                return; // 잘못된 연산자일경우 프로그램 종료
        }

        System.out.println("결과 : " + result); // 계산 결과 출력
    }
}
