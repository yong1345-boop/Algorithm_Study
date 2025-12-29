import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star19 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int size = 4 * N - 3;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.min(
                        Math.min(i, j),
                        Math.min(size - 1 - i, size - 1 - j)
                );

                if (layer % 2 == 0) {
                    sb.append('*');
                } else {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
