package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 값 입력 : ");
        int first = scanner.nextInt();
        System.out.println("두 번째 값 입력 : ");
        int second = scanner.nextInt();

        System.out.println("덧셈 : " + (first + second));
        System.out.println("뺄셈 : " + (first - second));
        System.out.println("곱셈 : " + (first * second));
        System.out.println("나눗셈 : " + (first / second));
    }
}
