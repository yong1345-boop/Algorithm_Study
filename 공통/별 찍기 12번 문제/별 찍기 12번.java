import java.util.Scanner;

public class Star12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 위쪽 (1 ~ N)
        for (int i = 1; i <= N; i++) {
            // 공백
            for (int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }
            // 별
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 (N+1 ~ 2N-1)
        for (int i = N - 1; i >= 1; i--) {
            // 공백
            for (int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }
            // 별
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
