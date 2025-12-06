import java.util.Scanner;

/**
 * 규칙:
 *  - i번째 줄 기준
 *     1) 앞 공백: N - i
 *     2) 별과 공백을 번갈아 i개 출력 → "* * * ..."
 *
 * 예: i = 4 → "* * * *"
 */
public class Star16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            // 1) 앞 공백 출력
            for (int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }

            // 2) 별 + 공백 반복 (i번)
            for (int star = 0; star < i; star++) {
                System.out.print("*");

                // 마지막 별 뒤에는 공백 출력 안 함
                if (star < i - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}
