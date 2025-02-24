package chapter1;

import java.util.Scanner;

public class Week5 {

    public void run() {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 (닫지 않음)

        // 1. 출력 예제
        System.out.println("=== 1. 출력 예제 ===");
        System.out.print("Hello, ");
        System.out.println("World!");
        System.out.println("Welcome to Java Programming.");
        System.out.printf("이름: %s, 나이: %d, 키: %.2fcm\n", "홍길동", 25, 175.5);
        System.out.println();

        // 2. 입력 예제
        System.out.println("=== 2. 입력 예제 ===");

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); // 문자열 입력

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt(); // 정수 입력
        scanner.nextLine(); // 버퍼 비우기 (nextInt 후 nextLine 문제 방지)

        System.out.print("키를 입력하세요(cm): ");
        double height = scanner.nextDouble(); // 실수 입력

        System.out.println("\n입력된 정보:");
        System.out.printf("이름: %s, 나이: %d, 키: %.2fcm\n", name, age, height);
        System.out.println();

        // 3. 개행 문자 활용 예제
        System.out.println("=== 3. 개행 문자 활용 ===");
        System.out.println("첫 번째 줄\n두 번째 줄\n세 번째 줄");
        System.out.println();

        // 🔴 scanner.close(); 제거 → Main에서 닫을 것이므로 필요 없음
    }
}
