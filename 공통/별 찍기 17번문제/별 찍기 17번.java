import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N이 1인 경우
        if (N == 1) {
            System.out.println("*");
            return;
        }

        // 1번째 줄
        System.out.println(" ".repeat(N - 1) + "*");

        // 2번째 줄부터 N-1번째 줄까지
        for (int i = 2; i < N; i++) {
            System.out.println(
                " ".repeat(N - i) +
                "*" +
                " ".repeat(2 * i - 3) +
                "*"
            );
        }

        // 마지막 줄
        System.out.println("*".repeat(2 * N - 1));
    }
}
