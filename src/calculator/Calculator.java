package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = getFirstValue(scanner);
        int result = first;
        while (true) {
            String symbol = getSymbol(scanner);

            if ("quit".equals(symbol)) {
                print(result);
                break;
            }
            int second = getSecondValue(scanner);

            result = calculate(symbol, result, second);
        }
    }

    private static int getFirstValue(Scanner scanner) {
        System.out.println("첫 번째 값 입력 : ");
        int first = scanner.nextInt();
        System.out.println(first);
        return first;
    }

    private static int getSecondValue(Scanner scanner) {
        System.out.println("두 번째 값 입력 : ");
        int second = scanner.nextInt();
        System.out.println(second);
        return second;

    }

    private static String getSymbol(Scanner scanner) {
        System.out.println("기호 : ");
        return scanner.next();
    }

    private static int calculate(String symbol, int first, int second) {
        boolean notCalculated = true;
        int result = first;
        if ("+".equals(symbol)) {
            result = first + second;
            System.out.println("덧셈 : " + result);
            notCalculated = false;
        }
        if ("-".equals(symbol)) {
            result = first - second;
            System.out.println("뺄셈 : " + result);
            notCalculated = false;
        }
        if ("*".equals(symbol)) {
            result = first * second;
            System.out.println("곱셈 : " + result);
            notCalculated = false;
        }
        if ("/".equals(symbol)) {
            result = first / second;
            System.out.println("나눗셈 : " + result);
            notCalculated = false;
        }
        if (notCalculated) {
            System.out.println("사칙연산 기호가 아닙니다.");
        }
        return result;
    }

    private static void print(int result) {
        System.out.println("최종 결과 값 : " + result);
    }
}
