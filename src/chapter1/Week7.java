package chapter1;

import java.util.Scanner;

public class Week7 {

    public void run() {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 (닫지 않음)

        // 1. 짝수/홀수 판별
        System.out.println("=== 1. 짝수/홀수 판별 ===");
        System.out.print("정수를 입력하세요: ");
        if (scanner.hasNextInt()) { // 입력값이 정수인지 확인 후 처리
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + "은(는) 짝수입니다.");
            } else {
                System.out.println(number + "은(는) 홀수입니다.");
            }
        } else {
            System.out.println("올바른 정수를 입력하세요.");
            scanner.next(); // 잘못된 입력 버퍼 정리
        }
        System.out.println();

        // 🔴 scanner.close(); 제거 → Main에서 닫을 것이므로 필요 없음
    }
}
