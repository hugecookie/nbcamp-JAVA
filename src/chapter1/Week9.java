package chapter1;

public class Week9 {

    public void run() {
        // 1. 배열 요소의 합 구하기
        System.out.println("=== 1. 배열 요소의 합 구하기 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("배열 요소의 합: " + sum);
        System.out.println();

        // 2. 최대값과 최소값 찾기
        System.out.println("=== 2. 최대값과 최소값 찾기 ===");
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println();

        // 3. 2차원 배열의 행과 열의 합 구하기
        System.out.println("=== 3. 2차원 배열의 행과 열의 합 구하기 ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 각 행의 합
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println((i + 1) + "번째 행의 합: " + rowSum);
        }
        System.out.println();

        // 각 열의 합
        for (int i = 0; i < matrix[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colSum += matrix[j][i];
            }
            System.out.println((i + 1) + "번째 열의 합: " + colSum);
        }
    }
}
