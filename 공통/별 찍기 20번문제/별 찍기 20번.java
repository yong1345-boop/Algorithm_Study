import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star20 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            // 짝수 줄이면 앞에 공백
            if (i % 2 == 0) {
                sb.append(" ");
            }

            // 별 출력
            for (int j = 0; j < N; j++) {
                sb.append("*");
                if (j < N - 1) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
