package chapter1;

import java.util.Scanner;

public class Week8 {

    public void run() {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성 (닫지 않음)

        // 2. 구구단 출력
        System.out.println("=== 2. 구구단 출력 ===");
        System.out.print("출력할 구구단을 입력하세요: ");

        if (scanner.hasNextInt()) {
            int dan = scanner.nextInt();
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("올바른 숫자를 입력하세요.");
            scanner.next(); // 잘못된 입력 버퍼 처리
        }
        System.out.println();

        // 🔴 scanner.close(); 제거 → Main에서 닫을 것이므로 필요 없음
    }
}
