package calculator;

import java.util.Scanner;

public class Input {
    public static int getFirstValue(Scanner scanner) {
        System.out.println("첫 번째 값 입력 : ");
        int first = scanner.nextInt();
        System.out.println(first);
        return first;
    }

    public static int getSecondValue(Scanner scanner) {
        System.out.println("두 번째 값 입력 : ");
        int second = scanner.nextInt();
        System.out.println(second);
        return second;
    }

    public static String getSymbol(Scanner scanner) {
        System.out.println("기호 : ");
        return scanner.next();
    }
}
