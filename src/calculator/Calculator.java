package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Input.getFirstValue(scanner);
        int result = first;
        while (true) {
            String symbol = Input.getSymbol(scanner);

            if ("quit".equals(symbol)) {
                Output.print(result);
                break;
            }
            int second = Input.getSecondValue(scanner);

            result = calculate(symbol, result, second);
        }
    }

    public static int calculate(String symbol, int first, int second) {
        String operator = "";
        int result = first;
        if ("+".equals(symbol)) {
            operator = "덧셈";
            result = first + second;
        }
        if ("-".equals(symbol)) {
            operator = "뺄셈";
            result = first - second;
        }
        if ("*".equals(symbol)) {
            operator = "곱셈";
            result = first * second;
        }
        if ("/".equals(symbol)) {
            operator = "나눗셈";
            result = first / second;
        }
        if ("".equals(operator)) {
            System.out.println("사칙연산 기호가 아닙니다.");
            return result;
        }
        System.out.println(operator + ": " + result);
        return result;
    }
}
