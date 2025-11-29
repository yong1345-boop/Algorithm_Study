import java.util.Scanner;

public class b028SumOfOddSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= N; i += 2) {
                sum += i;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
