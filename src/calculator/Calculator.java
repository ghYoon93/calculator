package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 값 입력 : ");
        int first = scanner.nextInt();

        int result = first;
        while (true) {
            System.out.println("기호 : ");
            String symbol = scanner.next();

            if ("quit".equals(symbol)) {
                System.out.println("최종 결과 값 : " + result);
                break;
            }

            System.out.println("두 번째 값 입력 : ");
            int second = scanner.nextInt();

            if ("+".equals(symbol)) {
                result += second;
                System.out.println("덧셈 : " + result);
            } else if ("-".equals(symbol)) {
                result -= second;
                System.out.println("뺄셈 : " + result);
            } else if ("*".equals(symbol)) {
                result *= second;
                System.out.println("곱셈 : " + result);
            } else if ("/".equals(symbol)) {
                result /= second;
                System.out.println("나눗셈 : " + result);
            } else {
                System.out.println("사칙연산 기호가 아닙니다.");
            }

        }
    }
}
