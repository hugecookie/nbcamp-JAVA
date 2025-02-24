package chapter1;

import java.util.Scanner;

public class Week10 {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // 1. 두 정수의 합을 반환하는 메서드
        System.out.println("=== 1. 두 정수의 합 구하기 ===");
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int result = sum(num1, num2);
        System.out.println("두 수의 합: " + result);
        System.out.println();

        // 2. 문자열을 출력하는 메서드
        System.out.println("=== 2. 문자열 출력 ===");
        System.out.print("출력할 문자열을 입력하세요: ");
        scanner.nextLine(); // 버퍼 비우기
        String message = scanner.nextLine();

        printString(message);
        System.out.println();

        // 3. 배열의 모든 요소 출력
        System.out.println("=== 3. 배열 요소 출력 ===");
        int[] numbers = {10, 20, 30, 40, 50};

        printArray(numbers);

        scanner.close();
    }

    // 두 정수의 합을 반환하는 메서드
    public int sum(int a, int b) {
        return a + b;
    }

    // 문자열을 출력하는 메서드
    public void printString(String message) {
        System.out.println("입력한 문자열: " + message);
    }

    // 배열의 모든 요소를 출력하는 메서드
    public void printArray(int[] array) {
        System.out.println("배열 요소:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
