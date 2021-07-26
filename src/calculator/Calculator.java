package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 값 입력 : ");
        int first = scanner.nextInt();
        System.out.println("사칙연산 기호 입력 : ");
        String symbol = scanner.next();
        System.out.println("두 번째 값 입력 : ");
        int second = scanner.nextInt();

        if ("+".equals(symbol)) {
            System.out.println("덧셈 : " + (first + second));
        } else if ("-".equals(symbol)) {
            System.out.println("뺄셈 : " + (first - second));
        } else if ("*".equals(symbol)) {
            System.out.println("곱셈 : " + (first * second));
        } else if ("/".equals(symbol)) {
            System.out.println("나눗셈 : " + (first / second));
        } else {
            System.out.println("사칙연산 기호가 아닙니다.");
        }
    }
}
