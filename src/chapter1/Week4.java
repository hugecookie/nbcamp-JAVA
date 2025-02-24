package chapter1;

public class Week4 {

    public void run() {
        // 1. 변수 선언 및 초기화
        int age = 25;
        double height = 175.5;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("=== 1. 변수 선언 및 출력 ===");
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("학점: " + grade);
        System.out.println("학생 여부: " + isStudent);
        System.out.println();

        // 2. 변수 이름 규칙 확인
        int myAge = 30;
        int _score = 90;
        int $price = 1000;

        System.out.println("=== 2. 변수 이름 규칙 확인 ===");
        System.out.println("나이: " + myAge);
        System.out.println("점수: " + _score);
        System.out.println("가격: " + $price);
        System.out.println();

        // 3. 자료형별 변수 사용
        byte smallNumber = 127;
        short shortNumber = 32000;
        int normalNumber = 100000;
        long bigNumber = 10000000000L;

        float pi = 3.14f;
        double largePi = 3.14159265358979;

        char letter = 'J';
        boolean isJavaFun = true;

        System.out.println("=== 3. 자료형별 변수 사용 ===");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + normalNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + pi);
        System.out.println("double: " + largePi);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println();

        // 4. 자동 형변환
        int num = 10;
        double doubleNum = num;

        System.out.println("=== 4. 자동 형변환 ===");
        System.out.println("정수 값: " + num);
        System.out.println("자동 변환된 실수 값: " + doubleNum);
        System.out.println();

        // 5. 강제 형변환
        double piValue = 3.14;
        int intPi = (int) piValue;

        System.out.println("=== 5. 강제 형변환 ===");
        System.out.println("원래 실수 값: " + piValue);
        System.out.println("강제 변환된 정수 값: " + intPi);
        System.out.println();

        // 6. 상수 선언
        final double PI = 3.14159;
        final int MAX_SCORE = 100;

        System.out.println("=== 6. 상수 사용 ===");
        System.out.println("원주율: " + PI);
        System.out.println("최대 점수: " + MAX_SCORE);
        System.out.println();

        // 7. 변수 연산
        int a = 10;
        int b = 20;
        int sum = a + b;
        int product = a * b;
        double division = (double) a / b;

        System.out.println("=== 7. 변수 연산 ===");
        System.out.println("더하기: " + sum);
        System.out.println("곱하기: " + product);
        System.out.println("나누기: " + division);
        System.out.println();
    }
}
