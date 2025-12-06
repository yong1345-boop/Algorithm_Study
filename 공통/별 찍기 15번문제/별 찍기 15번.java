import java.util.Scanner;

/**
 * 규칙:
 *  - 각 줄 i (1-index)
 *    - 앞 공백: N - i
 *    - 별: 항상 하나 출력
 *    - 만약 i >= 2 이면, 별 사이 공백: 2*i - 3 를 출력하고 별 하나 추가
 */
public class Star15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력용 Scanner
        int N = sc.nextInt();                // 줄 수 N

        // 각 줄을 차례대로 출력
        for (int i = 1; i <= N; i++) {
            // 1) 앞 공백: N - i 개
            for (int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }

            // 2) 첫 번째 별 출력 (모든 줄 공통)
            System.out.print("*");

            // 3) 가운데 공백 및 두 번째 별: i >= 2 일 때만
            if (i >= 2) {
                int innerSpaces = 2 * i - 3; // 별 사이 공백 개수
                for (int s = 0; s < innerSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.print("*"); // 두 번째 별
            }

            // 줄바꿈
            System.out.println();
        }

        sc.close(); // Scanner 닫기
    }
}
