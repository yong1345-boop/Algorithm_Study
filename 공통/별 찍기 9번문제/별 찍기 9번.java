import java.util.Scanner;

public class Star9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 윗부분: 별이 줄어드는 부분 (1 ~ N)
        for (int i = 1; i <= N; i++) {
            // 앞 공백 출력
            for (int s = 0; s < i - 1; s++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int star = 0; star < 2 * (N - i) + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 아랫부분: 별이 다시 늘어나는 부분 (N+1 ~ 2N-1)
        for (int i = N + 1; i <= 2 * N - 1; i++) {
            // 앞 공백
            for (int s = 0; s < 2 * N - i - 1; s++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int star = 0; star < 2 * (i - N) + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
