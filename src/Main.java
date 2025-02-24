import chapter1.*; // chapter1 패키지의 모든 클래스 가져오기
import java.util.Scanner; // Scanner import 추가

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 공통 Scanner 객체 생성

        // Week3 클래스의 run() 메서드 호출 (정적 메서드이므로 객체 생성 없이 호출 가능)
        Week3.run();

        // Week4 객체 생성 및 run() 메서드 실행
        Week4 week4 = new Week4();
        week4.run();

        // Week5 객체 생성 및 run() 메서드 실행
        Week5 week5 = new Week5();
        week5.run();

        // Week6 객체 생성 및 run() 메서드 실행
        Week6 week6 = new Week6();
        week6.run();

        // Week7 객체 생성 및 run() 메서드 실행
        Week7 week7 = new Week7();
        week7.run();  // Scanner 객체를 전달

        // Week8 객체 생성 및 run() 메서드 실행
        Week8 week8 = new Week8();
        week8.run();  // Scanner 객체를 전달

        // Week9 객체 생성 및 run() 메서드 실행
        Week9 week9 = new Week9();
        week9.run();

        // Week10 객체 생성 및 run() 메서드 실행
        Week10 week10 = new Week10();
        week10.run();
    }
}
