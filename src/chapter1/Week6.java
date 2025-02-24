package chapter1;

public class Week6 {

    public void run() {
        // 1. 산술 연산자
        System.out.println("=== 1. 산술 연산자 ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // 정수 나눗셈
        System.out.println("a % b = " + (a % b)); // 나머지 연산
        System.out.println();

        // 2. 대입 연산자
        System.out.println("=== 2. 대입 연산자 ===");
        int c = 5;
        c += 3;
        System.out.println("c += 3 -> " + c);
        c *= 2;
        System.out.println("c *= 2 -> " + c);
        System.out.println();

        // 3. 비교 연산자
        System.out.println("=== 3. 비교 연산자 ===");
        System.out.println("a == b -> " + (a == b));
        System.out.println("a > b -> " + (a > b));
        System.out.println();

        // 4. 논리 연산자
        System.out.println("=== 4. 논리 연산자 ===");
        boolean x = true, y = false;
        System.out.println("x && y -> " + (x && y));
        System.out.println("x || y -> " + (x || y));
        System.out.println("!x -> " + (!x));
        System.out.println();

        // 5. 증감 연산자
        System.out.println("=== 5. 증감 연산자 ===");
        int num = 5;
        System.out.println("num++ -> " + (num++)); // 사용 후 증가
        System.out.println("++num -> " + (++num)); // 먼저 증가 후 사용
        System.out.println();

        // 6. 문자열 비교
        System.out.println("=== 6. 문자열 비교 ===");
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1 == str2 -> " + (str1 == str2)); // 참조 비교
        System.out.println("str1.equals(str2) -> " + str1.equals(str2)); // 내용 비교
    }
}
