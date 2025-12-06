import java.util.Scanner;

/**
 * 숫자 (BOJ 10093)
 *
 * 규칙:
 *  - 두 정수 A, B 사이에 있는 정수를 출력한다.
 *  - A, B 중 작은 값+1 부터 큰 값-1 까지를 출력한다.
 *  - 첫째 줄: 개수
 *  - 둘째 줄: 오름차순으로 숫자들 출력
 *
 * 예:
 *  A = 8, B = 14 → 사이 숫자: 9 10 11 12 13 (5개)
 */
public class b029number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        // 1) A와 B 중 작은 값, 큰 값 찾기
        long min = Math.min(A, B);
        long max = Math.max(A, B);

        // 2) 사이 숫자의 개수 (min+1 ~ max-1)
        long count = (max - min > 1) ? max - min - 1 : 0;

        System.out.println(count);

        // 3) 사이 값 출력
        if (count > 0) {
            StringBuilder sb = new StringBuilder();
            for (long i = min + 1; i < max; i++) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}
